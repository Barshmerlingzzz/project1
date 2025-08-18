import javax.naming.AuthenticationException;
import java.io.FileNotFoundException;
import java.net.BindException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws AuthenticationException, FileNotFoundException, BindException {
        //ex1();
        //ex4(1);
        //ex4(2);
        //ex4(3);
        //ex7:
        // solution 1 use >= instead of > in  constructor
        // solution 2(better) always check if name is not null before calling toUpperCase()
        //ex8
        // solution using < instead of <=


        try {
            ex2(6);
            ex2(12);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("an error occurred");
        }

        try {
            ex3();
        } catch (IllegalArgumentException ex) {
            System.out.println("Caught exception:" + ex.getMessage());
        }
        //ex4(4);
       // ex5(2);
        ex6(3);
    }

    public static void ex6(int number){
        try {
            System.out.println("The input number is:" + number);
            ex4(number);
            throw new RuntimeException();
        }
        catch (AuthenticationException | BindException | FileNotFoundException ex){
            System.out.println(number);
        }
        System.out.println("here");
    }

    public static void ex5(int number){
        try {
            ex4(number);
        }
        catch (AuthenticationException| BindException|FileNotFoundException ex){
            System.out.println(ex.getMessage());
            //System.out.println(number);
        }
    }

    public static void ex4(int num) throws FileNotFoundException, BindException, AuthenticationException {
        switch (num) {
            case 1:
                throw new FileNotFoundException();
            case 2:
                throw new BindException();
            case 3:
                throw new AuthenticationException();

            default:
                break;
        }
    }

    public static void ex3() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Number:");
            int input = scanner.nextInt();
            if (input == 45) {
                throw new IllegalArgumentException("45 is illegal number");
            }
            if (input == 100) {
                throw new RuntimeException("100?! are you crazy?!");
            }
        }
    }
//לתקן את2

    public static void ex2(int month) {
        int[] months = new int[12];
        months[month]++;

    }



    public static void ex1() {

        RuntimeException runException = new RuntimeException("exception found !!!!!");

        IndexOutOfBoundsException exception = new IndexOutOfBoundsException("Out of bounds");
        System.out.println(exception.getStackTrace());
        throw runException;
    }
}

