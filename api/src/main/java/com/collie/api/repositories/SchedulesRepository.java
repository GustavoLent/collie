package com.collie.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collie.api.entities.ScheduleEntity;

@Repository
public interface SchedulesRepository extends JpaRepository<ScheduleEntity, Long> {

}
