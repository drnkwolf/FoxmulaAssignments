package com.foxmula.assignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    static ArrayList<Integer> arrayList = new ArrayList<>();
    static HashSet<String> hashSet = new HashSet<>();
    static TreeSet<String> treeSet = new TreeSet<>();

    public static void main(String[] args) {
        CollectionOperations.PopulatedArrayList(arrayList);

        if (CollectionOperations.PresentInArrayList(arrayList)) {
            System.out.println("Present");
        } else {
            System.out.println("Not Present");
        }

        CollectionOperations.PopulatedHasSet(hashSet);

        if (CollectionOperations.PresentInHashSet(hashSet)){
            System.out.println("Preset");
        }else{
            System.out.println("Not Present");
        }

        CollectionOperations.TraverseHashSet(hashSet);

        CollectionOperations.PopulatedTreeSet(treeSet);

        CollectionOperations.TraverseTreeSet(treeSet);

        CollectionOperations.OccurrenceInArrayList(arrayList);

        CollectionOperations.SumOfPair(arrayList);
    }
}
