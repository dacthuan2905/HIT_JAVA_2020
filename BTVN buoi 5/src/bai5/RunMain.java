package bai5;

public class RunMain {
    public static void main(String[] args) {
        LopHoc lop1=new LopHoc();
        lop1.nhap();
        System.out.println(" danh sach SV k14: " + lop1.demK14());
        lop1.sapXep();
        lop1.xuat();
    }
}
