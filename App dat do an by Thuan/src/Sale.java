import java.util.Scanner;

public class Sale {
    private String SaleName;
    private float SalePrice;

    public Sale() {
    }

    public Sale(String name, float price) {
        SaleName = name;
        SalePrice = price;
    }

    public String getSaleName() {
        return SaleName;
    }

    public void setSaleName(String saleName) {
        SaleName = saleName;
    }

    public float getSalePrice() {
        return SalePrice;
    }

    public void setSalePrice(float salePrice) {
        SalePrice = salePrice;
    }
    public void InputSale(int id){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên: ");
        this.SaleName =sc.nextLine();
        System.out.println("Nhập  giá: ");
        this.SalePrice = sc.nextInt();

    }
    public void OutputSale(){
        System.out.printf("%-15d%-15d", this.SaleName, this.SalePrice);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Sale{" +
                "Name='" + SaleName + '\'' +
                ", Price=" + SalePrice +
                '}';
    }
}
