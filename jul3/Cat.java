/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jul3;

/**
 *
 * @author mehak
 */
public class Cat extends Animal{
      @Override
       public void sound(){
        System.out.println("meow meow");
    }
    public static void main(String args[]){
 Animal a=new Animal();
 Animal c =new Cat();
        a.sound();
        c.sound();
        
    }
}
