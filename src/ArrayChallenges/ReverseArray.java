package ArrayChallenges;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    private static Scanner scanner = new Scanner(System.in);
    /*private static int[] readIntegers(int count){
        System.out.println("Enter "+ count + " integer values: ");
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }*/
    private static void reverse(int[] array){
        int maxIndex = array.length-1;
        for (int i = 0; i < maxIndex/2; i++){
            int aux = array[maxIndex-i];
            array[maxIndex-i] = array[i];
            array[i] = aux;
        }
    }
    public static void main(String[] args) {
       int[] array= {1,3,5,7,9};
       System.out.println("Array= " + Arrays.toString(array));
       reverse(array);
       System.out.println("The reversed array= "+ Arrays.toString(array));
    }
}
