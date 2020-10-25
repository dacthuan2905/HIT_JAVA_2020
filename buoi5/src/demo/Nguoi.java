package demo;

import java.util.Scanner;

public class Nguoi {
    private String theCanCucc;
    private String hoTen;
    private String gioitTinh;

    public Nguoi() {
    }

    public Nguoi(String theCanCucc, String hoTen, String gioitTinh) {
        this.theCanCucc = theCanCucc;
        this.hoTen = hoTen;
        this.gioitTinh = gioitTinh;
    }
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap the can cuoc: ");
        theCanCucc=sc.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen=sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gioitTinh=sc.nextLine();

    }
    public void xuat(){
        System.out.println("Nhap the can cuoc: " + theCanCucc);

        System.out.println("Nhap ho ten: " + hoTen);

        System.out.println("Nhap gioi tinh: " + gioitTinh);
    }


}
