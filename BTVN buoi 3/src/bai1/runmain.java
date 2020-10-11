package bai1;

public class runmain {
    public static void main(String[] args){
        person DoanXinhGai=new person();
        person DiepBueDue=new person();
        DoanXinhGai.setName("Vũ Thị Doan");
        DoanXinhGai.setDateOfBirth("20/12/2000");
        DoanXinhGai.setGender("Nữ");
        DoanXinhGai.setHobby("Thích màu hồng ghét sự gải dối");
        DiepBueDue.setName("Nguyễn Thị Điệp");
        DiepBueDue.setDateOfBirth("17/7/2000");
        DiepBueDue.setGender("Buê đuê");
        DiepBueDue.setHobby("Ngắm quần đùi các bạn trai mới lớn tuổi từ 18 đếnn 22");
        System.out.println("Thông tin của Doan xing gái");
        System.out.println(DoanXinhGai.getName());
        System.out.println(DoanXinhGai.getDateOfBirth());
        System.out.println(DoanXinhGai.getGender());
        System.out.println(DoanXinhGai.getHobby());
        System.out.println("Thông tin của Điệp buê đuê");
        System.out.println(DiepBueDue.getName());
        System.out.println(DiepBueDue.getDateOfBirth());
        System.out.println(DiepBueDue.getGender());
        System.out.println(DiepBueDue.getHobby());
    }
}
