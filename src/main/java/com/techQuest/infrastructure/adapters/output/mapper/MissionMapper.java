package com.techQuest.infrastructure.adapters.output.mapper;

import com.techQuest.domain.model.MissionModel;
import com.techQuest.infrastructure.adapters.output.entity.MissionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MissionMapper {
    MissionMapper INSTANCE = Mappers.getMapper(MissionMapper.class);

    MissionEntity MissionModelToMissionEntity(MissionModel missionModel);
}
