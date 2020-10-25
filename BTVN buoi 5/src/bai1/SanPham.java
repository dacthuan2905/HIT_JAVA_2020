package bai1;

import java.util.Scanner;

public class SanPham {
    protected   int maSP;
    protected String tenSP;
    protected String tenNSX;
    protected int ngayNhap;

    public SanPham() {
    }

    public SanPham(int maSP, String tenSP, String tenNSX, int ngayNhap) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.tenNSX = tenNSX;
        this.ngayNhap = ngayNhap;
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

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public int getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(int ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm: ");
        this.maSP = sc.nextInt();
        System.out.print("Nhập tên sản phẩm: ");
        sc.nextLine();
        this.tenSP = sc.nextLine();
        System.out.print("Nhập tên hãng sản xuất: ");
        this.tenNSX = sc.nextLine();
        System.out.print("Nhập ngày nhập: ");
        this.ngayNhap = sc.nextInt();
    }
    public void Xuat(){
        System.out.printf("%20d %30s %30s %15d", this.maSP, this.tenSP, this.tenNSX, this.ngayNhap);
    }
}
