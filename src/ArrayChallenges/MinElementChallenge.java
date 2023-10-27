package ArrayChallenges;

import java.util.Scanner;

public class MinElementChallenge{
    private static Scanner scanner = new Scanner(System.in);
    private static int[] readIntegers(int count){
        System.out.println("Enter "+ count + " integer values: ");
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }
    private static int findMin(int[] array){
        int min=array[0];
        for (int i = 0; i < array.length; i++){
            if(array[i] < min)
                min=array[i];
        }
        return min;
    }
    public static void main(String[] args) {
        int count = scanner.nextInt();
        int[] myIntegers=readIntegers(count);
        int myMin=findMin(myIntegers);
        System.out.println("The minimum element in this array is: "+ myMin);
    }
}
