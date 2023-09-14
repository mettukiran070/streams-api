package org.example.interview.practise;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

// https://blog.devgenius.io/java-8-coding-and-programming-interview-questions-and-answers-62512c44f062

public class Java8Streams {
    public static void main(String[] args) {
        findEvenIntegersFromList();
        findNumbsStartingWith1();
        findDuplicateNums();
        findTheTotalNumberOfEle();
        findMaxNumFromList();
        firstNonRepeatedCharacterFromStr();
        findFirstRepeatedCharcterFromStr();
        sortListOfNums();
    }

    // Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
    public static void findEvenIntegersFromList() {
        System.out.println("find out all the even numbers that exist in the list");
        List<Integer> intList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        intList.stream().filter(item -> item % 2 == 0)
                .forEach(item -> System.out.print(item + " "));
        System.out.println();
    }

    //Given a list of integers, find out all the numbers starting with 1 using Stream functions?
    public static void findNumbsStartingWith1() {
        System.out.println("find out all the numbers starting with 1 in the list");
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        myList.stream().map(n -> n + "").filter(s -> s.startsWith("1"))
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
    }

    // How to find duplicate elements in a given integers list in java using Stream functions?
    public static void findDuplicateNums() {
        System.out.println("find out allthe duplicate elements in a given integers list");
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        Set<Integer> mySet = new HashSet<>();
        myList.stream().filter(n -> !mySet.add(n)).forEach(n -> System.out.print(n + " "));
        System.out.println();
    }

    // Given a list of integers, find the total number of elements present in the list using Stream functions?
    public static void findTheTotalNumberOfEle() {
        System.out.println("find the total number of elements present in the list");
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        System.out.println(myList.stream().count());
    }

    //Given a list of integers, find the maximum value element present in it using Stream functions?
    public static void findMaxNumFromList() {
        System.out.println("find max num from list");
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        System.out.println(myList.stream().max(Integer::compare).get());
    }

    // Given a String, find the first non-repeated character in it using Stream functions?
    public static void firstNonRepeatedCharacterFromStr() {
        System.out.println("find first non repeated character from string");
        String input = "Java articles are Awesome";
        Character result = input.chars()
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(f -> f.getValue() == 1L)
                .map(m -> m.getKey())
                .findFirst()
                .get();
        System.out.println(result);
    }

    // Given a String, find the first repeated character in it using Stream functions?
    public static void findFirstRepeatedCharcterFromStr() {
        System.out.println("find first repeated character from string");
        String input = "Java Articles are Awesome";
        Character result = input.chars()
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(f -> f.getValue() > 1)
                .map(m -> m.getKey())
                .findFirst()
                .get();
        System.out.println(result);
    }

    // Given a list of integers, sort all the values present in it using Stream functions?
    public static void sortListOfNums() {
        System.out.println("Sort the List of Integers");
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        myList.stream().sorted((i1, i2) -> i2 - i1).forEach(i -> System.out.print(i + " "));
        System.out.println();
    }

}
