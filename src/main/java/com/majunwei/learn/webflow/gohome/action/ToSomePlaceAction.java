package com.majunwei.learn.webflow.gohome.action;

import com.majunwei.learn.webflow.gohome.domain.GoHomeDomain;
import com.majunwei.learn.webflow.gohome.service.GoHomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.webflow.action.AbstractAction;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;

import java.util.List;

public abstract class ToSomePlaceAction extends AbstractAction {

    Logger logger = LoggerFactory.getLogger(getClass());

    protected abstract String getCurrentLocation();
    @Override
    protected Event doExecute(RequestContext requestContext) throws Exception {
        GoHomeDomain goHomeDomain = (GoHomeDomain)requestContext.getConversationScope().get("goHomeDomain");
        if((goHomeDomain.getRemainingOil() - goHomeDomain.getMixRemainingOil()) < 20){
            logger.warn("油不够了！");
            requestContext.getFlashScope().put("msg","油不够了,快去加油吧！");
            return error();
        }

        goHomeDomain.setRemainingOil(goHomeDomain.getRemainingOil() - 20); //蚝油
        goHomeDomain.setCurrentLocation(getCurrentLocation());


        List<String> actionLogs = (List<String>)requestContext.getConversationScope().get("actionLogs");
        actionLogs.add(GoHomeService.getCurrentTime() + "到达【" + getCurrentLocation() + "】");
        return success();
    }
}
