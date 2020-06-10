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
public class GorilaDeTierrasBajas implements Animal{

    @Override
    public ArrayList getData(){
        ArrayList data = new ArrayList<String>();
        data.add("https://www.gorillas-world.com/wp-content/uploads/gorila_occidental.jpg");
        data.add("Kingodm: Animalia");
        data.add("Phylum: Chordata");
        data.add("Class: Mammalia");
        data.add("Order: Primates");
        data.add("Family: Hominidae");
        data.add("Genuso: Gorillini");
        data.add("Specie: Gorilla gorilla");
        return data;
    }
    
}
