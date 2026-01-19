package Recursion;

public class FuctionCalls {
    static void main(String[] args) {
        System.out.println("Hi i am in main");
        apple();
    }
    public static void apple(){
        System.out.println("HI i am in apple");
        banana();
    }
    public static void banana(){
        System.out.println("Hi i am in banana");
        mango();
    }
    public static void mango(){
        System.out.println("Hi i am in mango");

    }
}
