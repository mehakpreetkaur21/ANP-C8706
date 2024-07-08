/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jul5;

/**
 *
 * @author mehak
 */

public class CreditCard implements PaymentMethod{
    public class Date{
        int date=0,month=0,year=0;
        public Date(int date,int month,int year){
            this.date=date;
            this.month=month;
            this.year=year;
        }
        public String toString(){//overriding the toString() method  
  return date+" "+month+" "+year;  
 }  
        
    }
    int cardNumber=1234;
    Date expirationDate=new Date(12,12,2024);
    @Override
    public void pay(){
        System.out.println(cardNumber);
    }
     @Override
    public void getPaymentDetails(){
        System.out.println(expirationDate);
        
    }
    
}
