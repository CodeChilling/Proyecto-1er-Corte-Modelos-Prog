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
public class westWing extends Sector{
    
    @Override
    public void imageName(){
        this.zone.setImage("\"https://www.lindleyarq.com/images/articles/5c5cb1b003105hombre-supervisando-tareas-mantenimiento-local-comercial.jpg\"");
    }
    
    @Override
    public void employName() {
        this.zone.setInCharge("Genghis Khan");    
    }
    @Override
    public void areasNames() {
        this.zone.setAreas("Bosques tropicales");   
    }

    @Override
    public void descriptionName() {
        this.zone.setDescription("Tecnico en el sena de cuidado de animales con habitat de bosques tropicales");
    }
    
}
