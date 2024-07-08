/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jul2;

/**
 *
 * @author mehak
 */
public class Dog extends Animal {
    public static void sound(){
        System.out.println("The dog barks");
    }
    public static void main(String args[]){
        sound();
        Animal a=new Animal();
        a.sound();
        
    }
}
