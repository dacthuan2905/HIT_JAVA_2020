package vd;

import java.util.Scanner;

public class person {
    private String name;
    private date ngaySinh;
    private String gender;
    private hobby Hobbies;

    public person(){

    }

    public person(String name, date ngaySinh, String gender, hobby hobbies) {
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.gender = gender;
        Hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public hobby getHobbies() {
        return Hobbies;
    }

    public void setHobbies(hobby hobbies) {
        Hobbies = hobbies;
    }
    public void InputInfor(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ho ten:");
        this.name=sc.nextLine();
        System.out.println("Nhap thong tin ngay sinh:" );
        ngaySinh =new date();
        ngaySinh.Input();
        System.out.println("Nhap gioi tinh: ");
        this.gender=sc.nextLine();
        System.out.println("Nhap so thich: ");
        Hobbies = new hobby();
        Hobbies.Inputhobby();

    }
    public void Show(){
        System.out.println("Ten la: " + name);
        System.out.println("gioi tinh la: " + gender);
        System.out.println(ngaySinh.toString());
        System.out.println(Hobbies.toString());
    }
}
