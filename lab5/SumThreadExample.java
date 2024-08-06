/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author mehak
 */
public class SumThreadExample implements Runnable{
    int sum=0;
    public void run(){
        for (int i=0;i<=100;i++){
            sum+=i;
    }
    }
    public static void main(String args[]){
        SumThreadExample obj=new SumThreadExample();
        Thread t=new Thread(obj);
        t.start();
        try{
        t.join()
        ;}
        catch(InterruptedException e){
        }
        System.out.println(obj.sum);
    }
    
}


