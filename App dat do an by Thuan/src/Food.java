import java.util.Scanner;

public class Food {


    private String Name;
    private String Type;
    private String address;
    private float price;
    private float Rate;
    

    public Food() {
    }

    public Food(String name, String type, String address, float price, float rate) {
        Name = name;
        Type = type;
        this.address = address;
        this.price = price;
        Rate = rate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getRate() {
        return Rate;
    }

    public void setRate(float rate) {
        Rate = rate;
    }
    public void InputFood(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên: ");
        this.Name =sc.nextLine();
        System.out.println("nhập loại: ");
        this.Type = sc.nextLine();
        System.out.println("nhập địa chỉ: ");
        this.address = sc.nextLine();
        System.out.println("Nhập  giá: ");
        this.price = sc.nextFloat();
        System.out.println("Nhập đánh giá: ");
        this.Rate = sc.nextFloat();
    }
    public void OutputFood(){
        System.out.printf("%-15d%-15d%-20s%-10s%-10s%-15s%-15s%-15s%-15s", this.Name, this.Type, this.price, this.address, this.Rate);
        System.out.println();
    }
    @Override
    public String toString() {
        return "Food{" + " Tên='" + Name + '\'' +
                ", loại='" + Type + '\'' +
                ", Giá='" + price + '\'' +
                ", address='" + address + '\'' +
                ", rate='" + Rate +
                '}';
    }
}
