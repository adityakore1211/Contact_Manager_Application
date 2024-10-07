package edu.bit.contact_manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.bit.contact_manager.entity.Contacts;

@Repository
public interface ContactRepository extends JpaRepository<Contacts, Integer> {

	

	

}