package com.designpattern2.memento.memento2;

//ԭ���ߣ�Originator��
import java.io.*;
public class ReadPhrase implements Serializable{
     long readPosition;     //���ļ��еĶ�ȡ��λ��
     File file;
     RandomAccessFile in;
     String phrase=null; 
     public ReadPhrase(File file){
        this.file=file;
        try{ 
              in=new RandomAccessFile(file,"r");
        }
        catch(IOException exp){ }
    } 
    public Memento createMemento(){
          Memento mem=new Memento();
          mem.setPositionState(readPosition);
          return mem;
    }
    public void restoreFromMemento(Memento mem){
         readPosition=mem.getPositionState();
   }
    public String readLine(){
         try{     in.seek(readPosition); 
                    phrase=in.readLine();
                    if(phrase!=null){
                       byte b[]= phrase.getBytes("iso-8859-1");
                       phrase=new String(b);         
                   }
                   readPosition=in.getFilePointer();    //��ȡ��ǰ�Ķ�ȡλ��
         }
         catch(IOException exp){}
         return phrase;
    }
    public void closeRead(){
         try{   in.close();
         }
         catch(IOException exp){ }
    }
}
