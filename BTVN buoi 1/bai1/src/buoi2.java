import java.util.Scanner;

public class buoi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String x="10.444";
//        int d = 10;
//        String str = String.valueOf(d);
//        System.out.println(str instanceof String);
//        double a = Double.parseDouble(x);
//        float b = Float.parseFloat(x);
//        System.out.println("a= " + a);
//        System.out.println(b);
//        Show();
//        System.out.println(" 4 + 5 ="+ Sum(4,5));
//        String a="ab12c03gfh4as";
//        int s=0;
//        for (int i=1;i<a.length();i++) {
//            char ch = a.charAt(i);
//            if (Character.isDigit(ch)){
//                s+=Integer.parseInt(String.valueOf(ch));
//            }
//
//        }
//            if (ch >='0' && ch <= '9'){
//                s += (int) ch - 48;
//            }
//        System.out.println("s=" + s);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    }

    public static boolean IsPrime(int x) {
        for (int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }

        }return true;
    }

    public static int Sum(){
        int sum=0;
        for (int i = 1; i <= 10; i++) {
            if (IsPrime(i)) {
                sum += i;
            }
        }
        System.out.println("S= " + sum);
        return sum;
    }

}




