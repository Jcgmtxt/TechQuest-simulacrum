package com.techQuest.infrastructure.adapters.output.mapper;

import com.techQuest.domain.model.UserModel;
import com.techQuest.infrastructure.adapters.output.entity.UserEntity;
import org.mapstruct.factory.Mappers;

public interface UserMapper  {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserEntity UserModelToUserEntity(UserModel userModel);
}
