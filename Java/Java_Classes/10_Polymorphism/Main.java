class Animal{
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("The dog says: bow bow");
    }
}

class Main{
    public static void main(String[] args){
        Animal myAnimal = new Animal();
        // Pig myPig = new Pig();
        Animal myPig = new Pig();
        // Dog myDog = new Dog();
        Animal myDog = new Dog();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}