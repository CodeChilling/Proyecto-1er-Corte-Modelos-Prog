/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package builder.concreteEntities;

import builder.abstractEntities.Sector;

/**
 *
 * @author jackl
 */
public class eastWing extends Sector{

    

    @Override
    public void employName() {
       this.zone.setInCharge("Alejandro Magno");
    }
    @Override
    public void areasNames() {
        this.zone.setAreas("Franja costera(zonas frias) y aviario");    
    }
    
}
