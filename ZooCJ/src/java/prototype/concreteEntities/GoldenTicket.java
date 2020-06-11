/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.concreteEntities;

import prototype.abstractEntities.Ticket;

/**
 *
 * @author jackl
 */
public class GoldenTicket implements Ticket {

    private final String benefits = "Ruta guiada y acceso ilimitado a zonas de descanso.";
    private final String planName = "Golden";
    private final String price = "$10 USD por persona";
    private String visiterAmmount = "";
    private String inTime = "";
    private String outTime = "";

    @Override
    public Ticket clone() {
        Ticket deepSave = new GoldenTicket();
        deepSave.setVisiterAmmount(this.getVisiterAmmount());
        deepSave.setInTime(this.getInTime());
        deepSave.setOutTime(this.getOutTime());
        return deepSave;
    }

    @Override
    public String getVisiterAmmount() {
        return visiterAmmount;
    }

    @Override
    public void setVisiterAmmount(String visiterAmmount) {
        this.visiterAmmount = visiterAmmount;
    }

    @Override
    public String getInTime() {
        return inTime;
    }

    @Override
    public void setInTime(String inTime) {
        this.inTime = inTime;
    }

    @Override
    public String getOutTime() {
        return outTime;
    }

    @Override
    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }

    @Override
    public String getBenefits() {
        return benefits;
    }

    @Override
    public String getPlanName() {
        return planName;
    }

    @Override
    public String getPrice() {
        return price;
    }

}
