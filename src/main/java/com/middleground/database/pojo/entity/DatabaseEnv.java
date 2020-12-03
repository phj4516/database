package com.middleground.database.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

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
public class DatabaseEnv implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据库环境id
     */
    @TableId(value = "database_env_id", type = IdType.AUTO)
    private Long databaseEnvId;

    /**
     * 数据库环境
     */
    private String databaseEnvName;


}
