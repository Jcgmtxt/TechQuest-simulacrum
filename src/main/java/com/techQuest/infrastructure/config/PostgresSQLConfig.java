package com.techQuest.infrastructure.config;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
    basePackages = "com.techQuest.infrastructure.adapters.output.repository",
    entityManagerFactoryRef = "postgresEntityManagerFactory",
    transactionManagerRef = "postgresTransactionManager"
)
public class PostgresSQLConfig {

    @Bean(name = "postgresDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.postgres")
    public DataSource postgresDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "postgresEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean postgresEntityManagerFactory(EntityManagerFactoryBuilder builder){
        return builder
                .dataSource(postgresDataSource())
                .packages("com.techQuest.infrastructure.adapters.output.entity")
                .persistenceUnit("postgresql")
                .build();
    }

    @Bean(name = "postgresTransactionManager")
    public PlatformTransactionManager postgresTransactionManager(
            @Qualifier("postgresEntityManagerFactory") EntityManagerFactory postgresqlEntityManagerFactory) {
        return new JpaTransactionManager(postgresqlEntityManagerFactory);
    }
}
