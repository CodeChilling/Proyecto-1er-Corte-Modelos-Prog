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
public class northWing extends Sector{

    @Override
    public void employName() {
        this.zone.setInCharge("Erik Thorvaldsson");    
    }
    @Override
    public void areasNames() {
        this.zone.setAreas("Sabana y desiertos");   
    }
    
}
