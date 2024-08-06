/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author mehak
 */
import java.util.Scanner;
import java.util.TreeSet;
public class TreeSetExample {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of strings: ");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");
        TreeSet<String> set = new TreeSet<>();
        for (String word : words) {
            set.add(word);
        }
        System.out.println(set);
        scanner.close();
    }
}


