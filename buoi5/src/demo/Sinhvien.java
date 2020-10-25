package demo;

import java.util.Scanner;

public class Sinhvien  extends Nguoi{
    private String maSV;
    private String nganhHoc;

    public void NHaP(){
        Scanner sc=new Scanner(System.in);
        super.Nhap();

        System.out.println("nhap ma sv:");
        maSV=sc.nextLine();
        System.out.println("nhap nganh hoc: ");
        nganhHoc=sc.nextLine();

    }
    public void Xuat(){

        super.xuat();
        System.out.println("nhap ma sv:" + maSV);

        System.out.println("nhap nganh hoc: " + nganhHoc);

    }
}
