package bai4;

import java.util.Scanner;

public class Array {
    private int[] arr;
    private int n;

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Array() {

    }

    public Array(int[] arr, int n) {
        this.arr = arr;
        this.n = n;
    }

    public void InputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        this.n = sc.nextInt();
        this.arr= new int[this.n];

        for (int i = 0; i < this.n; i++) {
            System.out.println("Nhap phan tu thu " + i+1 + ": ");
            this.arr[i] = new Integer(sc.nextInt());
        }
    }
    public void Show(){
        System.out.println("Mang vua tao: ");
        for(int i=0;i<this.n;i++)
        {
            System.out.println(" " + this.arr[i+1] + " ");
        }
    }
    public int Sum(){
        int s=0;
        for(int i=0;i<n;i++)
            s+=arr[i];
        return s;
    }
}
