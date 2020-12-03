package com.middleground.database.service;

import com.middleground.database.pojo.entity.DatabaseMission;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jinzhiyuan
 * @since 2020-11-19
 */
public interface IDatabseMissionService extends IService<DatabaseMission> {

    Long saveOrUpdateDatabaseConfig(DatabaseMission databaseConfig);
}
