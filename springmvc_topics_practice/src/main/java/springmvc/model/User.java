package springmvc.model;

import java.sql.Date;
import java.util.ArrayList;

public class User {

	

	String userFname;
	long userId;
	String userAddress;
	String userGender;
	String userCountry;
	String userDob;
	long userPin;
	
	public String getUserFname() {
		return userFname;
	}

	public void setUserFname(String userFname) {
		this.userFname = userFname;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserCountry() {
		return userCountry;
	}

	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	public String getUserDob() {
		return userDob;
	}

	public void setUserDob(String userDob) {
		this.userDob = userDob;
	}

	public long getUserPin() {
		return userPin;
	}

	public void setUserPin(long userPin) {
		this.userPin = userPin;
	}

	@Override
	public String toString() {
		return "User [userFname=" + userFname + ", userId=" + userId + ", userAddress=" + userAddress + ", userGender="
				+ userGender + ", userCountry=" + userCountry + ", userDob=" + userDob + ", userPin=" + userPin + "]";
	}




}
