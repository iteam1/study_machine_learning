/*
Java does not support "multiple inheritance" 
(a class can only inherit from one superclass). However,
 it can be achieved with interfaces
*/
// Interface
interface Animal{
    public void animalSound(); // interface method (doese not have a body)
    public void sleep(); // interface method (does not have the body)
}

// Pig "implements" the Animal interface
class Pig implements Animal{
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }

    public void sleep(){
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }

    class Main{
        public static void main(String[] args){
            Pig myObj = new Pig();
            myObj.animalSound();
            myObj.sleep();
        }
    }
}