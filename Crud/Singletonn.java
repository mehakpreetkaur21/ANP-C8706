/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Crud;

/**
 *
 * @author mehak
 */
//only one object
public class Singletonn {
    private static Singletonn instance;
    private Singletonn(){
    }
    public static Singletonn getInstance(){
        if(instance==null){
            instance =new Singletonn();
        }
        return instance;
    }
    public static void main(String args[]){
    Singletonn n=Singletonn.getInstance();
    Singletonn n1=Singletonn.getInstance();

    System.out.println(n); 
    System.out.println(n1);

    
    }
}
