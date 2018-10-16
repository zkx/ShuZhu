/*
* 功能：对象数组的使用
* */
package com.test1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Shuzhu2 {

    //异常抛出  throws Exception
    public static void main(String args[])throws Exception{

        //定义一个对象数组  可以存放四只狗

        Dog dogs[] = new Dog[4];

        //给各个狗赋值
        /*dogs[0] = new Dog();
        dogs[0].setName("花花");
        dogs[0].setAge(18);*/

        //从控制台输入各个狗的信息
        InputStreamReader isr = new InputStreamReader(System.in);
        //转换为buffer流
        BufferedReader br = new BufferedReader(isr);

        for(int i=0;i<dogs.length;i++){

            //使用的时候一定要new
            dogs[i]=new Dog();
            System.out.println("请输入第"+(i+1)+"狗名称");

            //从控制台读取狗名
            String name = br.readLine();
            //异常  1.编译异常 2.运行异常 3.error

            //将名字赋给对象
            dogs[i].setName(name);

            System.out.println("请输入第"+(i+1)+"狗的年龄");
            String s_int = br.readLine();
            int age = Integer.valueOf(s_int).intValue(); //string ->int
            dogs[i].setAge(age);
        }

        //计算平均年龄
        //计算总年龄
        int allAge = 0;
        for(int i = 0;i<dogs.length;i++){
allAge += dogs[i].age;
        }
        System.out.println("平均体重："+ allAge/dogs.length);
    }
}


//定义一个狗类
class Dog{
    String name;
    int age;

    public void setName(String name){

        this.name = name;
    }

    public String getName(){
        return name;
    }


    public  void setAge(int age){
        this.age = age;
    }

    public  int getAge(){
        return age;
    }
}