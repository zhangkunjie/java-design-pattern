package com.designpattern2.strategy.strategy2;
//������ԣ��㷨1:����ƽ��ֵ
public class StrategyOne implements ComputableStrategy{
    public double computeScore(double [] a){
        double score=0,sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        score=sum/a.length;
        return score; 
    }
}
