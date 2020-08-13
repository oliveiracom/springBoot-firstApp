package com.helloworld.heloworld.repositories;

import com.helloworld.heloworld.models.Speaker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
    
}