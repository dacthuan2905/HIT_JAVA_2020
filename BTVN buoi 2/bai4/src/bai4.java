import java.util.Scanner;
public class bai4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] a = new int[n];
            int s = 0;
            for (int i = 0; i < a.length; i++){
                a[i] = scanner.nextInt();
            }
            int[] prime = Prime(n);
            for (int i = 0; i < a.length; i++){
                s += IsPrime(a[i]) ? a[i] + prime[i] - i : a[i];
            }
            System.out.println(s);
        }

        public static boolean IsPrime(int n){
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n%i == 0) {
                    return false;
                }
            }
            return n > 1;
        }

        public static int[] Prime(int n){
            int count = 0;
            int x = 2;
            int[] prime = new int[n];
            while (count < n){
                if (IsPrime(x)){
                    prime[count++] = x;
                }
                x++;
            }
            return prime;
        }
    }

