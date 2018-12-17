package com.majunwei.learn.webflow.gohome.service;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class GoHomeService {
    private static Map<String,String> nextLocationMap = new HashMap();
    static {
        nextLocationMap.put("Beijing","Langfang");
        nextLocationMap.put("Langfang","Dezhou");
        nextLocationMap.put("Dezhou","Jinan");
    }

    public String getNextLocation(String current){
        return nextLocationMap.get(current);
    }

    public static String getCurrentTime(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss -> ");
        return dateFormat.format(new Date());
    }
}
