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
public class Hipopotamo implements Animal{

    @Override
    public ArrayList getData(){
        ArrayList data = new ArrayList<String>();
        data.add("\"https://www.oasysparquetematico.com/wp-content/uploads/2019/03/shutterstock_1155910990.jpg\"");
        data.add("Hipopotamo");
        data.add("Kingodm: Animalia");
        data.add("Phylum: Chordata");
        data.add("Class: Mammalia");
        data.add("Order: Artiodactyla");
        data.add("Family: Hippopotamidae");
        data.add("Genuso: Hippopotamus");
        data.add("Specie: Hippopotamus amphibius");
        return data;
    }
    
}
