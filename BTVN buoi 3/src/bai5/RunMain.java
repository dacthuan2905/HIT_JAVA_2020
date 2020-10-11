package bai5;

public class RunMain {
    public  static void main(String[] args){
        Guns Ghost = new Guns("AK47", 40);
        Guns CaptainJack = new Guns("M416",30);
        while (Ghost.getAmmoNumber() >0 && CaptainJack.getAmmoNumber()>0){
            Ghost.Load(5);
            Ghost.Shoot(7);
            CaptainJack.Load(10);
            CaptainJack.Shoot(3);
        }
        if (Ghost.getAmmoNumber()==0){
            System.out.println("Captain Jack win");
        }else System.out.println("Ghost win");
    }
}
