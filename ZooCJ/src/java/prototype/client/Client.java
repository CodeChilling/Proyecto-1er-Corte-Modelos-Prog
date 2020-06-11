/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.client;

import prototype.abstractEntities.Ticket;
import prototype.concreteEntities.*;

/**
 *
 * @author jackl
 */
public class Client {

    protected Ticket save;

    public Ticket cloned(Ticket deepSave) {
        this.save = deepSave;
        return save;
    }
}
