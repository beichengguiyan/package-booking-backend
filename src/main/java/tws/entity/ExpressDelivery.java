package tws.entity;

import java.io.Serializable;

public class ExpressDelivery implements Serializable {
    private int wayBillNum;
    private String addressee;
    private String telephone;
    private String weight;

    public ExpressDelivery() {

    }

	public ExpressDelivery(int wayBillNum, String addressee, String telephone, String weight) {
		this.wayBillNum = wayBillNum;
		this.addressee = addressee;
		this.telephone = telephone;
		this.weight = weight;
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
 
}
