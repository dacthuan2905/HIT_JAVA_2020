package bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Phieu {
    private int maPhieu;
    private String tenPhieu;
    private Date a;
    private ArrayList<SanPham> x = new ArrayList<>();
    private int n;

    public Phieu() {
    }

    public Phieu(int maPhieu, String tenPhieu, Date a, int n) {
        this.maPhieu = maPhieu;
        this.tenPhieu = tenPhieu;
        this.a = a;
        this.n = n;
    }

    public int getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(int maPhieu) {
        this.maPhieu = maPhieu;
    }

    public String getTenPhieu() {
        return tenPhieu;
    }

    public void setTenPhieu(String tenPhieu) {
        this.tenPhieu = tenPhieu;
    }

    public Date getA() {
        return a;
    }

    public void setA(Date a) {
        this.a = a;
    }

    public ArrayList<SanPham> getX() {
        return x;
    }

    public void setX(ArrayList<SanPham> x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma phieu: ");
        this.maPhieu = sc.nextInt();
        System.out.print("Nhap ten phieu: ");
        sc.nextLine();
        this.tenPhieu = sc.nextLine();
        System.out.println("Nhap thoi gian");
        a = new Date();
        this.a.Nhap();
        System.out.print("Nhap so san pham: ");
        this.n = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap danh sach san pham");
        for(int i = 0; i < this.n; i++){
            System.out.println("Nhap san pham thu " + (i + 1) + ":");
            SanPham sp = new SanPham();
            sp.Input();
            x.add(sp);
        }
    }

    public void xuat(){
        System.out.println("Ma phieu: " + getMaPhieu());
        System.out.println("Ten phieu: " + getTenPhieu());
        System.out.print("Thoi gian: ");
        a.toString();
        System.out.printf("%5s %20s %20s %15s %15s %15s\n", "STT", "Ma SP", "Ten SP", "So luong", "Đon gia", "Thanh tien");
        for(int i = 0; i < x.size(); i++){
            System.out.printf("%5d", (i + 1));
            x.get(i).Show();
        }

    }
}
