package Demo.Da_hinh;

class Animal{
    public void makeSound(){
        System.out.println("á");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("meooo");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("gauu...");
    }
}

public class App {
    public static void main(String[] args){
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        animal1.makeSound();
        animal2.makeSound();
    }
}
