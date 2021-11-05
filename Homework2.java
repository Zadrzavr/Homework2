/**
 * Java 1. Homework 2
 *
 * @author kirill
 * @version 05.11.2021
 */
class Homework2 {


    public static void main(String[] args) {
	    System.out.println(within10and20 (10 , 10));
        System.out.println(within10and20(5, 5));
        System.out.println(within10and20(10,5));
        isPositiveorNigative(0);
        System.out.println(isNegative(-1));
        printWordNTimes("Hi",5);
    }

    public static boolean within10and20 (int a, int b) {
        return (10 <= a + b) && (a + b <= 20);
    }

    public static void isPositiveorNigative (int a) {
        if (a >= 0) {
            System.out.println("число положительно");
        }  else {
            System.out.println("число отрицательное");
        }
    }

    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        }
        return false;
    }

    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i <= times; i++) {
            System.out.println("i =" + word);
        }
    }
    }


