package demo1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Kysu>list=new ArrayList<>();
        int n;
        System.out.printf("Nhap so ki su: ");
        n=sc.nextInt();
        int max;

        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin ki su thu" + (i+1) +":");
            Kysu k1= new Kysu();
            k1.Nhap();
            list.add(k1);
        }

        System.out.println("---------Thong tin ki su---------- ");
        for (Kysu x:list){
            x.Xuat();
        }
        max = list.get(0).getNamTn();

        for (int i=0;i<n;i++){
            if(list.get(i).getNamTn()>max) {
                max = list.get(i).getNamTn();
            }

        }
        System.out.println("---------Thong tin ki su---------- ");
        for (Kysu x:list){
            if(x.getNamTn()==max)
            x.Xuat();
        }

    }

}
