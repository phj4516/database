package com.middleground.database.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.middleground.database.mapper.DatabaseConfigMapper;
import com.middleground.database.pojo.entity.DatabaseConfig;
import com.middleground.database.service.IDatabaseConfigService;
import com.middleground.database.util.CheckParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author jinzhiyuan
 * @since 2020-11-19
 */
@Service
public class DatabaseConfigServiceImpl extends ServiceImpl<DatabaseConfigMapper, DatabaseConfig> implements IDatabaseConfigService {

    @Autowired
    DatabaseConfigMapper databaseConfigMapper;

    @Override
    @Transactional
    public Long saveOrUpdateDatabaseConfig(DatabaseConfig databaseConfig) {
        CheckParameter.checkIsEmpty(databaseConfig);
        String databaseName = databaseConfig.getDatabaseName();
        CheckParameter.checkIsEmpty(databaseName);
        Long databaseEnvId = databaseConfig.getDatabaseEnvId();
        CheckParameter.checkIsEmpty(databaseEnvId);
        String databaseIp = databaseConfig.getDatabaseIp();
        CheckParameter.checkIsEmpty(databaseIp);
        String databaseLibName = databaseConfig.getDatabaseLibName();
        CheckParameter.checkIsEmpty(databaseLibName);
        String databaseUsername = databaseConfig.getDatabaseUsername();
        CheckParameter.checkIsEmpty(databaseUsername);
        String databasePassword = databaseConfig.getDatabasePassword();
        CheckParameter.checkIsEmpty(databasePassword);
        String url = "jdbc:mysql://" + databaseIp + ":3306/" + "databaseLibName" + "&characterEncoding=utf-8&serverTimezone=Asia/Shanghai&allowMultiQueries=true";
        databaseConfig.setDatabaseUrl(url);
        Long databaseConfigId = databaseConfig.getDatabaseConfigId();
        this.saveOrUpdate(databaseConfig);
        return databaseConfig.getDatabaseConfigId();
    }

    @Override
    public List<DatabaseConfig> listDatabaseConfig() {
        return this.list();
    }
}
