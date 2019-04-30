package com.designpattern1.iterator;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午5:09
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
