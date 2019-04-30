package com.designpattern1.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 上午11:54
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}