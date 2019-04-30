package com.designpattern1.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 上午11:57
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}