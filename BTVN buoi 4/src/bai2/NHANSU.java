package bai2;

import java.util.Scanner;

public class NHANSU {
    private int maNhanSu;
    private String hoTen;
    Date ns;

    public NHANSU(){}

    public NHANSU(int maNhanSu, String hoTen, Date ns) {
        this.maNhanSu = maNhanSu;
        this.hoTen = hoTen;
        this.ns = ns;
    }

    public int getMaNhanSu() {
        return maNhanSu;
    }

    public void setMaNhanSu(int maNhanSu) {
        this.maNhanSu = maNhanSu;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNs() {
        return ns;
    }

    public void setNs(Date ns) {
        this.ns = ns;
    }
    public void Nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ma nhan su: ");
        this.maNhanSu=sc.nextInt();
        System.out.println("Nhap ho ten:");
        sc.nextLine();
        this.hoTen=sc.nextLine();
        System.out.println("Nhap thong tin ngay sinh:" );
        ns =new Date();
        ns.Input();




    }
    public void Xuat(){
        System.out.println("Ma nhan su: " + maNhanSu);
        System.out.println("Ho ten: " + hoTen);
        System.out.println(ns.toString());
    }
}
