package com.designpattern2.memento.memento2;
import java.util.Scanner;
import java.io.*;
//ģʽ��ʹ��
public class Application{
     public static void main(String args[]) {
            Scanner reader=new Scanner(System.in);
            ReadPhrase  readPhrase=new ReadPhrase(new File("phrase.txt"));
            File favorPhrase=new File("favorPhrase.txt");
            RandomAccessFile out=null;
            try{    
            	out=new RandomAccessFile(favorPhrase,"rw");
            }
            catch(IOException exp){}
            System.out.println("�Ƿ���ϴζ�ȡ��λ�ü�����ȡ�������y��n��");
            String answer=reader.nextLine();
            if(answer.startsWith("y")||answer.startsWith("Y")){
                  Caretaker  caretaker=new Caretaker();
                  Memento memento=caretaker.getMemento();     //�õ�����¼
                  if(memento!=null)
                    readPhrase.restoreFromMemento(memento);  //��readPhrase�ָ�������¼�����洢��״̬
            }
            String phrase=null;
            while((phrase=readPhrase.readLine())!=null){
                 System.out.println(phrase);
                 System.out.println("�Ƿ񽫸ó��ﱣ�浽"+favorPhrase.getName()+"(����y��n)");
                 answer=reader.nextLine();
                 if(answer.startsWith("y")||answer.startsWith("Y")){
                       try{     out.seek(favorPhrase.length());
                                   byte [] b=phrase.getBytes();
                                   out.write(b); 
                                   out.writeChar('\n');
                      }
                      catch(IOException exp){}
                 }
                 System.out.println("�Ƿ������ȡ���(����y��n)");
                 answer=reader.nextLine();
                 if(answer.startsWith("y")||answer.startsWith("Y"))
                     continue;
                 else{
                      readPhrase.closeRead();
                      Caretaker  caretaker=new Caretaker();
                      caretaker.saveMemento(readPhrase.createMemento());   //������¼���浽�ļ���
                      try{  
                    	  out.close();
                      } 
                      catch(IOException exp){}
                      System.exit(0);
                 }     
           }
           System.out.println("����ȫ������");
     }
} 
