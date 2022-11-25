package com.nt.service;

import com.nt.binding.Passenger;
import com.nt.binding.Ticket;

public interface IService {

	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(String tcktNo);
}
