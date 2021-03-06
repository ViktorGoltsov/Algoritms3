package Utils;

import java.util.Arrays;

public class Utils {

    // в этот класс складываем только переменные или методы
    public static void line() {
        System.out.println("_____________________________________________________________");
    }

    public static void ln() {
        System.out.println("____________________  __");
    }


    public static int i = 1;

    public static void task() {
        System.out.println("_____________________________________________________");
        System.out.println("                      Task " + i);
        System.out.println("-----------------------------------------------------");
        i++;
    }

    public static void task(int n) {
        System.out.println("_____________________________________________________");
        System.out.println("                      Task " + n);
        System.out.println("-----------------------------------------------------");
        i++;
    }

    public static void verifyEquals(String expectedResult, String actualResult) {
        if (expectedResult.equalsIgnoreCase(actualResult)) {
            System.out.println("\u001B[32m" + "pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "fail " + "\u001B[0m");
        }
    }

    public static void verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "fail " + "\u001B[0m");
        }
    }

    public static void verifyEquals(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "fail " + "\u001B[0m");
        }
    }

    public static void verifyEquals(boolean expectedResult, boolean actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "fail " + "\u001B[0m");
        }
    }

    public void printA() {
        System.out.println("A");
    }

    public static void arrayToPrint(double[] array) {
        if (array.length == 0) {
            System.out.println(Arrays.toString(array));
        } else {

            System.out.print("[");
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + ", ");
            }
            System.out.print(array[array.length - 1]);
            System.out.println("]");
        }
    }

    public static void arrayToPrint(String[] array) {
        if (array.length == 0) {
            System.out.println(Arrays.toString(array));
        } else {
            System.out.print("[");
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + ", ");
            }
            System.out.print(array[array.length - 1]);
            System.out.println("]");
        }
    }

    public static void arrayToPrint(int[] array) {
        if (array.length == 0) {
            System.out.println(Arrays.toString(array));
        } else {
            System.out.print("[");
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + ", ");
            }
            System.out.print(array[array.length - 1]);
            System.out.println("]");
        }
    }

    public static void arrayToPrint(boolean[] array) {
        if (array.length == 0) {
            System.out.println(Arrays.toString(array));
        } else {

            System.out.print("[");
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + ", ");
            }
            System.out.print(array[array.length - 1]);
            System.out.println("]");
        }
    }

    public static int[] checkzero(int[] arr) {
        if (arr.length == 0) {
            return (new int []{});
        } else {
            return arr;
        }
    }

    public static String[] checkzero(String[] arr) {
        if (arr.length == 0) {
            return (new String[] {});
        } else {
            return arr;
        }
    }

    public static double[] checkzero(double[] arr) {
        if (arr.length == 0) {
            return (new double[]{});
        } else {
            return arr;
        }
    }

    public static boolean[] checkzero(boolean[] arr) {
        if (arr.length == 0) {
            return (new boolean[]{});
        } else {
            return arr;
        }
    }

    public static boolean checkIfCharIsLetter (char character) {
        if (character >= 97 && character <= 122 || character >= 65 && character <= 90) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkIfCharIsNumber (char character) {
        if (character >= 48 && character <= 57) {
            return true;
        } else {
            return false;
        }
    }



}
