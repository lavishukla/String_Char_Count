package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.binding.Passenger;
import com.nt.binding.Ticket;
import com.nt.service.IService;

@RestController
public class TicketRestController {
	
	@Autowired
	public IService service;
	
	@PostMapping(
			value="/ticket",
			consumes = "application/json",
			produces = "application/json"
	)
	public ResponseEntity<Ticket> bookTicketController(@RequestBody Passenger passenger){
		Ticket ticket = service.bookTicket(passenger);
		return new ResponseEntity<>(ticket, HttpStatus.CREATED);
	}
	
	@GetMapping(
			value="/ticket/{tcktNo}",
			produces = "application/json"
		)
	public ResponseEntity<Ticket> getTicketController(@PathVariable("tcktNo") String tcktNo){
		Ticket ticket = service.getTicket(tcktNo);
		return new ResponseEntity<>(ticket, HttpStatus.CREATED);
	}
	
}
