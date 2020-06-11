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
public class southWing extends Sector{
    
    @Override
    public void imageName(){
        this.zone.setImage("\"https://www.uniformesguadalajara.mx/wp-content/uploads/2013/10/Uniformes-Camisolas-Guadalajara-003.jpg\"");
    }
    
    @Override
    public void employName() {
        this.zone.setInCharge("Darío el Grande");    
    }
    @Override
    public void areasNames() {
        this.zone.setAreas("Bosques templados");   
    }

    @Override
    public void descriptionName() {
        this.zone.setDescription("Egresado de la universidad Bullets, especializado en el cuidado y atencion a animales de bosques templados");
    }
    
}
