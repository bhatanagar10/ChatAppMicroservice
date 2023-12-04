package com.app.chatapp.repository;

import com.app.chatapp.entity.Messages;
import com.app.chatapp.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepositoryJPA extends JpaRepository<Messages , Integer> {
}
