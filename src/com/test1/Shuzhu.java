package com.test1;



import java.lang.reflect.Array;

public class Shuzhu {


    public static void main(String []args){
    //定义一个可以存放float类型的数组
    /*float arr[] = new float[6];

    //给数组的各个元素赋值
    arr[0]=3;
    arr[1]=2;
    arr[2]=1;
    arr[3]=3.4f;
    arr[4]=2;
    arr[5]=50;

    //计算总体重
    float AddStr = 0;
    for(int i = 0;i<6;i++){
       AddStr += arr[i];
    }

    System.out.println("平均每只🐔的体重为"+AddStr/arr.length);  */


  /*  int arr1[] = new  int[5];

    //如果你访问的数组范围越界了

      //  arr1[5] = 50;

        //如何知道数组的大小
        System.out.println(arr.length); */

  //滑板比赛
        float arr[] = {3,6,7.1f,1.1f,3};
        float all = 0;
        for(int i =0 ;i<arr.length;i++){
            all+=arr[i];
        }
        System.out.println("平均时间"+all/arr.length);



    }
}
