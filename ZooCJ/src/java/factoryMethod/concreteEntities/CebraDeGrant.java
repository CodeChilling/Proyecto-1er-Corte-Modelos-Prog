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
public class CebraDeGrant implements Animal{
    @Override
    public ArrayList getData(){
        ArrayList data = new ArrayList<String>();
        data.add("\"https://www.reserveafricainesigean.fr/content/uploads/2017/04/fiche-grant.jpg\"");
        data.add("Kingodm: Animalia");
        data.add("Phylum: Chordata");
        data.add("Class: Mammalia");
        data.add("Order: Perissodactyla");
        data.add("Family: Equidae");
        data.add("Genuso: Equus");
        data.add("Specie: Equus quagga");
        return data;
    }
}
