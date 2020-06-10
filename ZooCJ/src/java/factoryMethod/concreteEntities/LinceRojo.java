/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factoryMethod.concreteEntities;

import factoryMethod.abstractEntities.Animal;
import java.util.ArrayList;

/**
 *
 * @author jackl
 */
public class LinceRojo implements Animal{

    @Override
    public ArrayList getData(){
        ArrayList data = new ArrayList<String>();
        data.add("https://www.animalesexoticos.org/wp-content/uploads/2020/02/lince-rojo.jpg");
        data.add("Kingodm: Animalia");
        data.add("Phylum: Chordata");
        data.add("Class: Mammalia");
        data.add("Order: Carnivora");
        data.add("Family: Felidae");
        data.add("Genuso: Lynx");
        data.add("Specie: Lynx rufus");
        return data;
    }
    
}
