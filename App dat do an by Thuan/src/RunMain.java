import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class RunMain {
    static Scanner scanner = new Scanner(System.in);
    static FileController x = new FileController();
    static List<Food> foodList = new ArrayList<>();
    static List<Combo> comboList = new ArrayList<>();
    static List<Sale> saleList = new ArrayList<>();



    public static void main(String[] args) {

        do {
            int choice;
            System.out.println("1.\tTìm kiếm món ăn theo tên");
            System.out.println("2.\tTìm kiếm theo loại");
            System.out.println("3.\tTìm kiếm theo địa chỉ");
            System.out.println("4.\t Khuyễn mãi");
            System.out.println("5.\tĐặt combo");
            System.out.println("6.\tSắp xếp dồ ăn theo tên");
            System.out.println("7.\tSắp xếp đồ ăn theo đánh giá");
            System.out.println("8.\tSắp xếp đồ ăn theo giá");
            System.out.println("9.\tThoát");
            System.out.println("-----------------Moi quy khach nhap lua chon--------------");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    FindFoodByName();
                    break;
                case 2:
                    FindFoodByType();
                    break;
                case 3:
                    FindFoodByAddress();
                    break;
                case 4:
                    OutputSale();
                    break;
                case 5:
                    OutputCombo();
                    break;
                case 6:
                    SortFoodByName();

                    break;
                case 7:
                    SortFoodByRate();
                    break;
                case 8:
                    SortFoodByPrice();
                    break;
                case 9:
                    System.exit(0);


            }
        } while (true);

    }

    private static void SortFoodByRate() {
        foodList= x.ReadFoodFromFile("FOOD.DAT");
        foodList.sort((o1, o2) -> {
            if(o1.getRate()< o2.getRate()){
                return -1;
            }else if(o1.getRate()> o2.getRate()){
                return 1;
            }else return 0;
        });
        foodList.forEach((i) -> {
            System.out.println(i);
        });
        boolean check=false;
        do{
        System.out.println("Nhap ten mon an:");
        String name=scanner.nextLine();

        for(Food i : foodList){
            if(i.getName().compareTo(name) == 0){
                Order(name);
                check = true;
                break;
            }
        }}while (!check);
    }

    private static void SortFoodByPrice() {
        foodList= x.ReadFoodFromFile("FOOD.DAT");
        foodList.sort((o1, o2) -> {
            if(o1.getPrice()< o2.getPrice()){
                return -1;
            }else if(o1.getPrice()> o2.getPrice()){
                return 1;
            }else return 0;
        });
        foodList.forEach((i) -> {
            System.out.println(i);
        });
        boolean check=false;
        do{
            System.out.println("Nhap ten mon an:");
            String name=scanner.nextLine();

            for(Food i : foodList){
                if(i.getName().compareTo(name) == 0){
                    Order(name);
                    check = true;
                    break;
                }
            }}while (!check);

    }

    private static void SortFoodByName() {
        foodList= x.ReadFoodFromFile("FOOD.DAT");
        foodList.sort((o1, o2) -> {
            if(o1.getName().compareTo(o2.getName()) < 0){
                return -1;
            }else if(o1.getName().compareTo(o2.getName())>0){
                return 1;
            }else return 0;
        });
        foodList.forEach((i) -> {
            System.out.println(i);
        });
        boolean check=false;
        do{
            System.out.println("Nhap ten mon an:");
            String name=scanner.nextLine();

            for(Food i : foodList){
                if(i.getName().compareTo(name) == 0){
                    Order(name);
                    check = true;
                    break;
                }
            }}while (!check);
    }

    private static void OutputCombo() {
        comboList= x.ReadComboFromFile("COMBO.DAT");
        comboList.forEach((i) -> {
            System.out.println(i);
        });
        boolean check=false;
        do{
            System.out.println("Nhap ten mon an:");
            String name=scanner.nextLine();

            for(Combo i:comboList){
                if(i.getComboName().compareTo(name) == 0){
                    OrderCombo(name);
                    check = true;
                    break;
                }
            }}while (!check);
    }
    private static void OrderCombo(String name) {
        System.out.println("Nhap so luong muon dat");
        int n=scanner.nextInt();
        double s=1;
        for(int i=0;i<comboList.size();i++)
            if(name.compareTo(comboList.get(i).getComboName())==0){
                s=n*comboList.get(i).getComboPrice();
                break;
            }
        System.out.println("Ten :" + name + " Sl " + n +" Thanh tien: " + s +"VND" );
        RateFood();
    }

    private static void OutputSale() {
        saleList= x.ReadSaleFromFile("SALE.DAT");
        saleList.forEach((i) -> {
            System.out.println(i);
        });
        boolean check=false;
        do{
            System.out.println("Nhap ten mon an:");
            String name=scanner.nextLine();

            for(Sale i:saleList){
                if(i.getSaleName().compareTo(name) == 0){
                    OrderSale(name);
                    check = true;
                    break;
                }
            }}while (!check);

    }
    private static void OrderSale(String name) {
        System.out.println("Nhap so luong muon dat");
        int n=scanner.nextInt();
        double s=1;
        for(int i=0;i<saleList.size();i++)
            if(name.compareTo(saleList.get(i).getSaleName())==0){
                s=n*saleList.get(i).getSalePrice();
                break;
            }
        System.out.println("Ten :" + name + " Sl " + n +" Thanh tien: " + s +"VND" );
        RateFood();
    }

    private static void FindFoodByType() {
        foodList= x.ReadFoodFromFile("FOOD.DAT");
        String temp;
        System.out.println("Nhap loai mon an: ");
        temp=scanner.nextLine();

        for(int i=0;i<foodList.size();i++) {
            if (foodList.get(i).getType().compareTo(temp) == 0) {
                System.out.println(foodList.get(i));
            }
        }
        boolean check=false;
        do{
            System.out.println("Nhap ten mon an:");
            String name=scanner.nextLine();

            for(Food i : foodList){
                if(i.getName().compareTo(name) == 0){
                    Order(name);
                    check = true;
                    break;
                }
            }}while (!check);

    }

    private static void FindFoodByAddress() {
        foodList= x.ReadFoodFromFile("FOOD.DAT");
        String temp;
        System.out.println("Nhap dia chi mon an: ");
        temp=scanner.nextLine();
        boolean check=false;
        int i;
        for(i=0;i<foodList.size();i++){
            if(foodList.get(i).getAddress().compareTo(temp)==0){
                check=true;
                break;
            }
        }
        if(check){
            System.out.println(foodList.get(i));
            Showmenu(foodList.get(i).getName());
            return;
        }else System.out.println("Khong co mon an theo yeu cau");
    }

    private static void Order(String name) {
        System.out.println("Nhap so luong muon dat");
        int n=scanner.nextInt();
        double s=1;
        for(int i=0;i<foodList.size();i++)
            if(name.compareTo(foodList.get(i).getName())==0){
                s=n*foodList.get(i).getPrice();
                break;
            }
        System.out.println("Ten mon an:" + name + " Sl " + n +" Thanh tien: " + s +"VND" );
        RateFood();

    }

    private static void RateFood() {
        System.out.println("Nhap danh gia: ");
        double r=scanner.nextDouble();
        System.out.println("CAM ON QUY KHACH DA DANH GIA!");

    }

    private static void Showmenu(String name){
        do {
            int choice;
            System.out.println("1.\t Đặt đồ ăn");
            System.out.println("2.\t Thoát");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    Order(name);
                    return;
                case 2:
                    System.exit(0);
            }
        }while (true);
    }

    private static void FindFoodByName() {
        foodList= x.ReadFoodFromFile("FOOD.DAT");
        String temp;
        System.out.println("Nhap ten mon an: ");
        temp=scanner.nextLine();
        boolean check=false;
        int i;
        for(i=0;i<foodList.size();i++){
            if(foodList.get(i).getName().compareTo(temp)==0){
                check=true;
                break;
            }
        }
        if(check){
            System.out.println(foodList.get(i));
            Showmenu(temp);
            return;
        }else System.out.println("Khong co mon an theo yeu cau");

    }
}
