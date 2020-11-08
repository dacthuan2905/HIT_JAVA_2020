package demo2;

public class RunMain {
    public static void main(String[] args) {
        Animal a=new Husky();
        a.Eat();
        a.Sleep();
        a.Move();
        ((Husky) a).Bark();
    }
}
