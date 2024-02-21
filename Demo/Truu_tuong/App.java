package Demo.Truu_tuong;

abstract class Animal{
    private String tiengKeu;

    public abstract void hienThiTiengKeu();
}

class Dog extends Animal{
    @Override
    public void hienThiTiengKeu(){
        System.out.println("Gauuu..");
    }
}

class Cat extends Animal{
    @Override
    public void hienThiTiengKeu(){
        System.out.println("Meooo");
    }
}

public class App {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.hienThiTiengKeu();

        Cat cat = new Cat();
        cat.hienThiTiengKeu();
    }
}
