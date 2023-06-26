/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstclass;

import java.util.List;

/**
 *
 * @author danil
 */
public abstract class Animal {
    
    private String nome;
    private boolean acordado;

    public Animal(String nome) {
        this.nome = nome;
        this.acordado = true;
    }
    
    public abstract void emitirSom();
    
    public void dormir(){
        this.acordado = false;
        System.out.println("ZzzZZzZZZ");
    }
    
    public static void imprimeNomes(List<Animal> animais){
        
        for (Animal a : animais) {
            System.out.println(a.nome);
        }
       
    }
}
