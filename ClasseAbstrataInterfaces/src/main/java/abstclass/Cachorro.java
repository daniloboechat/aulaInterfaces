/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstclass;

/**
 *
 * @author danil
 */
public class Cachorro extends Animal{

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Auau!");
    }  
    
    //Aqui, queremos um comportamento específico para o cachorro, então fizemos uma sobrescrita
    @Override
    public void dormir(){
        System.out.println("Doguinho dormindo zzZZzz..zZ");
    }
}
