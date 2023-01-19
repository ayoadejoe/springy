package com.springy.springy;

public class QRCodeObject {
	
	private String clientFirstName, clientCode, clientLastName, clientOrganization, clientUrl, completed;
	private long clientID;
	

	public QRCodeObject(String clientFirstName, String clientCode, String clientLastName, String clientOrganization, String clientUrl, long clientID) {
		this.clientFirstName = clientFirstName;
		this.clientCode = clientCode;
		this.clientID = clientID;
		this.clientLastName = clientLastName;
		this.clientOrganization = clientOrganization;
		this.clientUrl = clientUrl;
		
		//if entered into database, return done
		
	}


	
	public String getClientFirstName() {
		return clientFirstName;
	}


	public String getClientCode() {
		return clientCode;
	}


	public String getClientLastName() {
		return clientLastName;
	}


	public String getClientOrganization() {
		return clientOrganization;
	}


	public String getClientUrl() {
		return clientUrl;
	}


	public long getClientID() {
		return clientID;
	}
	
	

}
