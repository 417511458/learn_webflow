package com.majunwei.learn.webflow.gohome.action;

import com.majunwei.learn.webflow.gohome.domain.GoHomeDomain;
import org.springframework.stereotype.Component;
import org.springframework.webflow.action.AbstractAction;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;

import java.util.ArrayList;
import java.util.List;

/**
 * 出发
 */
@Component
public class GoHomeStartAction extends AbstractAction {

    @Override
    protected Event doExecute(RequestContext requestContext) throws Exception {
        GoHomeDomain goHomeDomain = new GoHomeDomain();
        requestContext.getConversationScope().put("goHomeDomain",goHomeDomain);

        List<String> actionLogs = new ArrayList<>();
        requestContext.getConversationScope().put("actionLogs",actionLogs);

        return success();
    }

}
