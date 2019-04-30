package com.designpattern2.bridge.bridge1;
//ϸ��ʵ����
public  class  BuildingCost extends ArchitectureCost{
    BuildingCost(BuildingDesign  design,double unitPrice){
           this.design=design;
           this.unitPrice=unitPrice;
    }
    public  double giveCost() {
          double area=design.computerArea();
          return area*unitPrice;
    }
}   
