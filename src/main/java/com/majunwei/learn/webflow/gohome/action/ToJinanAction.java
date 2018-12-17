package com.majunwei.learn.webflow.gohome.action;

import org.springframework.stereotype.Component;

@Component
public class ToJinanAction extends ToSomePlaceAction {

    @Override
    protected String getCurrentLocation() {
        return "Jinan";
    }
}
