package com.designpattern2.pxoxy.proxy1;

//����ģ�壨Concrete Template��
public class Triangle implements Geometry {
      double sideA,sideB,sideC,area;
      public  Triangle(double a,double b,double c) {
            sideA=a;
            sideB=b;
            sideC=c;
     }
     public double  getArea(){ 
            double p=(sideA+sideB+sideC)/2.0;
            area=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC)) ;
            return area;
    }
} 
