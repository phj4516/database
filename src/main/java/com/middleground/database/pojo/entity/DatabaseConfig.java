package com.middleground.database.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jinzhiyuan
 * @since 2020-11-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class DatabaseConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据库配置主键id
     */
    @TableId(value = "database_config_id", type = IdType.AUTO)
    private Long databaseConfigId;

    /**
     * 数据库名称
     */
    private String databaseName;

    /**
     * 数据库所属环境id
     */
    private Long databaseEnvId;

    /**
     * 数据库ip地址 例如 172.18.10.10
     */
    private String databaseIp;

    /**
     * 数据库库名 small-liquorice
     */
    private String databaseLibName;

    /**
     * 数据库用户名
     */
    private String databaseUsername;

    /**
     * 数据库密码
     */
    private String databasePassword;

    /**
     * 数据库url
     */
    private String databaseUrl;


}
