package bai1;

import java.util.Scanner;

public class SACH {
    private int maSach;
    private String tenSach;
    private String NXB;
    private int soTrang;
    private float giaTien;

    public SACH(){

    }

    public SACH(int maSach, String tenSach, String NXB, int soTrang, float giaTien) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.NXB = NXB;
        this.soTrang = soTrang;
        this.giaTien = giaTien;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public float getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(float giaTien) {
        this.giaTien = giaTien;
    }
    public void Input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma sach: ");
        this.maSach=sc.nextInt();
        System.out.println("Nhap ten sach: ");
        sc.nextLine();
        this.tenSach=sc.nextLine();
        System.out.println("Nhap nha xuat ban: ");
        this.NXB=sc.nextLine();
        System.out.println("Nhap so trang: ");
        this.soTrang= sc.nextInt();
        System.out.println("Nhap gia tien: ");
        this.giaTien= sc.nextFloat();
    }
    public void Show(){
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("NXB:" + NXB );
        System.out.println("So trang: " + soTrang);
        System.out.println("Gia tien: " + giaTien);
    }
}
