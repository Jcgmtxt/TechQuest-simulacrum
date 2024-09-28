package com.techQuest.infrastructure.config.repository;

import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("mysqlRepository")
public interface PostgresRepository extends JpaRepository<Entity, Long> {
}
