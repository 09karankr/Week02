package AnimalHierarchy;

public class Main {
    public static void main(String[] args){
        Dog myDog = new Dog("Buddy",3);
        Cat myCat = new Cat("Mimi",2);
        Bird myBird = new Bird("Tanny",1);

        myDog.makeSound();
        myCat.makeSound();
        myBird.makeSound();

    }


}
