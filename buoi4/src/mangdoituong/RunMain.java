package mangdoituong;

public class RunMain {
    public static void main(String[] args){
         Sinhvien[] arrSv = new Sinhvien[2];
         for(int i=0;i<arrSv.length;i++){
             arrSv[i] = new Sinhvien();
             System.out.println("NhAP THONG TIN SINH VIEN THU" + (i+1) + ":");
           arrSv[i].Input();
         }
         for(int i=0;i<arrSv.length;i++){
             arrSv[i].Hienthi();
         }
    }
}

