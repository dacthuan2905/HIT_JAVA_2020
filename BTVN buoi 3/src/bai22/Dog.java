package bai22;

import java.util.Scanner;

public class Dog {
    private String name;
    private int MP=100;

    public Dog(){}
    public void InputName(String name){
        this.name=name;

    }
    public void ShowMP(){
        System.out.println("MP: " +MP);
    }
    public void Bark(){
        if(this.name==""){
            System.out.println("xin loõi bạn chưa điền tên");
        }else{
            System.out.println(this.name + " sủa");
            this.MP -=20;

        }
    }

}
