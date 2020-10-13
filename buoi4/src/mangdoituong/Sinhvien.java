package mangdoituong;

import java.util.Scanner;

public class Sinhvien {
    private String maSinhVien;
    private String hoTen;
    private date ngaySinh;

    public Sinhvien(){

    }
    public void Hienthi(){
        System.out.println("Ten la: " + hoTen);
        System.out.println("Ma SV la: " + maSinhVien);
        System.out.println(ngaySinh.toString());
    }
public void Hienthi(int stt){

}
    public Sinhvien(String maSinhVien, String hoTen) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
    }

    public Sinhvien(date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void Input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma SV: ");
        this.maSinhVien=sc.nextLine();
        System.out.println("Nhap ho ten: ");
        this.hoTen=sc.nextLine();
        System.out.println("Nhap thong tin ngay sinh:" );
        ngaySinh =new date();
        ngaySinh.Inputdate();


    }
}
