package demo;

import java.util.ArrayList;
import java.util.List;

public class RunMain {
    public static void main(String[] args) {
        Nguoi nguoi=new SinhVien();
        nguoi.DiaChi();
        nguoi=new CongNhan();
        nguoi.DiaChi();
        List<SinhVien> list=new ArrayList<>();

    }
}
