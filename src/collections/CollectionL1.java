package collections;

import java.util.*;

public class CollectionL1 {

    public static void main(String[] args) {
        System.out.println("Collection");
        Collection<Integer> nums = new ArrayList<Integer>();

        nums.add(6);
        nums.add(5);
        nums.add(2);
        nums.add(8);
        nums.add(4);
        nums.add(9);
        nums.add(4);

        for(int num: nums){
            System.out.print(num + " ");
        }
        // instead of for loop you can use iterator

        Iterator<Integer> it = nums.iterator();
        // Iterator is an interface
        // it has a method called hasNext() which returns true if there is another element to be returned
        //
        System.out.println("\nIterator using while loop");
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

        System.out.println(nums);

        // Collections doesn't have indexes like arrays

        // in that case if you want to work with indexes you can use List

        System.out.println("List");

        List<Integer> nums2 = new ArrayList<Integer>();

        nums2.add(6);
        nums2.add(5);
        nums2.add(2);
        nums2.add(8);
        nums2.add(4);
        nums2.add(9);
        nums2.add(4);

        for(int num=0; num<nums2.size(); num++){
            System.out.print(nums2.get(num) + " ");
        }
        System.out.println(nums2);


        // List can have duplicates which means it can have the same value more than once

        // but set doesn't have duplicates
        System.out.println("Set");

        Set<Integer> nums3 = new HashSet<Integer>();

        nums3.add(90);
        nums3.add(5);
        nums3.add(2);
        nums3.add(80);
        nums3.add(4);
        nums3.add(9);
        nums3.add(4);

        for(int num: nums3){
            System.out.print(num + " ");
        }
        System.out.println(nums3);

        // if you want the set to be sorted you can use TreeSet

        System.out.println("TreeSet");
        Set<Integer> nums4 = new TreeSet<Integer>(nums3);

        for(int num: nums4){
            System.out.print(num + " ");
        }
        System.out.println(nums4);



    }
}
