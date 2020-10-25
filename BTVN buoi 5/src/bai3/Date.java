package bai3;

import java.util.Scanner;

public class Date {
    private int ngay;
    private int thang;
    private int nam;

    public Date() {
    }

    public Date(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ngay: ");
        this.ngay=sc.nextInt();
        System.out.println("Nhap thang: ");
        this.thang=sc.nextInt();
        System.out.println("Nhap nam: ");
        this.nam=sc.nextInt();

    }

    @Override
    public String toString() {
        return ngay + "/" + thang + "/" + nam;
    }
}
