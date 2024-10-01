package com.techQuest.infrastructure.adapters.output.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Mission_required_skills")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class MissionRequiredSkills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @MapsId("missionId")
    @JoinColumn(name = "mission_id")
    private MissionEntity mission;

    @ManyToOne
    @MapsId("skillId")
    @JoinColumn(name = "skill_id")
    private SkillEntity Skill;
}
