package bai3;

public class RunMain {
    public static void main(String[] args){
        HangHoa hanghoa1 = new HangHoa(29052001,"Thuận",500000,1);
        HangHoa hanghoa2 = new HangHoa();
        int s=0;
        int s2=0;
        hanghoa2.setMaHang(18082010);
        hanghoa2.setTenHang("HIT club");
        hanghoa2.setSoLuong(1);
        hanghoa2.setDonGia(3000);
        System.out.println("=======Thong tin don hang 1========");
        hanghoa1.Xuat();

        System.out.println("=======Thong tin don hang 2========");
        hanghoa2.Xuat();

    }
}
