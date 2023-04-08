package MainPackage.JavaBasics.loop;

public class DoWhileLoop {
    public static void main(String[] args){
        int i =1;                       //Initialization
        do {
            // even the statement is false though it will execute at least once
            System.out.println("hello"); //Statement
            i++;                         //Increment
        }
        while (i<=10);                   //Condition
    }
}

