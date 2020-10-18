package bai4;

import java.util.Scanner;

public class PhongMay {
    private String Maphong;
    private String TenPhong;
    private int dienTich;
    private QuanLi x = new QuanLi();
    private MAY[] y;
    private int n;

    public PhongMay() {

    }

    public PhongMay(String maphong, String tenPhong, int dienTich, QuanLi x, MAY[] y, int n) {
        Maphong = maphong;
        TenPhong = tenPhong;
        this.dienTich = dienTich;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public String getMaphong() {
        return Maphong;
    }

    public void setMaphong(String maphong) {
        Maphong = maphong;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String tenPhong) {
        TenPhong = tenPhong;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public QuanLi getX() {
        return x;
    }

    public void setX(QuanLi x) {
        this.x = x;
    }

    public MAY[] getY() {
        return y;
    }

    public void setY(MAY[] y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        y = new MAY[n];

        for (int i = 0; i < y.length; i++) {
            y[i] = new MAY();
            System.out.print("Nhap vao ma phong: ");
            Maphong = sc.nextLine();
            sc.nextLine();
            System.out.print("Nhap vao ten phong: ");
            TenPhong = sc.nextLine();
            y[i].Nhap();
            x.Nhap();

        }
    }public void Show(){
        for (int i=0;i< y.length;i++){
            System.out.println("Ma phong: " + Maphong);
            System.out.println("Ten phong: " + TenPhong);
            y[i].toString();
            x.toString();
        }
    }
}
