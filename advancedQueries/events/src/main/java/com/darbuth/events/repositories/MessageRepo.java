package com.darbuth.events.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.darbuth.events.models.Event;
import com.darbuth.events.models.Message;

@Repository
public interface MessageRepo extends CrudRepository<Message, Long> {

	@Query("SELECT m FROM Message m")
	List<Message> findAll();
	
	@Query("SELECT m FROM Message m WHERE m.event = ?1")
	List<Message> findAllMessagesForEvent(Event event);
}
