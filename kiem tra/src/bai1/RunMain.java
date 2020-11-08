package bai1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a="bn01da6d47";
        int dem=0,y=0,x=1,tich=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)<97) {
                dem++;
                System.out.println(String.valueOf(a.charAt(i)));
                int s = (int) a.charAt(i);
                y += s - 48;


            }
        }
        for(int i=0;i<a.length();i++){
            if(Character.isDigit(a.charAt(i))){
                int b=Integer.parseInt(String.valueOf(a.charAt(i)));
                if(b !=0)
                    if(y%b==0)
                        x*=b;
            }
        }
        System.out.println(y);
        System.out.println("Co " + dem + " ki tu va tich= " + x);


    }


}
