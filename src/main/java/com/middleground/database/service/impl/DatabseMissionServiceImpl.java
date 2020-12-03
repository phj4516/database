package com.middleground.database.service.impl;

import com.middleground.database.pojo.entity.DatabaseMission;
import com.middleground.database.mapper.DatabaseMissionMapper;
import com.middleground.database.service.IDatabseMissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jinzhiyuan
 * @since 2020-11-19
 */
@Service
public class DatabseMissionServiceImpl extends ServiceImpl<DatabaseMissionMapper, DatabaseMission> implements IDatabseMissionService {

    @Override
    @Transactional
    public Long saveOrUpdateDatabaseConfig(DatabaseMission databaseConfig) {
        this.saveOrUpdate(databaseConfig);
        return databaseConfig.getDatabaseMissionId();
    }
}
