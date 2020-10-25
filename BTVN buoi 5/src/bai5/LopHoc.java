package bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class LopHoc {
    private int maLop;
    private String tenLop;
    private String ngayMo;
    private ArrayList<SinhVien> x= new ArrayList<>();
    private int n;
    private String giaoVien;

    public LopHoc() {
    }

    public LopHoc(int maLop, String tenLop, String ngayMo, ArrayList<SinhVien> x, int n, String giaoVien) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.ngayMo = ngayMo;
        this.x = x;
        this.n = n;
        this.giaoVien = giaoVien;
    }

    public int getMaLop() {
        return maLop;
    }

    public void setMaLop(int maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getNgayMo() {
        return ngayMo;
    }

    public void setNgayMo(String ngayMo) {
        this.ngayMo = ngayMo;
    }

    public ArrayList<SinhVien> getX() {
        return x;
    }

    public void setX(ArrayList<SinhVien> x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(String giaoVien) {
        this.giaoVien = giaoVien;
    }
    public  void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ma lop hoc: ");
        this.maLop=sc.nextInt();
        System.out.println("Nhap ten lop: ");
        sc.nextLine();
        this.tenLop=sc.nextLine();
        System.out.println("Nhap ngay mo: ");
        this.ngayMo=sc.nextLine();
        System.out.println("Nhap so Sv: ");
        this.n=sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("Nhap thong tin Sv thu " + (i+1) + ":");
            SinhVien sv=new SinhVien();
            sv.Input();
            x.add(sv);
        }
        System.out.println(" NHap giao vien:");
        this.giaoVien=sc.nextLine();

    }
    public  void xuat(){
        System.out.println("---------------------------------------");
        System.out.println("Ma lop: " + maLop);
        System.out.println("Ten lop: " + tenLop);
        System.out.println("Ngya mo: " + ngayMo);
        System.out.println("----------------THONG TIN SV------------");
        for (SinhVien i:x)
            i.Show();
    }
    public int demK14() {
        int dem = 0;
        for (SinhVien i : x) {
            if (i.getKhoaHoc() == 14)
                dem++;
        }
        return dem;
    }

    public void sapXep() {
        for (int i = 0; i < x.size() - 1; i++) {
            if (x.get(i).getKhoaHoc() > x.get(i + 1).getKhoaHoc()) {
                SinhVien sv = x.get(i);
                x.set(i, x.get(i + 1));
                x.set(i + 1, sv);
            }
        }
    }

}
