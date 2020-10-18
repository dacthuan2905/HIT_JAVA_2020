package bai1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.println(" Nhap so luong sach: ");
        n=scanner.nextInt();
        SACH[] book=new SACH[n];
        for(int i=0;i< book.length;i++){
            book[i]=new SACH();
            System.out.println("Nhap thong tin sach thu" + (i+1) );
            book[i].Input();
        }
        for(int i=0;i<book.length;i++)
            book[i].Show();
    }
}
