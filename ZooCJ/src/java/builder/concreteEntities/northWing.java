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
public class northWing extends Sector {

    @Override
    public void imageName() {
        this.zone.setImage("\"https://image.freepik.com/foto-gratis/retrato-mecanico-feliz-brazos-cruzo-sobre-fondo-blanco_13339-298917.jpg\"");
    }

    @Override
    public void employName() {
        this.zone.setInCharge("Erik Thorvaldsson");
    }

    @Override
    public void areasNames() {
        this.zone.setAreas("Sabana y desiertos");
    }

    @Override
    public void descriptionName() {
        this.zone.setDescription("Estudiante de la universidad StreetWarrios, con especializacion en el cuidado y la enseñanza de animales de climas calidos");
    }

}
