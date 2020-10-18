package bai4;

import java.util.Scanner;

public class QuanLi {
    private String maQL;
    private String hoTen;

    public QuanLi(){

    }

    public QuanLi(String maQL, String hoTen) {
        this.maQL = maQL;
        this.hoTen = hoTen;
    }

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Override
    public String toString() {
        return "QuanLi{" +
                "maQL='" + maQL + '\'' +
                ", hoTen='" + hoTen + '\'' +
                '}';
    }
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma quan li: ");
        this.maQL= sc.nextLine();
        System.out.println("Nhap ho ten: ");
        this.hoTen=sc.nextLine();

    }
}
