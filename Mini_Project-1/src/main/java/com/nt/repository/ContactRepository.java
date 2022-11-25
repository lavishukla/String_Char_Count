package com.nt.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Serializable>{

}
