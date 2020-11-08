package bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<News> arrayList=new ArrayList<>();

        System.out.println("=======MENU=======");
        System.out.println("1. Insert news");
        System.out.println("2. View list news");
        System.out.println("3. Average rate");
        System.out.println("4. Exit");

        int choice=0;
        while (true){
            System.out.println("Input choice: ");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    News x = new News();
                    System.out.print("Input ID: ");
                    x.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Input Title: ");
                    x.setTitle(sc.nextLine());
                    System.out.print("Input Publish Date: ");
                    x.setPublishDate(sc.nextLine());
                    System.out.print("Input author: ");
                    x.setAuthor(sc.nextLine());
                    System.out.print("Input content: ");
                    x.setContent(sc.nextLine());
                    System.out.println("Input Rates");
                    x.InputRate();
                    arrayList.add(x);
                    break;
                case 2:
                    for(int i = 0; i < arrayList.size(); i++){
                        System.out.println("Show News " + (i + 1));
                        arrayList.get(i).Display();
                    }
                    break;
                case 3:
                    for(int i = 0; i < arrayList.size(); i++){
                        arrayList.get(i).Calculate();
                        System.out.println("Show News " + (i + 1));
                        arrayList.get(i).Display();
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
