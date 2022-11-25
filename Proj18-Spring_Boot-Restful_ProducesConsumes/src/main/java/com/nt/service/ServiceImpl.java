package com.nt.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.nt.binding.Passenger;
import com.nt.binding.Ticket;

@Service
public class ServiceImpl implements IService {
	
	private Map<String, Ticket> ticketsMap = new HashMap<>();

	String UUID =  java.util.UUID.randomUUID().toString();
	
	@Override
	public Ticket bookTicket(Passenger passenger) {
		
		Ticket ticket = new Ticket();
		ticket.setTcktNo(UUID);
		ticket.setPname(passenger.getPname());
		ticket.setFrom(passenger.getFrom());
		ticket.setTo(passenger.getTo());
		ticket.setTrainNo(1521);
		
		ticketsMap.put(UUID, ticket);
		
		return ticket;
	}

	@Override
	public Ticket getTicket(String tcktNo) {
		if(ticketsMap.containsKey(tcktNo)) {
			return ticketsMap.get(tcktNo);
		}
		return null;
	}

}
