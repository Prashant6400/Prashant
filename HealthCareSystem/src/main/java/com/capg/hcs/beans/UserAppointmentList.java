package com.capg.hcs.beans;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "UserAppointmentList")
public class UserAppointmentList {
	
	private Appointment appointment;
	@Column(name = "appointmentStatus")
	//private int userId;
	
	private String appointmentStatus;
	
	public Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	public String getAppointmentStatus() {
		return appointmentStatus;
	}
	public void setAppointmentStatus(String appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}
	public UserAppointmentList(Appointment appointment, String appointmentStatus) {
		super();
		this.appointment = appointment;
		this.appointmentStatus = appointmentStatus;
	}
	public UserAppointmentList() {
		super();
	}
	@Override
	public String toString() {
		return "AppointmentList [appointment=" + appointment + ", appointmentStatus=" + appointmentStatus + "]";
	}
	
	

}
