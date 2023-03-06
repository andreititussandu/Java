package Lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class ArrayListChallenge {
    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> groceryList=new ArrayList<>();
        boolean flag=true;
        while(flag) {
            printActions();
            int opt = scanner.nextInt();
            scanner.nextLine();
            switch (opt) {
                case 0:
                    System.out.println("List is final");
                    flag=false;
                    break;
                case 1:
                    //System.out.println("Item: ");
                    //String item=scanner.nextLine();
                    addItem(groceryList);
                    break;
                case 2:
                    removeItem(groceryList);
                    break;
                default:
                    flag=false;
                    break;
            }
        }
        System.out.println(groceryList);
    }

    public static void printActions(){
        System.out.println("Available actions: \n 0 - to shutdown \n 1 - to add items\n" +
                " 2 - to remove items");
    }

    public static void addItem(ArrayList <String> groceryList){
        //ArrayList<String> groceryList=new ArrayList<>();
        System.out.println("Enter an item: ");
        String item=scanner.nextLine();
        if(!groceryList.contains(item))
            groceryList.add(item);
        else
            System.out.println("Item is already on the list");
        groceryList.sort(Comparator.naturalOrder());
    }

    public static void removeItem(ArrayList <String> groceryList) {
        System.out.println("Enter an item: ");
        String item=scanner.nextLine();
        if(groceryList.contains(item))
            groceryList.remove(item);
        else
            System.out.println("Item is not on the list");
        groceryList.sort(Comparator.naturalOrder());
    }
}

