package bai2;
import bai22.Dog;
public class RunMain {
    public static void main(String[] args){
        Dog Cat=new Dog();
        Cat.InputName("mèo");
        for(int i=0;i<3;i++){
            Cat.Bark();
            Cat.ShowMP();
        }
        }
    }

