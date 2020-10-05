import java.util.Scanner;

public class bai1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        int max=Math.max(a, Math.max(b, c));
            System.out.println(max);


    }
}
