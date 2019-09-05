package tws.entity;

import java.io.Serializable;

public class ExpressDelivery implements Serializable {
    private int wayBillNum;
    private String addressee;
    private String telephone;
    private String weight;
    private String state;
    private String appointmentTime;

    public ExpressDelivery() {

    }

	public ExpressDelivery(int wayBillNum, String addressee, String telephone, String weight, String state,
			String appointmentTime) {
		this.wayBillNum = wayBillNum;
		this.addressee = addressee;
		this.telephone = telephone;
		this.weight = weight;
		this.state = state;
		this.appointmentTime = appointmentTime;
	}

	public int getWayBillNum() {
		return wayBillNum;
	}

	public void setWayBillNum(int wayBillNum) {
		this.wayBillNum = wayBillNum;
	}

	public String getAddressee() {
		return addressee;
	}

	public void setAddressee(String addressee) {
		this.addressee = addressee;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
 
}
