package com.techQuest.infrastructure.adapters.output.mapper;

import com.techQuest.domain.model.SkillModel;
import com.techQuest.infrastructure.adapters.output.entity.SkillEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface SkillsMapper {

    SkillsMapper INSTANCE = Mappers.getMapper(SkillsMapper.class);

    SkillEntity SkillModelToSkillEntity(SkillModel skillModel);
}
