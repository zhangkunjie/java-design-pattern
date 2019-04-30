package com.designpattern2.flyweight.flyweight1;

import java.util.HashMap;

public class FlyweightFactroy{
    private HashMap<String,Flyweight>  hashMap;
    static  FlyweightFactroy factroy=new FlyweightFactroy();
    private FlyweightFactroy(){
          hashMap=new HashMap<String,Flyweight>();
    }
    public static FlyweightFactroy getFactroy(){
          return factroy;
    }
    public synchronized Flyweight getFlyweight(String key){
         if(hashMap.containsKey(key))
                    return hashMap.get(key);
         else{ 
                   double width=0,height=0,length=0;
                   String [] str=key.split("#");
                   width=Double.parseDouble(str[0]);
                   height=Double.parseDouble(str[1]);
                   length=Double.parseDouble(str[2]);
                   Flyweight ft=new ConcreteFlyweight(width,height,length);
                   hashMap.put(key,ft);
                   return ft;
         } 
    }
}