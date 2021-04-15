package com.tts;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a whole number: ");
            numbers[i] = input.nextInt();
        }
        //  Print the array element
        for (int i : numbers) {
            System.out.print(i + ", ");
        }
        System.out.println("\n==== Hashmap ====");
        HashMap<String, String> carMap = new HashMap<>();
        carMap.put("Honda", "Accord");
        carMap.put("Range Rover", "Velar");
        carMap.put("Toyota", "Camry");
        carMap.put("Nissan", "Maxima");
        carMap.put("BMW", "I8");
        carMap.put("Audi", "S7");
        carMap.put("Maserati", "Levante");
        Scanner myScanner = new Scanner(System.in);
        String modelInput = "";
        System.out.println("Hi! What model car are you looking for? ");
        modelInput = myScanner.nextLine();
        String make = carMap.get(modelInput);
        if(make == null){
            System.out.println("Sorry we don't have that");
        } else {
            System.out.println("Awesome! We have that in our " + make + " section!");
        }
    }
}