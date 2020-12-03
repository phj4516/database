package com.middleground.database.service.impl;

import com.middleground.database.pojo.entity.DatabaseEnv;
import com.middleground.database.mapper.DatabaseEnvMapper;
import com.middleground.database.service.IDatabaseEnvService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jinzhiyuan
 * @since 2020-11-19
 */
@Service
public class DatabaseEnvServiceImpl extends ServiceImpl<DatabaseEnvMapper, DatabaseEnv> implements IDatabaseEnvService {

    @Override
    public List<DatabaseEnv> getEnv() {
        List<DatabaseEnv> list = this.list();
        return list;
    }
}
