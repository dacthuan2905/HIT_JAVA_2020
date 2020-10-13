package vd;

import java.util.Scanner;

public class hobby {
    private String Sang;
    private String chieu;

    public hobby(){

    }

    public hobby(String sang, String chieu) {
        Sang = sang;
        this.chieu = chieu;
    }

    public String getSang() {
        return Sang;
    }

    public void setSang(String sang) {
        Sang = sang;
    }

    public String getChieu() {
        return chieu;
    }

    public void setChieu(String chieu) {
        this.chieu = chieu;
    }

    @Override
    public String toString() {
        return  Sang + "/" + chieu ;
    }
    public void Inputhobby(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thich buoi sang: ");
        this.Sang=sc.nextLine();
        System.out.println("Nhap so thich buoi chieu: ");
        this.chieu=sc.nextLine();
    }
}
