package com.example.guoxinyu.model;

public interface MyCallBack<E> {
    void onSuccess(E data);
    void onFail(String error);
}
