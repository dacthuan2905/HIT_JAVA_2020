package demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class RunMain {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("thuan.txt",false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for (int i=0;i<5;i++){
                printWriter.println(i);
            }
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
