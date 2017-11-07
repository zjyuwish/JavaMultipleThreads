package FailfastExample;

import java.util.*;
//假设存在两个线程，线程1通过iterator遍历集合A中的元素，在某个时候线程2修改了集合A的结构，抛出ConcurrentModificationException异常。
public class FailFastTest {
    private static List<Integer> list = new ArrayList<Integer>();  
    
    /** 
     * @desc:线程one迭代list 
     * @Project:test 
     * @file:FailFastTest.java 
     * @Authro:chenssy 
     * @data:2014年7月26日 
     */  
    private static class threadOne extends Thread{  
        public void run() {  
            Iterator<Integer> iterator = list.iterator();  
            while(iterator.hasNext()){  
                int i = iterator.next();  
                System.out.println("ThreadOne 遍历:" + i);  
                try {  
                    Thread.sleep(10);  
                } catch (InterruptedException e) {  
                    e.printStackTrace();  
                }  
            }  
        }
    }
    private static class threadTwo extends Thread{  
        public void run(){  
            int i = 0 ;   
            while(i < 6){  
                System.out.println("ThreadTwo run：" + i);  
                if(i == 3){  
                    list.remove(i);  
                }  
                i++;  
            }  
        }  
    }  
      
    public static void main(String[] args) {  
        for(int i = 0 ; i < 10;i++){  
            list.add(i);  
        }  
        new threadOne().start();  
        new threadTwo().start();  
    }  
}
