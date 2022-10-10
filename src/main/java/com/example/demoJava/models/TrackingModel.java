package com.example.demoJava.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Data
@Entity
@Table(name = "tracking")
public class TrackingModel {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	@Column(name = "appointmentId")
	private String appointmentId;

	@Column(name = "name")
	private String name;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "mail")
	private String mail;

	@Column(name = "phoneNumber")
	private String phoneNumber;

	@Column(name = "transportType")
	private String transportType;

	@Column(name = "companyName")
	private String companyName;

	@Column(name = "state")
	private String state;

	@Column(name = "latitude")
	private String latitude;

	@Column(name = "longitude")
	private String longitude;

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(final String appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(final String mail) {
		this.mail = mail;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(final String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getTransportType() {
		return transportType;
	}

	public void setTransportType(final String transportType) {
		this.transportType = transportType;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(final String companyName) {
		this.companyName = companyName;
	}

	public String getState() {
		return state;
	}

	public void setState(final String state) {
		this.state = state;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(final String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(final String longitude) {
		this.longitude = longitude;
	}

	public TrackingModel(final String id, final String appointmentId, final String name, final String lastName,
			final String mail, final String phoneNumber, final String transportType, final String companyName,
			final String state, final String latitude, final String longitude) {
		super();
		this.id = id;
		this.appointmentId = appointmentId;
		this.name = name;
		this.lastName = lastName;
		this.mail = mail;
		this.phoneNumber = phoneNumber;
		this.transportType = transportType;
		this.companyName = companyName;
		this.state = state;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public TrackingModel() {

	}

}
