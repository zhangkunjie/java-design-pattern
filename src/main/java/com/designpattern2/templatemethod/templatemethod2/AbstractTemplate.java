package com.designpattern2.templatemethod.templatemethod2;

//����ģ�壨Abstract Template��
/*
 * �������Ҫ����һ���㷨�Ĺ̶����裬������Щ����ľ���ʵ������������ʵ�֡���Ҫ�Դ�������ع���
 * ���������๫����Ϊ��ȡ�������е�һ����ͬ�ĸ������Ա�������ظ���
 */
import java.io.*;
public abstract  class  AbstractTemplate{
      File [] allFiles;
      File dir;
      AbstractTemplate(File dir){
           this.dir=dir;
      }
      //������������final�ģ����Ǹ�����ָ����һ�ײ������򣬱��밴�����������ִ��
       public final void  showFileName(){
            allFiles=dir.listFiles();
            sort();
            printFiles();
      }
      //���������������������������и���ʵ����ʵ��
      public abstract void sort();
      public abstract void printFiles();
}
