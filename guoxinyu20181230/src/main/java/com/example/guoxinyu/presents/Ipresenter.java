package com.example.guoxinyu.presents;



import java.util.Map;

public interface Ipresenter {
    /**
     * post
     * */
    void startRequest(String url, Map<String, String> map, Class clazz);
    /**
     * get
     * */
    void getRequest(String url,Class clazz);
}
