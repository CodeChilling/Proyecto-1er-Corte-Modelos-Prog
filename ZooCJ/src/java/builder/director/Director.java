/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package builder.director;

import builder.abstractEntities.Sector;
import builder.products.Zone;

/**
 *
 * @author jackl
 */
public class Director {
    
    public static void buildInfo(Sector sector){
        sector.buildZone();
        sector.employName();
        sector.areasNames();
    }
    
}
