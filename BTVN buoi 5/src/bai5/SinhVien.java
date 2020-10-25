package bai5;

import java.util.Scanner;

public class SinhVien extends Nguoi {
    private int maSv;
    private String Nganh;
    private int khoaHoc;

    public SinhVien() {
    }

    public SinhVien(int maSv, String nganh, int khoaHoc) {
        this.maSv = maSv;
        Nganh = nganh;
        this.khoaHoc = khoaHoc;
    }

    public SinhVien(String hoTen, String ngaySinh, String queQuan, int maSv, String nganh, int khoaHoc) {
        super(hoTen, ngaySinh, queQuan);
        this.maSv = maSv;
        Nganh = nganh;
        this.khoaHoc = khoaHoc;
    }

    public int getMaSv() {
        return maSv;
    }

    public void setMaSv(int maSv) {
        this.maSv = maSv;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String nganh) {
        Nganh = nganh;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }
    @Override
    public void Input(){
        Scanner sc=new Scanner(System.in);
        super.Nhap();
        System.out.println("Nhap ma SV: ");
        this.maSv=sc.nextInt();
        System.out.println("Nhap nganh: ");
        sc.nextLine();
        this.Nganh=sc.nextLine();
        System.out.println("Nhap khoa hoc: ");
        this.khoaHoc=sc.nextInt();
    }
    @Override
    public void Show(){
        super.toString();
        System.out.println("ma SV: "+ maSv);
        System.out.println("Nganh: " + Nganh);
        System.out.println("Khoa hoc: " + khoaHoc);
    }
}
