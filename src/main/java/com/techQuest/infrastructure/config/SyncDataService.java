package com.techQuest.infrastructure.config;

import com.techQuest.infrastructure.config.repository.MySQLRepository;
import com.techQuest.infrastructure.config.repository.PostgresRepository;
import jakarta.persistence.Entity;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SyncDataService {

    @Autowired
    private MySQLRepository mySQLRepository;

    @Autowired
    private PostgresRepository postgresRepository;

    @Transactional
    public void saveData(Entity entity) {
        try {
            mySQLRepository.save(entity);
        } catch (Exception e) {
            System.out.println("Data not saved in MySQL");
        } finally {
            System.out.println("Data saved in MySQL successfully");
        }

        try {
            postgresRepository.save(entity);
        } catch (Exception e) {
            System.out.println("Data not saved in Postgres");
        } finally {
            System.out.println("Data saved in Postgres successfully");
        }
    }

}
