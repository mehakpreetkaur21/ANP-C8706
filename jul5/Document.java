/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jul5;

/**
 *
 * @author mehak
 */
public class Document implements Printable{
    String text="Hello";
    @Override 
    public void input(){
        System.out.println(text);
    }
    public static void main(String args[]){
 Printable p=new Document();
 p.input();
    }
}
