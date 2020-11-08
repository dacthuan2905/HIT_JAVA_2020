package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();

        int choice;
        do {
            System.out.println("----------------------MENU----------------------");
            System.out.println("1. Add book.");
            System.out.println("2. Edit book by id.");
            System.out.println("3. Delete book by id.");
            System.out.println("4. Sort books by gpa.");
            System.out.println("5. Sort books by name.");
            System.out.println("6. Show books.");
            System.out.println("0. Exit.");
            System.out.print("Your choice: ");

            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    AddNewbook(list);
                    break;
                case 2:
                    Showbooks(list);
                    EditbookById(list);
                    break;
                case 3:
                    Showbooks(list);
                    DeletebookById(list);
                    break;
                case 4:
                    SortbooksByName(list);
                    Showbooks(list);
                    break;
                case 5:
                    SortbooksByPrice(list);
                    Showbooks(list);
                    break;
                case 6:
                    Showbooks(list);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (true);
    }

    private static void AddNewbook(ArrayList<Book> list) {
        boolean checkExists = false;
        int id = 0;
        do {
            System.out.print("Input id: ");
            id = scanner.nextInt();
            checkExists = CheckExistsId(list, id);

            if (checkExists) {
                System.out.println("Id already exists");
            } else {
                break;
            }
        } while (true);

        scanner.nextLine();
        System.out.print("Input name: ");
        String name = scanner.nextLine();
        System.out.print("Input NSX: ");
        String NSX = scanner.nextLine();
        System.out.println("Input gia ban: ");
        int giaBan=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Input tac gia: ");
        String tacGia = scanner.nextLine();
        System.out.println("Input so trang: ");
        int soTrang=scanner.nextInt();

        Book book = new Book(id, name, NSX, giaBan, soTrang,tacGia);
        list.add(book);
        System.out.println("Added new book");
    }

    public static void EditbookById(ArrayList<Book> list){
        String name;
        String NSX;
        int giaBan;
        int soTrang;
        String tacGia;

        boolean checkExists = false;
        System.out.print("Input id to edit: ");
        int id = scanner.nextInt();
        checkExists = CheckExistsId(list, id);
        if (checkExists){
            Book book = GetbookById(list, id);
            int choice;
            do {
                System.out.println("1. Edit name.");
                System.out.println("2. Edit NSX.");
                System.out.println("3. Edit gia.");
                System.out.println("4. Edit so trang.");
                System.out.println("5. Edit tac gia.");
                System.out.print("Your choice: ");

                choice = scanner.nextInt();

                switch (choice){
                    case 1:
                        System.out.print("Input name to edit: ");
                        scanner.nextLine();
                        name = scanner.nextLine();
                        book.setName(name);
                        System.out.println("Edited book name");
                        break;
                    case 2:
                        System.out.print("Input NSX to edit: ");
                        scanner.nextLine();
                        NSX = scanner.nextLine();
                        book.setNSX(NSX);
                        System.out.println("Edited book NSX");
                        break;
                    case 3:
                        System.out.print("Input age to edit: ");
                        giaBan = scanner.nextInt();
                        book.setGiaBan(giaBan);
                        System.out.println("Edited book gia");
                        break;

                    case 4:
                        System.out.print("Input so trang to edit: ");
                        soTrang = scanner.nextInt();
                        book.setSoTrang(soTrang);
                        System.out.println("Edited book so trang");
                        break;
                    case 5:
                        System.out.print("Input tac gia to edit: ");
                        scanner.nextLine();
                        tacGia = scanner.nextLine();
                        book.setTacGia(tacGia);
                        System.out.println("Edited book tacgia ");
                        break;
                }

            } while (choice >= 6 || choice <= 0);

        } else {
            System.out.println("Id does not exist");
        }
    }

    public static void DeletebookById(ArrayList<Book> list){
        boolean checkExists = false;
        System.out.print("Input id to delete: ");
        int id = scanner.nextInt();
        checkExists = CheckExistsId(list, id);
        if (checkExists){
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId() == id){
                    list.remove(i);
                    break;
                }
            }
            System.out.println("Removed book has id " + id);
        } else {
            System.out.println("Id does not exist");
        }
    }



    public static void SortbooksByName(ArrayList<Book> list){
        for (int i = 0; i < list.size() - 1; i++){
            for (int j = list.size() - 1; j > i; j--){
                if (list.get(j - 1).getName().compareTo(list.get(j).getName()) > 0){
                    Book temp = list.get(j - 1);
                    list.set(j - 1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
    public static void SortbooksByPrice(ArrayList<Book> list){
        for (int i = 0; i < list.size() - 1; i++){
            for (int j = list.size() - 1; j > i; j--){
                if (list.get(j - 1).getGiaBan() < list.get(j).getGiaBan()){
                    Book temp = list.get(j - 1);
                    list.set(j - 1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    public static void Showbooks(ArrayList<Book> list){
        for (Book s : list){
            System.out.println(s);
        }
    }

    public static boolean CheckExistsId(ArrayList<Book> list, int id){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id){
                return true;
            }
        }
        return false;
    }

    public static Book GetbookById(ArrayList<Book> list, int id){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id){
                return list.get(i);
            }
        }
        return null;
    }
}
