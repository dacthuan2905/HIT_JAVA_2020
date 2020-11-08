package bai2;

import java.util.Scanner;

public class Book extends Document {
    private int soTrang;
    private String tacGia;

    public Book() {
    }

    public Book(int soTrang, String tacGia) {
        this.soTrang = soTrang;
        this.tacGia = tacGia;
    }

    public Book(int id, String name, String NSX, float giaBan, int soTrang, String tacGia) {
        super(id, name, NSX, giaBan);
        this.soTrang = soTrang;
        this.tacGia = tacGia;
    }
    @Override
    public void Input(){
        Scanner sc= new Scanner(System.in);
        super.Nhap();
        System.out.println("Nhap so trang: ");
        this.soTrang=sc.nextInt();
        System.out.println("Nhap tac gia: ");
        sc.nextLine();
        this.tacGia=sc.nextLine();
    }
    @Override
    public void Show(){
        super.Xuat();
        System.out.println("So trang: " + soTrang);
        System.out.println("Tac gia: " + tacGia);
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
}
