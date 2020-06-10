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
public class CondorAndino implements Animal{

    @Override
    public ArrayList getData(){
        ArrayList data = new ArrayList<String>();
        data.add("\"https://www.animalesexoticos.top/wp-content/uploads/2019/10/c%C3%B3ndor-andino-3.png\"");
        data.add("Kingodm: Animalia");
        data.add("Phylum: Chordata");
        data.add("Class: Aves");
        data.add("Order: Cathartiformes");
        data.add("Family: Cathartidae");
        data.add("Genuso: Vultur");
        data.add("Specie: Vultur gryphus");
        return data;
    }
    
}