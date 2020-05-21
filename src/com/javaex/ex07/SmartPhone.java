package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
    	
    	 if("앱".equals(str)){
             playApp();
         }else{
             super.execute(str);
         }
    }
    
    
    public void playApp(){
         System.out.println("앱실행");
    }
    
    public void playMusic(){
        System.out.println("Mp3플레이어에서 음악재생");
    }
        
}
 
    
