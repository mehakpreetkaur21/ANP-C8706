/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author mehak
 */
class SumCalculator extends Thread {
    private  int sum = 0;
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
    }
    public int getSum() {
        return sum;
    }
}