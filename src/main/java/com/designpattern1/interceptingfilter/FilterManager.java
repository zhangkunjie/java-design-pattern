package com.designpattern1.interceptingfilter;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午8:35
 */
public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target) {
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request) {
        filterChain.execute(request);
    }
}
