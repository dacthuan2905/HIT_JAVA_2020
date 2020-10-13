package buoi3;

public class SINHVIEN {
   private int maSinhVien=0;
   private String hoTen;
   private String diaChi;

   public SINHVIEN() {
      maSinhVien++;
   }

   public SINHVIEN(int maSinhVien, String hoTen, String diaChi) {
      this.maSinhVien = maSinhVien;
      this.hoTen = hoTen;
      this.diaChi = diaChi;
   }
}

//   public String getMaSinhVien() {
//      return maSinhVien;
//   }
//
//   public void setMaSinhVien(String maSinhVien) {
//      this.maSinhVien = maSinhVien;
//   }
//
//   public String getHoTen() {
//      return hoTen;
//   }
//
//   public void setHoTen(String hoTen) {
//      this.hoTen = hoTen;
//   }
//
//   public String getDiaChi() {
//      return diaChi;
//   }
//
//   public void setDiaChi(String diaChi) {
//      this.diaChi = diaChi;
//   }
//}
//


