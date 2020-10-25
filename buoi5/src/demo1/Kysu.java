package demo1;

import java.util.Scanner;

public class Kysu extends Person{
    private String Nganh;
    private int namTn;

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String nganh) {
        Nganh = nganh;
    }

    public int getNamTn() {
        return namTn;
    }

    public void setNamTn(int namTn) {
        this.namTn = namTn;
    }

    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen=sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaySinh= sc.nextInt();
        System.out.println("Nhap que quan: ");
        sc.nextLine();
        queQuan=sc.nextLine();
        System.out.println("Nhap nganh: ");
        Nganh= sc.nextLine();
        System.out.println("Nhap nam TN: ");
        namTn= sc.nextInt();

    }
    public void Xuat(){
        System.out.println("Ho ten: " + hoTen);
        System.out.println("ngay sinh: " + ngaySinh);
        System.out.println("Que quan: " + queQuan);
        System.out.println("Nganh: " + Nganh);
        System.out.println("Nam TN: " + namTn);
    }


}
