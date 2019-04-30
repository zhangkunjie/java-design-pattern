package com.designpattern2.builder.builder2;
//����������
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConcreteBuilderOne implements Builder{
    private PanelProduct panel;       //��Ҫ����������
    ConcreteBuilderOne(){
          panel=new PanelProduct();
    } 
    public void buildButton(){
          panel.button=new JButton("��ť");
    }
    public void buildLabel(){
         panel.label=new JLabel("��ǩ");
    }
    public void buildTextField(){
         panel.textField=new JTextField("�ı���");
    }
    public JPanel  getPanel(){
         panel.add(panel.button); //��ConcreteBuilderTwo��������˳��Ĳ�ͬ
         panel.add(panel.label);
         panel.add(panel.textField);
         return panel;
    }
} 
