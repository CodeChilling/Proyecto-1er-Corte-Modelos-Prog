/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package builder.abstractEntities;

import builder.products.Zone;

/**
 *
 * @author jackl
 */
public abstract class Sector {
    protected Zone zone;

    public Zone getZone() {
        return zone;
    }
    public void buildZone(){
        this.zone = new Zone();
    }

    /*public void setZone(Zone zone) {
        this.zone = zone;
    }*/
    
    public abstract void descriptionName();
    public abstract void imageName();
    public abstract void employName();
    public abstract void areasNames();
    
}
