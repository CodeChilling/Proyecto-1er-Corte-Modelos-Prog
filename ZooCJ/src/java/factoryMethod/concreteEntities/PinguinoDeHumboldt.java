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
public class PinguinoDeHumboldt implements Animal{

    @Override
    public ArrayList getData(){
        ArrayList data = new ArrayList<String>();
        data.add("\"https://test.cdn.download.ams.birds.cornell.edu/api/v1/asset/116084691/1800\"");
        data.add("Pinguino De Humboldt");
        data.add("Kingodm: Animalia");
        data.add("Phylum: Chordata");
        data.add("Class: Aves");
        data.add("Order: Sphenisciformes");
        data.add("Family: Spheniscidae");
        data.add("Genuso: Spheniscus");
        data.add("Specie: Spheniscus humboldti");
        return data;
    }
    
}
