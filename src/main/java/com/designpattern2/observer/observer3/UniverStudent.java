package com.designpattern2.observer.observer3;

//����۲�����
import java.io.*;
public class UniverStudent implements Observer{
   Subject subject;
   File myFile;  
   UniverStudent(Subject subject,String fileName){
      this.subject=subject;
      subject.addObserver(this);     //ʹ��ǰʵ����Ϊsubject�����õľ�������Ĺ۲���
      myFile=new File(fileName);
   }
   public void hearTelephone(String heardMess){
      try{ RandomAccessFile out=new RandomAccessFile(myFile,"rw");  
           out.seek(out.length());
           byte [] b=heardMess.getBytes();
           out.write(b);                               //�����ļ��е�����
           System.out.print("����һ����ѧ��,"); 
           System.out.println("�����ļ�"+myFile.getName()+"д����������:");
           System.out.println(heardMess); 
      }
      catch(IOException exp){
          System.out.println(exp.toString());
      }
  } 
}
