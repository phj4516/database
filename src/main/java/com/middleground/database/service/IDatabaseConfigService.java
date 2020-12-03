package com.middleground.database.service;

import com.middleground.database.pojo.entity.DatabaseConfig;
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
public interface IDatabaseConfigService extends IService<DatabaseConfig> {

    Long saveOrUpdateDatabaseConfig(DatabaseConfig databaseConfig);

    List<DatabaseConfig> listDatabaseConfig();

}
