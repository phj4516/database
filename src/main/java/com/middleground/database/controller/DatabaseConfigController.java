package com.middleground.database.controller;

import com.middleground.database.pojo.CommonResponse;
import com.middleground.database.pojo.entity.DatabaseConfig;
import com.middleground.database.pojo.entity.DatabaseEnv;
import com.middleground.database.service.IDatabaseConfigService;
import com.middleground.database.service.IDatabaseEnvService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(description = "databaseConfig", tags = {"数据库配置接口控制层"})
@RequestMapping("/databaseConfig")
@RestController
public class DatabaseConfigController {
    @Autowired
    IDatabaseEnvService databaseEnvService;

    @Autowired
    IDatabaseConfigService databaseConfigService;

    @GetMapping("/get/env")
    @ApiOperation(value = "获取环境", httpMethod = "GET")
    public CommonResponse getEnv() {
        List<DatabaseEnv> databaseEnvList = databaseEnvService.getEnv();
        return new CommonResponse(databaseEnvList);
    }

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "保存或更新数据库配置", httpMethod = "POST")
    public CommonResponse saveOrUpdateDatabaseConfig(@RequestBody DatabaseConfig databaseConfig) {
        Long id = databaseConfigService.saveOrUpdateDatabaseConfig(databaseConfig);
        return new CommonResponse(id);
    }

    @GetMapping("/list")
    @ApiOperation(value = "数据库配置列表", httpMethod = "GET")
    public CommonResponse listDatabaseConfig() {
        List<DatabaseConfig> databaseConfigList = databaseConfigService.listDatabaseConfig();
        return new CommonResponse(databaseConfigList);
    }

    @GetMapping("/getOne/{configId}")
    @ApiOperation(value = "获取单个配置", httpMethod = "GET")
    public CommonResponse getOne(@PathVariable Long configId) {
        DatabaseConfig databaseConfig = databaseConfigService.getById(configId);
        return new CommonResponse(databaseConfig);
    }
}
