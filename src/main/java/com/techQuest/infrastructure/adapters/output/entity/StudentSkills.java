package com.techQuest.infrastructure.adapters.output.entity;

import com.techQuest.domain.model.UserModel;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity(name = "student_skills")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class StudentSkills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "student_id")
    private UserEntity Student;

    @ManyToOne
    @MapsId("skillId")
    @JoinColumn(name = "skill_id")
    private SkillEntity Skill;

    @Column(name = "assigned_at")
    private LocalDateTime AssignedAt;

    @ManyToOne
    @JoinColumn(name = "assigned_by")
    private UserModel UserModel;

}
