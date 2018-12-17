package com.majunwei.learn.webflow.gohome.action;

import com.majunwei.learn.webflow.gohome.domain.GoHomeDomain;
import org.springframework.stereotype.Component;
import org.springframework.webflow.action.AbstractAction;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;

/**
 * 出发
 */
@Component
public class JiayouAction extends AbstractAction {

    @Override
    protected Event doExecute(RequestContext requestContext) throws Exception {
        GoHomeDomain goHomeDomain = (GoHomeDomain)requestContext.getConversationScope().get("goHomeDomain");
        goHomeDomain.setRemainingOil(goHomeDomain.getMaxRemainingOil());

        return success();
    }

}
