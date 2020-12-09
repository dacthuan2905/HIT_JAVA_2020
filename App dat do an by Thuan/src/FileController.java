

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import  java.util.Scanner;


public class FileController {
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private PrintWriter printWriter;
    private Scanner scanner;

    public void OpenFileToWrite(String fileName){
        try {
            fileWriter = new FileWriter(fileName, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void CloseFileAfterWrite(String fileName){
        try {
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void OpenFileToRead(String fileName){
        try {
            scanner = new Scanner(Paths.get(fileName));
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void CloseFileAfterRead(String fileName){
        scanner.close();
    }

    public  void WriteFoodToFile(String filename, Food food){
        OpenFileToWrite(filename);
        printWriter.println(food.getName() + "|" + food.getType() + "|" + food.getPrice() + "|"
                + food.getAddress() + "|" + food.getRate());
        CloseFileAfterWrite(filename);

    }

    public List<Food> ReadFoodFromFile(String filename){
        OpenFileToRead(filename);
        List<Food> foodList=new ArrayList<>();
        while (scanner.hasNext()){
            String data=scanner.nextLine();
            String[] a=data.split("\\|");
            Food temp=new Food(a[0],a[2],a[3],Float.parseFloat(a[1]),Float.parseFloat(a[4]));
            foodList.add(temp);
        }
        return foodList;
    }
    public  void WriteComboToFile(String filename, Combo combo){
        OpenFileToWrite(filename);
        printWriter.println(combo.getComboName() + "|" + combo.getComboPrice());
        CloseFileAfterWrite(filename);

    }

    public List<Combo> ReadComboFromFile(String filename){
        OpenFileToRead(filename);
        List<Combo>comboList=new ArrayList<>();
        while (scanner.hasNext()){
            String data=scanner.nextLine();
            String[] a=data.split("\\|");
            Combo temp=new Combo(a[0],Float.parseFloat(a[1]));
            comboList.add(temp);
        }
        return comboList;
    }
    public  void WriteSaleToFile(String filename, Sale sale){
        OpenFileToWrite(filename);
        printWriter.println(sale.getSaleName() + "|" + sale.getSalePrice());
        CloseFileAfterWrite(filename);

    }

    public List<Sale> ReadSaleFromFile(String filename){
        OpenFileToRead(filename);
        List<Sale>saleList=new ArrayList<>();
        while (scanner.hasNext()){
            String data=scanner.nextLine();
            String[] a=data.split("\\|");
            Sale temp=new Sale(a[0],Float.parseFloat(a[1]));
            saleList.add(temp);
        }
        return saleList;
    }


}
