package com.learn.spring.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.spring.entity.cdrEntity;

@Repository
public interface cdrRepository extends JpaRepository<cdrEntity, Long> {

}
