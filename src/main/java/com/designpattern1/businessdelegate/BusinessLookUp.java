package com.designpattern1.businessdelegate;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午8:03
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}

