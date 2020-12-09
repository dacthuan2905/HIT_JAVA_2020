

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        do{
            int choice;
            System.out.println("------------MENU------------");
            System.out.println("1. Create new account. ");
            System.out.println("2. Login to an existing account.");
            System.out.println("3. Sort accounts by username.");
            System.out.println("4. Exit");
            System.out.println("----------------------------");
            System.out.println("Enter your choice: ");

            choice=scanner.nextInt();

            switch (choice){
                case 1:
                    CreateNewAccount();
                    break;
                case 2:
                    Logintoanexistingaccount();
                    break;
                case 3:
                    Sortaccountsbyusername();
                    break;
                case 4:
                    System.exit(0);

            }
        }while (true);
    }


    public static void CreateNewAccount(){
        Scanner scanner=new Scanner(System.in);
        String regexUser = "^[a-zA-Z0-9]{6,}$";
        String regexPass = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%&*+-/^\\*])(?=.*[\\d])[a-zA-Z0-9!@#$%&*+-/^\\*]{8,}$";
        String regexEmail = "^[A-Za-z0-9]{6,}@gmail.com$";
        String regexPhone = "^0[0-9]{9}$";
        String text = "";
        String str;
        boolean check = true;
        Pattern pattern;

        text += String.valueOf((IdMax("ACC.DAT") + 1)) + "|";

        System.out.print("Enter your full name: ");
        str = scanner.nextLine();

        text += str + "|";

        pattern = Pattern.compile(regexUser);
        System.out.print("Enter your username: ");
        do {
            str = scanner.nextLine();
            check = CheckusernameContain("ACC.DAT", str);
            if(!pattern.matcher(str).find() || check)
                System.out.print("Enter your username again: ");
        }while(!pattern.matcher(str).find() || check);

        text += str + "|";

        pattern = Pattern.compile(regexPass);
        System.out.print("Enter your password: ");
        do {
            str = scanner.nextLine();
            if(!pattern.matcher(str).find())
                System.out.print("Enter your password again: ");
        }while(!pattern.matcher(str).find());

        text += str + "|";

        System.out.print("Enter your re password: ");
        String str1;
        do {
            str1 = scanner.nextLine();
            if(str.compareTo(str1) != 0)
                System.out.print("Enter your re password again: ");
        }while(str.compareTo(str1) != 0);

        pattern = Pattern.compile(regexEmail);
        System.out.print("Enter your email: ");
        do {
            str = scanner.nextLine();
            if(!pattern.matcher(str).find())
                System.out.print("Enter your email again: ");
        }while(!pattern.matcher(str).find());

        text += str + "|";

        pattern = Pattern.compile(regexPhone);
        System.out.print("Enter your phone number: ");
        do {
            str = scanner.nextLine();
            if(!pattern.matcher(str).find())
                System.out.print("Enter your phone number again: ");
        }while(!pattern.matcher(str).find());

        text += str + "|";

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        str = formatter.format(date);

        text += str;

        WriteFile("ACC.DAT", text);
    }

    public static void WriteFile(String fileName, String str){
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            printWriter.println(str);

            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static boolean CheckusernameContain(String fileName, String username){
        try {
            Scanner scanner = new Scanner(Paths.get(fileName));
            while(scanner.hasNext()){
                String str = scanner.nextLine();
                String[] a = str.split("\\|");
                for(int j = 0; j < a.length; j++){
                    if(a[2].compareTo(username) == 0){
                        return true;
                    }
                }
            }
            scanner.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static int IdMax(String fileName){
        List<String> list = new ArrayList<>();
        int max  = 0;
        try {
            Scanner scanner = new Scanner(Paths.get(fileName));
            while(scanner.hasNext()){
                list.add(scanner.nextLine());
            }
            scanner.close();

            String[] a = list.get(0).split("\\|");
            max = Integer.parseInt(a[0]);
            for(int i = 1; i < list.size(); i++){
                a = list.get(i).split("\\|");
                int temp = Integer.parseInt(a[0]);
                if(max < temp){
                    max = temp;
                }
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return max;
    }

    private static void Logintoanexistingaccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your user name: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        boolean check = CheckAccountContain("ACC.DAT", username, password);
        if(check){
            int choice;
            do {
                System.out.println("------------------------");
                System.out.println("| 1.Show info.         |");
                System.out.println("| 2.Change password.   |");
                System.out.println("------------------------");

                System.out.print("Enter your choise: ");
                choice = scanner.nextInt();

                switch(choice){
                    case 1:
                        ShowInfoByusername(username);
                        break;
                    case 2:
                        ChangePassword(username);
                        break;
                }
            }while(choice < 1 || choice > 2);
        }else if(CheckusernameContain("ACC.DAT", username)) {
            System.out.println("\n\tWrong password :v");
        }else {
            System.out.println("\n\tAccount is not contain!!!");
        }
    }

    public static void ShowInfoByusername(String username) {
    }

    private static boolean CheckAccountContain(String fileName, String username, String password){
        try {
            Scanner scanner = new Scanner(Paths.get(fileName));
            while(scanner.hasNext()){
                String[] a = scanner.nextLine().split("\\|");
                if(a[2].compareTo(username) == 0 && a[3].compareTo(password) == 0){
                    return true;
                }
            }
            scanner.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return false;
    }

    private static void Sortaccountsbyusername(String username)
     {
        try {
            Scanner scanner = new Scanner(Paths.get("ACC.DAT"));
            while(scanner.hasNext()){
                String[] a = scanner.nextLine().split("\\|");
                if(a[2].compareTo(username) == 0){
                    System.out.println("Id: " + a[0]);
                    System.out.println("Full name: " + a[1]);
                    System.out.println("User name: " + a[2]);
                    System.out.println("Email: " + a[4]);
                    System.out.println("Phone number: " + a[5]);
                    System.out.println("Create at: " + a[6]);
                    break;
                }
            }
            scanner.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void WriteFileAfterChangeData(String fileName, List<String> list){
        try {
            FileWriter fileWriter = new FileWriter("ACC.DAT", false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            for(String i : list){
                printWriter.println(i);
            }

            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    public static void ChangePassword(String username) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        try {
            Scanner scannerWriter = new Scanner(Paths.get("ACC.DAT"));
            while(scannerWriter.hasNext()){
                String info = scannerWriter.nextLine();
                String[] a = info.split("\\|");
                if(a[2].compareTo(username) == 0){
                    String regPass = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%&*+-/^\\*])(?=.*[\\d])[a-zA-Z0-9!@#$%&*+-/^\\*]{8,}$";
                    Pattern pattern = Pattern.compile(regPass);
                    String str, temp = "";
                    System.out.print("Enter your new password: ");

                    do {
                        str = scanner.nextLine();
                        if(!pattern.matcher(str).find()){
                            System.out.print("Enter your new password again: ");
                        }
                    }while(!pattern.matcher(str).find());

                    String str2;
                    System.out.print("Enter your re new password:");
                    do {
                        str2 = scanner.nextLine();
                        if(str.compareTo(str2) != 0){
                            System.out.print("Enter your re new password again: ");
                        }
                    }while(str.compareTo(str2) != 0);

                    a[3] = str;
                    info = "";
                    for(int i = 0; i < a.length; i++){
                        info += a[i];
                        if(i < a.length - 1)
                            info += "|";
                    }
                }
                list.add(info);
            }
            scannerWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        WriteFileAfterChangeData("ACC.DAT", list);
    }

    public static void Sortaccountsbyusername() {
        try {
            Scanner scanner = new Scanner(Paths.get("ACC.DAT"));
            List<String> list = new ArrayList<>();
            while(scanner.hasNext()){
                list.add(scanner.nextLine());
            }

            for(int i = 0; i < list.size() - 1; i++){
                for(int j = list.size() - 1; j > i; j--){
                    String[] a1 = list.get(j - 1).split("\\|");
                    String[] a2 = list.get(j).split("\\|");
                    if(a1[2].compareTo(a2[2]) > 0){
                        String temp = list.get(j - 1);
                        list.set(j - 1, list.get(j));
                        list.set(j, temp);
                    }
                }
            }

            System.out.println("\n----------------------List account------------------------");
            System.out.printf("%15s %30s %30s %30s %15s %15s\n", "ID", "Full name", "User name", "Email", "Phone number", "Create at");
            for(String i : list){
                String[] a = i.split("\\|");
                System.out.printf("%15s %30s %30s %30s  %15s %15s\n", a[0], a[1], a[2], a[4], a[5], a[6]);
            }

            WriteFileAfterChangeData("ACC.DAT", list);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}

