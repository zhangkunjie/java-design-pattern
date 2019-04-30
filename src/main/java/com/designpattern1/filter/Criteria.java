package com.designpattern1.filter;

import java.util.List;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 上午11:53
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}