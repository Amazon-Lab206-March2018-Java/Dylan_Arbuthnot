package com.darbuth.events.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.darbuth.events.models.Event;
import com.darbuth.events.models.User;
import com.darbuth.events.models.UserEvent;

@Transactional
@Repository
public interface UserEventRepo extends PagingAndSortingRepository<UserEvent, Long>, CrudRepository<UserEvent, Long> {

	@Modifying
	@Query("DELETE from UserEvent ue WHERE user = ?1 AND event = ?2")
	void deleteUserEventByUserAndEvent(User user, Event event);
}
