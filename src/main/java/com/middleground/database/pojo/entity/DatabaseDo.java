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
public class DatabaseDo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 执行数据库语句id
     */
    @TableId(value = "database_do_id", type = IdType.AUTO)
    private Long databaseDoId;

    /**
     * 任务id
     */
    private Long databaseMissionId;

    /**
     * 数据库配置id
     */
    private Long databaseConfigId;

    /**
     * 数据库执行语句
     */
    private String sqlStr;

    /**
     * 0未执行 1成功 2失败
     */
    private Integer result;

    /**
     * 确认人
     */
    private Long confirmUserId;

    /**
     * 是否确认 0待确认 1通过 2驳回
     */
    private Integer confirmType;

    /**
     * 最终确认执行人
     */
    private Long finalUserId;

    /**
     * 是否确认 0待确认 1通过 2驳回
     */
    private Integer finalConfirmType;

    /**
     * 备注
     */
    private String remark;


}
