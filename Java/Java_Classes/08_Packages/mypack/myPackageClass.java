/*
save the file as MyPackageClass.java, and compile it
javac MyPackageClass.java

Then compile the package
javac -d . MyPackageClass.java
*/

package mypack;

class MyPackageClass{
    public static void main(String[] args){
        System.out.println("This is my package!");
    }
}