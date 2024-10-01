package com.techQuest.infrastructure.adapters.output.entity;

import com.techQuest.domain.model.UserModel;
import com.techQuest.util.enums.MissionStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity(name = "mission_assignment")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class MissionAssignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private UserModel student;

    @ManyToOne
    @JoinColumn(name = "mission_id")
    private MissionEntity mission;

    @ManyToOne
    @JoinColumn(name = "assigned_by")
    private UserModel assignedBy;

    @Enumerated(EnumType.STRING)
    private MissionStatus status;

    private LocalDateTime assignedAt;
    private LocalDateTime completedAt;
    private Float evaluationScore;
    private String evaluationComments;
}
