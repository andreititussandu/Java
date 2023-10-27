package ArrayChallenges;

import java.util.Scanner;

public class SortingArray {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }
    public static int[] getIntegers ( int number){
        System.out.println("Enter " + number + " integer values");
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt(); }
        return array;
    }
    public static void printArray (int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static int [] sortIntegers (int [] array){
        int schimb = 0;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++)
                if (array[i] < array[i + 1]) {
                    schimb = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = schimb;
                    flag = true;
                }
        }
        return array;
    }
}
