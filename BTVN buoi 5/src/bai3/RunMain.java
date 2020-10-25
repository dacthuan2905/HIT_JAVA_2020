package bai3;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Phieu p=new Phieu();
        p.nhap();
        System.out.println("-------------THONG TIN-----------");
        p.xuat();

        float S=0;
        for (int i=0;i<p.getN();i++){
            S=p.getX().get(i).getDonGia() * p.getX().get(i).getSoLuong();
        }
        System.out.println("thanh tien: " + S);
    }


}
