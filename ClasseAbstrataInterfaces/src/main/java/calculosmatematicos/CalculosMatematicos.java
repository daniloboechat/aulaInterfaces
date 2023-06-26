/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculosmatematicos;

/**
 *
 * @author danil
 */
public class CalculosMatematicos implements IConstantes{
    
    private int valorA;
    private int valorB;

    public CalculosMatematicos(int valorA, int valorb) {
        this.valorA = valorA;
        this.valorB = valorb;
    }
    
   public double somaPi(){
       return valorA + valorB + PI;
   }
    
}
