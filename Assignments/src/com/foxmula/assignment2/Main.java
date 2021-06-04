package com.foxmula.assignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    static ArrayList<Integer> arrayList = new ArrayList<>();
    static HashSet<String> hashSet = new HashSet<>();
    static TreeSet<String> treeSet = new TreeSet<>();

    public static void main(String[] args) {
        CollectionOperations.populateArrayList(arrayList);

        if (CollectionOperations.presentInArrayList(arrayList)) {
            System.out.println("Present");
        } else {
            System.out.println("Not Present");
        }

        CollectionOperations.populatedHasSet(hashSet);

        if (CollectionOperations.presentInHashSet(hashSet)){
            System.out.println("Preset");
        }else{
            System.out.println("Not Present");
        }

        CollectionOperations.traverseHashSet(hashSet);

        CollectionOperations.populatedTreeSet(treeSet);

        CollectionOperations.traverseTreeSet(treeSet);

        CollectionOperations.occurrenceInArrayList(arrayList);

        CollectionOperations.sumOfPair(arrayList);
    }
}
