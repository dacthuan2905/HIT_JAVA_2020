package demo;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RunMain {
    public static void main(String[] args) {
        String[] arr={"Trung","Doan","Trung","Doan","Doan","Thuan","Tinh","Sang"};
        Set<String> set=new HashSet<>(Arrays.asList(arr));
        for (String s:set){
            System.out.println(s);
        }

    }
}
