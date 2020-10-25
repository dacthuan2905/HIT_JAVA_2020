package bai2;

import java.util.Scanner;

public class SoPhuc {
    private long phanThuc;
    private long phanAo;

    public SoPhuc() {

    }

    public SoPhuc(long phanThuc, long phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public long getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(long phanThuc) {
        this.phanThuc = phanThuc;
    }

    public long getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(long phanAo) {
        this.phanAo = phanAo;
    }
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap phan thuc: ");
        this.phanThuc=sc.nextLong();
        System.out.println("Nhap phan ao: ");
        this.phanAo=sc.nextLong();
    }
    public void Xuat(){
        System.out.println(this.phanThuc + " + " + this.phanAo + "i");
    }
    public SoPhuc Cong(SoPhuc x){
        SoPhuc a=new SoPhuc();
        a.phanThuc=this.phanThuc+x.phanThuc;
        a.phanAo=this.phanAo + x.phanAo;
        return a;
    }
    public SoPhuc Tru(SoPhuc x){
        SoPhuc b=new SoPhuc();
        b.phanThuc=this.phanThuc-x.phanThuc;
        b.phanAo=this.phanAo - x.phanAo;
        return b;
    }
}
