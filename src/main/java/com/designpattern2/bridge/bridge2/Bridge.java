package com.designpattern2.bridge.bridge2;
//��
public abstract class Bridge {  
   private Sourceable source;  
  
   public void method(){  
	    source.method();  
  }  
    
    public Sourceable getSource() {  
	        return source;  
  }  

  public void setSource(Sourceable source) {  
      this.source = source;  
   }  
	}  

