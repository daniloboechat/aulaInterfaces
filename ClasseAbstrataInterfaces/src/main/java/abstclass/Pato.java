/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstclass;

/**
 *
 * @author danil
 */
public class Pato extends Animal{

    public Pato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Quack Quack");
    }
}

