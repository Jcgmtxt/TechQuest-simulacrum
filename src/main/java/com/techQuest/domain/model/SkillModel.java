package com.techQuest.domain.model;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SkillModel {
    private Long id;
    private String name;
    private String description;
}
