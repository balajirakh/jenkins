package com.example.IRCTC.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ticket {

	@Id

	private int tid;
	private String tpnr;
	private String ticketStatus;
	private double tprice;
	
	public String getTpnr() {
		return tpnr;
	}
	public void setTpnr(String tpnr) {
		this.tpnr = tpnr;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public double getTprice() {
		return tprice;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public void setTprice(double tprice) {
		this.tprice = tprice;
	}
	@Override
	public String toString() {
		return "Ticket [tid=" + tid + ", tpnr=" + tpnr + ", ticketStatus=" + ticketStatus + ", tprice=" + tprice + "]";
	}
	
}
