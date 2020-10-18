package bai3;

import java.util.Scanner;

public class Hang {


    private String maHang;
    private String tenHang;
    private float donGia;

    public Hang() {
    }

    public Hang(String maHang, String tenHang, float donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hang: ");
        this.maHang = sc.nextLine();
        System.out.print("Nhap ten hang: ");
        this.tenHang = sc.nextLine();
        System.out.print("Nhap don gia: ");
        this.donGia = sc.nextFloat();
    }

    @Override
    public String toString() {
        return "Hang{" +
                "maHang='" + maHang + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", donGia=" + donGia +
                '}';
    }
}

