/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.abstractEntities;

/**
 *
 * @author jackl
 */
public interface Ticket {

    public String getBenefits();

    public String getPlanName();

    public String getVisiterAmmount();

    public void setVisiterAmmount(String visiterAmmount);

    public String getPrice();

    public String getInTime();

    public void setInTime(String inTime);

    public String getOutTime();

    public void setOutTime(String outTime);

    public Ticket clone();

}
