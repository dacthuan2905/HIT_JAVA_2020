import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "  cao   dac  thuan  2905         ";

        String result = "";
        str = str.trim();
        while (str.contains("  ")){
            str = str.replace("  ", " ");
        }
        String[] arrString = str.split(" ");
        for (int i = 0; i < arrString.length; i++){
            result += Character.toUpperCase(arrString[i].charAt(0)) + arrString[i].substring(1);
            if(i < arrString.length - 1){
                result += " ";
            }
        }
        System.out.println(result);
    }
}