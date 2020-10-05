import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        int max=0;
        int min=0;
        int[] arr = new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]=scanner.nextInt();
            if(i==0){
                max=arr[i];
            }else if(arr[i]>max){
                max =arr[i];
            }
        }
        for(int i=0;i< arr.length;i++){
            if(i==0){
                min=arr[i];
            }else if(arr[i]<min){
                min =arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>i;j--){
                if(arr[j]<arr[j-1]){
                    int tmp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=tmp;
                }
            }

        }
        System.out.println("max= " + max);
        System.out.println("min= " + min);
        for(int i=0;i<arr.length;i++)
            System.out.printf( arr[i] +" ");

    }
}
