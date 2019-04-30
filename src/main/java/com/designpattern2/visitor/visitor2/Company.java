package com.designpattern2.visitor.visitor2;
//��������ߣ�Visitor��
//���ã������ڲ��ı�һ��������Ԫ�ص��������£������µ�ʩ���ڸ�Ԫ���ϵ��²�����
//���Խ������и���Ԫ�ص�ĳЩ�������е��������У��������ڼ��ϵ�ά����Ҳ�����ڼ�����Ԫ�صĸ��á�
public class  Company implements Visitor{
    public void visit(Undergraduate stu){
          double math=stu.getMath();
          double english=stu.getEnglish();
          if(math>80&&english>90)
              System.out.println(stu.getName()+"��¼��"); 
    }
    public void visit(GraduateStudent stu){
         double math=stu.getMath();
         double english=stu.getEnglish();
         double physics=stu.getPhysics();
         if(math>80&&english>90&&physics>70)
              System.out.println(stu.getName()+"��¼��"); 
    }
}
