package bai1;


import java.util.Scanner;

public class DieuHoa extends SanPham{
    private int congSuat;
    private float giaBan;

    public DieuHoa(){

    }

    public DieuHoa(int congSuat, float giaBan) {
        this.congSuat = congSuat;
        this.giaBan = giaBan;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }
    @Override
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        super.Nhap();
        System.out.println("Nhap cong suat: ");
        this.congSuat=sc.nextInt();
        System.out.println("Nhap gia ban: ");
        this.giaBan=sc.nextFloat();
        sc.nextLine();
    }
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.printf("%15d %15f\n",this.congSuat, this.giaBan);
    }
}
