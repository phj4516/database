package com.middleground.database.service;

import com.middleground.database.pojo.entity.DatabaseDo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jinzhiyuan
 * @since 2020-11-19
 */
public interface IDatabaseDoService extends IService<DatabaseDo> {

    List<DatabaseDo> listByMissionId(Long missionId);

    Long saveOrUpdateDatabaseDo(DatabaseDo databaseDo);
}
