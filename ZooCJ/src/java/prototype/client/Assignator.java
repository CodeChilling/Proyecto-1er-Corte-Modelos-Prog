/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.client;

import prototype.abstractEntities.Ticket;
import prototype.concreteEntities.GoldenTicket;
import prototype.concreteEntities.PlatinumTicket;
import prototype.concreteEntities.SilverTicket;

/**
 *
 * @author jackl
 */
public class Assignator {

    public Ticket assignation(int select) {
        switch (select) {
            case 1:
                return new PlatinumTicket();
            case 2:
                return new GoldenTicket();
            case 3:
                return new SilverTicket();
            default:
                return new SilverTicket();
        }
    }
}
