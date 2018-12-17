package com.majunwei.learn.webflow.gohome.action;

import com.majunwei.learn.webflow.gohome.domain.GoHomeDomain;
import com.majunwei.learn.webflow.gohome.service.GoHomeService;
import org.springframework.stereotype.Component;
import org.springframework.webflow.action.AbstractAction;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;

import java.util.List;

/**
 * 收拾东西
 */
@Component
public class ShoushidongxiAction extends AbstractAction {

    @Override
    protected Event doExecute(RequestContext requestContext) throws Exception {
        GoHomeDomain goHomeDomain = (GoHomeDomain)requestContext.getConversationScope().get("goHomeDomain");
        goHomeDomain.getSomethings().add("something" + System.currentTimeMillis());

        List<String> actionLogs = (List<String>)requestContext.getConversationScope().get("actionLogs");
        actionLogs.add(GoHomeService.getCurrentTime() + "从家【拿了点东西】");

        return success();
    }

}
