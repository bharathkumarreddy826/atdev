package com.crud.atdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.crud.atdev.entity.StudentsEntity;

@Repository
public interface StudentsRepository extends JpaRepository<StudentsEntity, Integer> {

}
