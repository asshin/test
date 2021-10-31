package com.wang.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.applet.Main;

import java.util.ArrayList;

public class test {

   public static void main(String[] args) {
      for (int i = 0; i < 60; i++) {
         System.out.println(i);
      }
         ApplicationContext applicationContext =new ClassPathXmlApplicationContext("test.xml");
         Fruit book = applicationContext.getBean("fruit", Fruit.class);
         System.out.println(book.toString());
      ArrayList<Integer> integers = new ArrayList<>();
      integers.add(4);
      integers.add(3);
      integers.add(12);




   }


//    @Test
//     public  void  test1(int m){
//        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("test.xml");
//        Fruit book = applicationContext.getBean("fruit", Fruit.class);
//
//        System.out.println("m = " + m);
//        System.out.println("test.test1");
//        System.out.println("book = " + book);
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(11);
//
//
//           System.out.println(book.toString());
//
//
//
//
//
//
//
//
//
//
//
//
//    }



}
