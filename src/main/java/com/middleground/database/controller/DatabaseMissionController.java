package com.middleground.database.controller;

import com.middleground.database.pojo.CommonResponse;
import com.middleground.database.pojo.entity.DatabaseMission;
import com.middleground.database.service.IDatabseMissionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(description = "databaseMission", tags = {"数据库任务接口控制层"})
@RequestMapping("/databaseMission")
@RestController
public class DatabaseMissionController {

    @Autowired
    IDatabseMissionService databseMissionService;

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "保存或更新数据库任务", httpMethod = "POST")
    public CommonResponse saveOrUpdateDatabaseConfig(@RequestBody DatabaseMission databaseMission) {
        Long id = databseMissionService.saveOrUpdateDatabaseConfig(databaseMission);
        return new CommonResponse(id);
    }

    @GetMapping("/list")
    @ApiOperation(value = "数据库任务列表", httpMethod = "GET")
    public CommonResponse listDatabaseConfig() {
        List<DatabaseMission> list = databseMissionService.list();
        return new CommonResponse(list);
    }

    @GetMapping("/getOne/{missionId}")
    @ApiOperation(value = "获取数据库任务", httpMethod = "GET")
    public CommonResponse getOne(@PathVariable Long missionId) {
        DatabaseMission databaseMission = databseMissionService.getById(missionId);
        return new CommonResponse(databaseMission);
    }

}
