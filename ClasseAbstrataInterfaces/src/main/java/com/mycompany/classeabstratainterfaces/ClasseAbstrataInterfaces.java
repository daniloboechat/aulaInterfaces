/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classeabstratainterfaces;

import calculosmatematicos.CalculosMatematicos;
import calculosmatematicos.IConstantes;

/**
 *
 * @author danil
 */
public class ClasseAbstrataInterfaces {

    public static void main(String[] args) {
        CalculosMatematicos cm;
        cm = new CalculosMatematicos(10, 5);
        cm.somaPi();
        
        double area = IConstantes.areaCirculo(13);
        double v = cm.MAX;
        
        /*
        Gato gato = new Gato("Péricles");
        Cachorro dog = new Cachorro("Eustáquio");
        Pato pato = new Pato("Josefina");
        
        ArrayList animais = new ArrayList();
        animais.add(dog);
        animais.add(gato);
        animais.add(pato);
        
        Animal.imprimeNomes(animais);
   
        double valor = IConstantes.MAX;
        double area = IConstantes.areaCirculo(20);
        */
         //gato.emitirSom();
        //dog.emitirSom();
        
        //gato.dormir();
        //dog.dormir();
    }
}
