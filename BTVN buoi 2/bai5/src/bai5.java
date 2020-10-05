import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;
        float s = 0;
        for (int i = 0; i < str.length(); i++){
            char charAt = str.charAt(i);
            if(Character.isDigit(charAt)){
                s += Integer.parseInt(String.valueOf(charAt));
                count++;
            }
        }
        System.out.println(s/count);
    }
}