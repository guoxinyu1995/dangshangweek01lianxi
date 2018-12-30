package com.example.guoxinyu.presents;

import com.example.guoxinyu.model.ModelImpl;
import com.example.guoxinyu.model.MyCallBack;
import com.example.guoxinyu.view.Iview;

import java.util.Map;

public class PresenterImpl implements Ipresenter {
    private Iview mIview;
    private ModelImpl model;

    public PresenterImpl(Iview iview) {
        mIview = iview;
        model = new ModelImpl();
    }
    /**
     * post
     * */
    @Override
    public void startRequest(String url, Map<String, String> map, Class clazz) {
        model.requestData(url, map, clazz, new MyCallBack() {
            @Override
            public void onSuccess(Object data) {
                mIview.requestData(data);
            }
            @Override
            public void onFail(String error) {
                mIview.requestFail(error);
            }
        });
    }
    /**
     * get
     * */
    @Override
    public void getRequest(String url, Class clazz) {

    }

    public void onDetach(){
        if (model!=null){
            model = null;
        }
        if(mIview!=null){
            mIview = null;
        }
    }
}
