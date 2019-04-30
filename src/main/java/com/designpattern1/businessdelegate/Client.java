package com.designpattern1.businessdelegate;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午8:03
 */
public class Client {
    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService) {
        this.businessService = businessService;
    }

    public void doTask() {
        businessService.doTask();
    }
}
