package bai2;

public class RunMain {
    public static void main(String[] args) {
        SoPhuc x1=new SoPhuc();
        SoPhuc x2=new SoPhuc();
        System.out.println("Nhap vao so thu nhat: ");
        x1.Nhap();
        System.out.println("Nhap vao so thu hai: ");
        x2.Nhap();

        SoPhuc sum=x1.Cong(x2);
        System.out.println(" x1 + x2 = ");
        sum.Xuat();
        SoPhuc hieu=x1.Tru(x2);
        System.out.println(" x1 - x2 = ");
        hieu.Xuat();
    }
}
