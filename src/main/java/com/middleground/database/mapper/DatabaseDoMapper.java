package com.middleground.database.mapper;

import com.middleground.database.pojo.entity.DatabaseDo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jinzhiyuan
 * @since 2020-11-19
 */
@Mapper
public interface DatabaseDoMapper extends BaseMapper<DatabaseDo> {

    List<DatabaseDo> getListByMissionId(@Param("missionId") Long missionId);
}
