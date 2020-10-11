package bai4;

public class RunMain {
    public static void main(String[] args){
        Array arr1 = new Array();
        Array arr2 = new Array();
        arr1.InputData();
        arr1.Show();
        float TBC1= arr1.Sum()/ arr1.getN();
        arr2.InputData();
        arr2.Show();
        float TBC2=arr2.Sum()/arr2.getN();
        if(TBC1 > TBC2){
            System.out.println(TBC1);
        }else if(TBC2>TBC1){
            System.out.println(TBC2);
        }else System.out.println("Hi");
    }
}
