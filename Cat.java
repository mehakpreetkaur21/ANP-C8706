/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jul1;

/**
 *
 * @author mehak
 */
public class Cat {
    public void sound(){
        System.out.println("meow meow");
    }
    public static void eat(){
        System.out.println("eating rat");
    }
    
    public static void main(String args[]){
        System.out.println("I am main");
        Cat c=new Cat();
        c.sound();
        Cat.eat();
        
    }

static{
        System.out.println("Hello world");
    }
}