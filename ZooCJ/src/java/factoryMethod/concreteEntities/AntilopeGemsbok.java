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
public class AntilopeGemsbok implements Animal {

    @Override
    public ArrayList getData() {
        ArrayList data = new ArrayList<String>();
        data.add("\"https://www.fondoshd.mx/wallpapers/antilope-gemsbok-animal-wallpaper-other-1314.jpg\"");
        data.add("Antilope de Gemsbok");
        data.add("Kingodm: Animalia");
        data.add("Phylum: Chordata");
        data.add("Class: Mammalia");
        data.add("Order: Artiodactyla");
        data.add("Family: Bovidae");
        data.add("Genuso: Oryx");
        data.add("Specie: Oryx gazella");
        return data;
    }
}
