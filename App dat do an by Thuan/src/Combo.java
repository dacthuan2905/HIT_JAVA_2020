import java.util.Scanner;

public class Combo {
    private String ComboName;
    private float ComboPrice;

    public Combo() {
    }

    public Combo(String comboName, float comboPrice) {
        ComboName = comboName;
        ComboPrice = comboPrice;
    }

    public String getComboName() {
        return ComboName;
    }

    public void setComboName(String comboName) {
        ComboName = comboName;
    }

    public float getComboPrice() {
        return ComboPrice;
    }

    public void setComboPrice(float comboPrice) {
        ComboPrice = comboPrice;
    }
    public void InputCombo(int id){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên: ");
        this.ComboName =sc.nextLine();
        System.out.println("Nhập  giá: ");
        this.ComboPrice = sc.nextInt();

    }
    public void OutputCombo(){
        System.out.printf("%-15d%-15d", this.ComboName, this.ComboPrice);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Combo{" +
                "Name='" + ComboName + '\'' +
                ", Price=" + ComboPrice +
                '}';
    }
}
