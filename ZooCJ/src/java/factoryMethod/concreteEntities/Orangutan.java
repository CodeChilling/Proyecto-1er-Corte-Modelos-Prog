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
public class Orangutan implements Animal{

    @Override
    public ArrayList getData(){
        ArrayList data = new ArrayList<String>();
        data.add("\"https://www.lavanguardia.com/r/GODO/LV/p5/WebSite/2018/12/17/Recortada/img_fcastanyer_20170215-102351_imagenes_lv_terceros_orangutan-kwKH-U453613798289iF-992x558@LaVanguardia-Web.jpg\"");
        data.add("Orangutan");
        data.add("Kingodm: Animalia");
        data.add("Phylum: Chordata");
        data.add("Class: Mammalia");
        data.add("Order: Primates");
        data.add("Family: Hominidae");
        data.add("Genuso: Pongo");
        data.add("Specie: Pongo abelii");
        return data;
    }
    
}
