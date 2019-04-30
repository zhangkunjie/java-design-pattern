package com.designpattern1.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 上午11:54
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}