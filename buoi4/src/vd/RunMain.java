package vd;

import mangdoituong.Sinhvien;

public class RunMain {
    public static void main(String[] args){
        person[] arrps=new person[2];
        for(int i=0;i<arrps.length;i++){
            arrps[i] = new person();
            System.out.println("Nhap thong tin nguoi thu" + (i+1) + ":");
            arrps[i].InputInfor();
        }
        for(int i=0;i<arrps.length;i++){
            arrps[i].Show();
        }
    }
    }
