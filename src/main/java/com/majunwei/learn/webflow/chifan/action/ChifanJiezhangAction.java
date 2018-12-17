package com.majunwei.learn.webflow.chifan.action;

import com.majunwei.learn.webflow.gohome.domain.GoHomeDomain;
import com.majunwei.learn.webflow.gohome.service.GoHomeService;
import org.springframework.stereotype.Component;
import org.springframework.webflow.action.AbstractAction;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;

import java.util.List;

@Component
public class ChifanJiezhangAction extends AbstractAction {
    @Override
    protected Event doExecute(RequestContext requestContext) throws Exception {
        GoHomeDomain goHomeDomain = (GoHomeDomain)requestContext.getConversationScope().get("goHomeDomain");

        List<String> actionLogs = (List<String>)requestContext.getConversationScope().get("actionLogs");
        actionLogs.add(GoHomeService.getCurrentTime() + "在【" + goHomeDomain.getCurrentLocation() + "】【吃完饭结账】");

        return result(goHomeDomain.getCurrentLocation());
    }
}
