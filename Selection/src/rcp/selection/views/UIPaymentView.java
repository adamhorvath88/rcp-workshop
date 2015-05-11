package rcp.selection.views;

import rcp.selection.AbstractViewDto;

public class UIPaymentView extends AbstractViewDto {
	private float amount;

	private String beneficiary;
	private String currencySid;
	private String type;
	private String userSid;

	public float getAmount() {
		return amount;
	}

	public String getBeneficiary() {
		return beneficiary;
	}

	public String getCurrencySid() {
		return currencySid;
	}

	public String getType() {
		return type;
	}

	public String getUserSid() {
		return userSid;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}

	public void setCurrencySid(String currencySid) {
		this.currencySid = currencySid;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setUserSid(String userSid) {
		this.userSid = userSid;
	}
}
