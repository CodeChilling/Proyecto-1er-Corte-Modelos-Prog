/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package builder.director;

import builder.abstractEntities.Sector;
import builder.products.Zone;
import builder.concreteEntities.*;
/**
 *
 * @author jackl
 */
public class Director {
    private Sector nuevo;
    
    public void setSector(Sector op){
        nuevo = op;
    }
    
    public Zone getZone(){
        return nuevo.getZone();
    }
    
    
    public static void buildInfo(Sector sector){
        sector.buildZone();
        sector.imageName();
        sector.employName();
        sector.areasNames();
        sector.descriptionName();
    }
    
}
