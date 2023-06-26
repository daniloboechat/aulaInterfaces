/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package calculosmatematicos;

/**
 *
 * @author danil
 */
public interface IConstantes {
    
    double PI = 3.141592;
    double MAX = 10;
    double MIN = 3;
   
    public static double areaCirculo(double raio){
        return PI * Math.pow(raio, 2);
    }
    
}
