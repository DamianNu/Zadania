package com.example.zadania;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Find(10,100,12);

    }

    public static ArrayList<Integer> Find (int a,int b,int x){
        ArrayList<Integer> list = new ArrayList<>();
        if(a>b){
            int number=0;
            for(int i=0;i<a-b+1;i++){
                number =(b+i)%x;
                if(number==0){
                    list.add(b+i);
                }
            }
        }else if(b>a) {
            int number=0;
            for(int i=0;i<b-a+1;i++){
                number = (a+i)%x;
                if(number==0){
                    list.add(a+i);
                }
            }
        } else {
            if(a%x==0){
                list.add(a);
            }
        }

        System.out.println(list);
       return list;
    }
}
