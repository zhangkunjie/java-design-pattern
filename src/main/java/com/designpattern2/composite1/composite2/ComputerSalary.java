package com.designpattern2.composite1.composite2;

//模式的使用
import java.util.*;
public class ComputerSalary{
     public static double computerSalary(MilitaryPerson person) throws NoSuchMethodException{
           double sum=0;
           if(person.isLeaf()==true){
                sum=sum+person.getSalary();
           }
           if(person.isLeaf()==false){
                sum=sum+person.getSalary();
                Iterator<MilitaryPerson> iterator=person.getAllChildren();
                while(iterator.hasNext()){
                             MilitaryPerson p= iterator.next();
                             sum=sum+computerSalary(p);;
                }
           }
           return sum;
    }
}
