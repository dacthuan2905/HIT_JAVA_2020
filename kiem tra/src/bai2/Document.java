package bai2;

import java.util.Scanner;

public abstract class Document {
    private int id;
    private String name;
    private String NSX;
    private float giaBan;

    public Document() {
    }

    public Document(int id, String name, String NSX, float giaBan) {
        this.id = id;
        this.name = name;
        this.NSX = NSX;
        this.giaBan = giaBan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNSX() {
        return NSX;
    }

    public void setNSX(String NSX) {
        this.NSX = NSX;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }
    public  void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma sach: ");
        this.id=sc.nextInt();
        System.out.println("Nhap ten sach: ");
        sc.nextLine();
        this.name=sc.nextLine();
        System.out.println("Nhap NSX: ");
        this.NSX=sc.nextLine();
        System.out.println("Nhap gia ban: ");
        this.giaBan=sc.nextFloat();
    }
    public void Xuat(){
        System.out.println(" Ma sach: " + id);
        System.out.println(" Ten sach: " + name);
        System.out.println(" Ten NSX: " + NSX);
        System.out.println(" Gia ban: " + giaBan);
    }

    public abstract void Input();

    public abstract void Show();
}
