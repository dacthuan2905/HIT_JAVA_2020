package bai3;

import java.util.Scanner;

public class SanPham {
    private int maSP;
    private String tenSP;
    private int soLuong;
    private float donGia;

    public SanPham() {
    }

    public SanPham(int maSP, String tenSP, int soLuong, float donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
    public void Input(){
        Scanner sc=new Scanner(System.in);
        System.out.println(" Nhap ma SP: ");
        this.maSP=sc.nextInt();
        System.out.println("Nhap ten SP: ");
        sc.nextLine();
        this.tenSP=sc.nextLine();
        System.out.println("Nhap so luong: ");
        this.soLuong=sc.nextInt();
        System.out.println("Nhap gia: ");
        this.donGia=sc.nextFloat();

    }
    public void Show(){
        System.out.printf("%10d %20s %10d %15f\n",this.maSP,this.tenSP,this.soLuong,this.donGia);
    }
}
