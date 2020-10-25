package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void xuat(){
        System.out.printf( "%20s %30s %30s %15s %15s %15s\n", "Ma SP", "Ten SP", "Ten NSX", "Ngay nhap", "Cong suat", "Gia ban");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("NHap n: ");
        int n= sc.nextInt();
        ArrayList<DieuHoa> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin dieu hoa thu" + (i+1) + ":");
            DieuHoa x =new DieuHoa();
            x.Nhap();
            list.add(x);
            System.out.println("============Thong tin dieu hoa============");
            xuat();
        }
            xuat();
            for(DieuHoa a:list){
                a.Xuat();
        }
        float mingiaBan= list.get(0).getGiaBan();
            for (DieuHoa a:list)
                if(a.getGiaBan()<mingiaBan)
                    mingiaBan=a.getGiaBan();
        boolean check =false;
        for(DieuHoa a:list){
            if(a.getTenNSX().compareToIgnoreCase("Electrodux")==0 &&  a.getGiaBan()==mingiaBan){
                check=true;
                break;
            }
        }
        if(check){
            xuat();
            for(DieuHoa a:list)
                if(a.getTenNSX().compareToIgnoreCase("Electrodux")==0 &&  a.getGiaBan()==mingiaBan)
                    a.Xuat();
        }else
            System.out.println("khong co san pham thoa man");

    }
}
