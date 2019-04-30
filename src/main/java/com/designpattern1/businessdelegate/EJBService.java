package com.designpattern1.businessdelegate;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午8:02
 */
public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}