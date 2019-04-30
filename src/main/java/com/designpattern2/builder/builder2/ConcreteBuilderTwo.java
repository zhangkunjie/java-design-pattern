package com.designpattern2.builder.builder2;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
//����������
public class ConcreteBuilderTwo implements Builder{
    private PanelProduct panel;       //��Ҫ����������
    ConcreteBuilderTwo(){
          panel=new PanelProduct();
    } 
    public void buildButton(){
          panel.button=new JButton("button");
    }
    public void buildLabel(){
         panel.label=new JLabel("label");
    }
    public void buildTextField(){
         panel.textField=new JTextField("textField");
    }
    public JPanel  getPanel(){
          panel.add(panel.textField);//��ConcreteBuilderOne��������˳��Ĳ�ͬ
          panel.add(panel.label);
          panel.add(panel.button);
          return panel;
    }
}
