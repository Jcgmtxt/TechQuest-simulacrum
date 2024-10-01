package com.techQuest.domain.model;

import com.techQuest.util.enums.Roles;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

    private Long id;

    private String username;
    private String email;
    private String password;
    private Roles roles;

    //Auditable
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
