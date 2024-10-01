package com.techQuest.domain.model;

import com.techQuest.util.enums.DifficultyLevel;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MissionModel {

    private Long id;
    private String name;
    private String description;
    private DifficultyLevel difficultyLevel;

    //Auditable
    private Long createdBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
