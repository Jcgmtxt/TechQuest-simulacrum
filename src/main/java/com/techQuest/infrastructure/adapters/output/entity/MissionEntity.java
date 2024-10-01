package com.techQuest.infrastructure.adapters.output.entity;

import com.techQuest.util.enums.DifficultyLevel;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity(name = "Mission")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class MissionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @Enumerated(EnumType.STRING)
    private DifficultyLevel difficultyLevel;

    //Auditable
    @Column(name = "created_by")
    @CreatedDate
    private Long createdBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
