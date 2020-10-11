package bai3;

public class HangHoa {
    private int MaHang;
    private String TenHang;
    private float DonGia;
    private int SoLuong;

    public int getMaHang() {
        return MaHang;
    }

    public void setMaHang(int maHang) {
        MaHang = maHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String tenHang) {
        TenHang = tenHang;
    }

    public float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float donGia) {
        DonGia = donGia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }
public HangHoa(){}
    public HangHoa(int maHang, String tenHang, float donGia, int soLuong) {
        MaHang = maHang;
        TenHang = tenHang;
        DonGia = donGia;
        SoLuong = soLuong;
    }

    public void Xuat(){
        System.out.println("Mã hàng: " + this.getMaHang());
        System.out.println("Tên hàng: " + this.getTenHang());
        System.out.println("Đơn giá: " + this.getDonGia());
        System.out.println("Số lượng: " + this.getSoLuong());
        System.out.println("Thành tiền: " + this.getDonGia() * this.getSoLuong());
        System.out.println("Thành tiền: " + this.DonGia*this.SoLuong);

    }
}
