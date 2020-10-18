package bai3;

import java.util.Scanner;

public class Phieu {
    private String maPhieu;
    private Hang x[];
    private int n;

    public Phieu() {
    }

    public Phieu(String maPhieu, Hang[] x, int n) {
        this.maPhieu = maPhieu;
        this.x = x;
        this.n = n;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public Hang[] getX() {
        return x;
    }

    public void setX(Hang[] x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma phieu: ");
        maPhieu = sc.nextLine();
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        x = new Hang[n];

        for (int i = 0; i < this.n; i++){
            x[i] = new Hang();
            x[i].Nhap();
        }
    }
    public void Show(){
        System.out.println("Ma phieu: " + maPhieu);
        for (int i=0;i<n;i++){
            System.out.println(x[i].toString());
        }

    }
}
