package bai4;

import java.util.Scanner;

public class MAY {
    private String maMay;
    private String kieuMay;
    private String tinhTrang;
    public MAY(){

    }

    public MAY(String maMay, String kieuMay, String tinhTrang) {
        this.maMay = maMay;
        this.kieuMay = kieuMay;
        this.tinhTrang = tinhTrang;
    }

    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return "MAY{" +
                "maMay='" + maMay + '\'' +
                ", kieuMay='" + kieuMay + '\'' +
                ", tinhTrang='" + tinhTrang + '\'' +
                '}';
    }
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma may: ");
        this.maMay=sc.nextLine();
        System.out.println("Nhap kieu may: ");
        this.kieuMay= sc.nextLine();
        System.out.println("Nhap tinh trang: ");
        this.tinhTrang=sc.nextLine();
    }
}
