package Utility;

import java.util.Scanner;

public class Utility {

    private static final Scanner scan = new Scanner(System.in);

    public static int readInteger() {
        return scan.nextInt();        //Scanner object to input Integer
    }

    public static double readDouble() {
        return scan.nextDouble();        //Scanner object to input Double
    }

    public static long readLong() {
        return scan.nextLong();        //Scanner object to input Long
    }

    public static String readString() {
        return scan.next();        //Scanner object to input String
    }

    public static String readStringLine() {
        return scan.nextLine();        //Scanner object to input String
    }

    public static float readFloat() {
        return scan.nextFloat();        //Scanner object to input Float
    }

}
