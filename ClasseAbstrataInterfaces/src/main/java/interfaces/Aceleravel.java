/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

/**
 *
 * @author danil
 */
public interface Aceleravel {
    
    public abstract void acelera();
    
    public default void novaFeature(){
            System.out.println("Nova funcionalidade padrãp");
    }
}
