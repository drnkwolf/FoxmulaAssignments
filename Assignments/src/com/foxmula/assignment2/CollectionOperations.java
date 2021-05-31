package com.foxmula.assignment2;

import java.util.*;

public class CollectionOperations {
    private static Scanner scan = new Scanner(System.in);

    public static void PopulatedArrayList(ArrayList<Integer> arrayList){
        while(true){
            System.out.println("Enter a integer to populated ArrayList: ");
            System.out.println("Or 0 to exit");

            int choice = Integer.parseInt(scan.nextLine());

            if (choice == 0){
                break;
            }

            arrayList.add(choice);
        }
    }

    public static boolean PresentInArrayList(ArrayList<Integer> arrayList) {
        System.out.print("Enter a string to search in the ArrayList: ");
        int elementToFind = Integer.parseInt(scan.nextLine());

        if (arrayList.contains(elementToFind)) {
            return true;
        }
        return false;
    }

    public static void PopulatedHasSet(HashSet<String> hashSet){
        while(true){
            System.out.println("Enter a string to populated HashSet: ");
            System.out.println("Or 0 to exit");

            String choice = scan.nextLine();

            if (choice.equals("0")){
                break;
            }

            hashSet.add(choice);
        }
    }

    public static boolean PresentInHashSet(HashSet<String> hashSet){
        System.out.print("Enter a string to search in the HashSet: ");
        String elementToFind = scan.nextLine();

        if (hashSet.contains(elementToFind)){
            return true;
        }
        return false;
    }

    public static void TraverseHashSet(HashSet<String> hashSet){
        Iterator<String> iterator = hashSet.iterator();

        System.out.print("Now Traversing the HashSet: ");

        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public static void PopulatedTreeSet(TreeSet<String> treeSet){
        while(true){
            System.out.println("Enter a string to populated TreeSet: ");
            System.out.println("Or 0 to exit");

            String choice = scan.nextLine();

            if (choice.equals("0")){
                break;
            }

            treeSet.add(choice);
        }
    }

    public static void TraverseTreeSet(TreeSet<String> treeSet){
        Iterator<String> iterator = treeSet.iterator();

        System.out.print("Now Traversing the TreeSet: ");

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void OccurrenceInArrayList(ArrayList<Integer> arrayList){
        for (int i = 0; i < arrayList.size(); i++){
            int element = arrayList.get(i);
            int frequency = Collections.frequency(arrayList, element);

            System.out.println(element + " occurs " + frequency + " times.");
        }
    }

    public static void SumOfPair(ArrayList<Integer> arrayList){
        System.out.print("Enter in integer: ");
        int sum = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < arrayList.size(); i++){
            int number1 = arrayList.get(i);
            int number2 = sum - number1;

            if (arrayList.contains(number2)){
                System.out.println(number1 + " + " + number2 + " = " + sum);
            }
        }
    }
}
