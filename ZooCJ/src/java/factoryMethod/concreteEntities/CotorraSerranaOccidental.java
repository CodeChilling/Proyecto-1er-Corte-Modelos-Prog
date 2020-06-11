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
public class CotorraSerranaOccidental implements Animal {

    @Override
    public ArrayList getData() {
        ArrayList data = new ArrayList<String>();
        data.add("\"https://test.cdn.download.ams.birds.cornell.edu/api/v1/asset/49035301/1200\"");
        data.add("Cotorra Serrana Occidental");
        data.add("Kingodm: Animalia");
        data.add("Phylum: Chordata");
        data.add("Class: Aves");
        data.add("Order: Psittaciformes");
        data.add("Family: Psittacidae");
        data.add("Genuso: Rhynchopsitta");
        data.add("Specie: Rhynchopsitta pachyrhyncha");
        return data;
    }

}
