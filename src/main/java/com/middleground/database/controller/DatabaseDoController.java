package com.middleground.database.controller;

import com.middleground.database.pojo.CommonResponse;
import com.middleground.database.pojo.entity.DatabaseDo;
import com.middleground.database.service.IDatabaseDoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(description = "databaseDo", tags = {"数据库操作接口控制层"})
@RequestMapping("/databaseDo")
@RestController
public class DatabaseDoController {
    @Autowired
    IDatabaseDoService databaseDoService;

    @GetMapping("/list/{missionId}")
    @ApiOperation(value = "通过任务id获取该任务下所有的执行sql", httpMethod = "GET")
    public CommonResponse listByMissionId(@PathVariable Long missionId) {
        List<DatabaseDo> databaseDoList = databaseDoService.listByMissionId(missionId);
        return new CommonResponse(databaseDoList);
    }

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "保存或更新执行sql的内容", httpMethod = "POST")
    public CommonResponse saveOrUpdateDatabaseDo(@RequestBody DatabaseDo databaseDo) {
        Long id = databaseDoService.saveOrUpdateDatabaseDo(databaseDo);
        return new CommonResponse(id);
    }

    @GetMapping("/getOne/{doId}")
    @ApiOperation(value = "获取数据库执行sql", httpMethod = "GET")
    public CommonResponse getOne(@PathVariable Long doId) {
        DatabaseDo byId = databaseDoService.getById(doId);
        return new CommonResponse(byId);
    }
}
