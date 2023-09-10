package org.example.interview.practise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://blog.devgenius.io/java-8-coding-and-programming-interview-questions-and-answers-62512c44f062

public class Java8Streams {
    public static void main(String[] args) {
        System.out.println("find out all the even numbers that exist in the list");
        findEvenIntegersFromList();
        System.out.println();
        System.out.println("find out all the numbers starting with 1 in the list");
        findNumbsStartingWith1();
        System.out.println();
        System.out.println("find out allthe duplicate elements in a given integers list");
        findDuplicateNums();
        System.out.println();
        System.out.println("find the total number of elements present in the list");
        findTheTotalNumberOfEle();
    }

    // Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
    public static void findEvenIntegersFromList() {
        List<Integer> intList = Arrays.asList(10,15,8,49,25,98,32);
        intList.stream().filter(item -> item % 2 == 0)
                .forEach(item -> System.out.print(item +" "));
    }

    //Given a list of integers, find out all the numbers starting with 1 using Stream functions?
    public static void findNumbsStartingWith1() {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream().map(n -> n + "").filter(s -> s.startsWith("1"))
                .forEach(n -> System.out.print(n + " "));
    }

    // How to find duplicate elements in a given integers list in java using Stream functions?
    public static void findDuplicateNums() {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> mySet = new HashSet<>();
        myList.stream().filter(n -> !mySet.add(n)).forEach(n -> System.out.print(n + " "));
    }

    // Given the list of integers, find the first element of the list using Stream functions?
    public static void findFirstElement() {

    }

    // Given a list of integers, find the total number of elements present in the list using Stream functions?
    public static void findTheTotalNumberOfEle() {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println(myList.stream().count());
    }
}
