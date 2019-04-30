package com.designpattern1.interceptingfilter;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午8:35
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }
}
