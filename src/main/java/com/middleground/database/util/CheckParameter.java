package com.middleground.database.util;

import com.middleground.database.constant.Status;
import com.middleground.database.exception.CommonException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.ObjectUtils;

import java.io.Serializable;

/**
 * 检查参数
 * Created by chengwei on 2017/8/3 19:33.
 */
public class CheckParameter implements Serializable {

    /**
     * 检查对象为空
     *
     * @param objects
     * @throws CommonException
     */
    public static void objectIsNull(Object... objects) throws CommonException {
        objectIsNull(Status.MISS_REQUIRED_PARAMETER, objects);
    }

    /***
     * 检查对象为空
     * @param objects
     * @param result 提示信息
     * @throws CommonException
     */
    public static void objectIsNull(Status result, Object... objects) throws CommonException {
        for (Object object : objects) {
            if (object == null) {
                throw new CommonException(result);
            }
        }
    }

    public static void objectIsNotNull(Status result, Object... objects) throws CommonException {
        for (Object object : objects) {
            if (object != null) {
                throw new CommonException(result);
            }
        }
    }

    /**
     * 检查单个对象为空
     * @param object 对象
     * @param result 结果
     * @param params 占位信息
     * @throws CommonException
     */
    public static void objectIsNull(Object object, Status result, Object... params) throws
            CommonException {
        if (object == null) {
            throw new CommonException(result, params);
        }
    }

//	/**
//	 * 检查对象和字符串为空
//	 * @param object
//	 * @param strings
//	 * @throws CommonException
//	 */
//	public static void objectAndStringIsNull(Object object, String ...strings) throws CommonException {
//		objectAndStringIsNull(object,UserCenterResultConstant.PARAMETER_ERROR, strings);
//	}
//
//	/**
//	 * 检查对象和字符串为空
//	 * @param object
//	 * @param result 提示信息
//	 * @param strings
//	 * @throws CommonException
//	 */
//	public static void objectAndStringIsNull(Object object, UserCenterResultConstant result, String ...strings) throws CommonException {
//		objectIsNull(result, object);
//		stringIsEmpty(result, strings);
//	}


    /***
     * 检查字符串为空
     * @param strs
     * @throws CommonException
     */
    public static void stringIsEmpty(String... strs) throws CommonException {
        stringIsEmpty(Status.MISS_REQUIRED_PARAMETER, strs);
    }

    /**
     * 检查字符串str是否为空
     *
     * @param fieldValue 字符串
     * @param fieldName  字段名称
     * @throws CommonException
     */
    public static void checkIsEmpty(Object fieldValue, String fieldName) throws CommonException {

        if (ObjectUtils.isEmpty(fieldValue)) {
            throw new CommonException(Status.MISS_REQUIRED_PARAMETER, fieldName);
        }
    }
    /**
     * 检查字符串str是否为空
     *
     * @param fieldValue 字符串
     * @throws CommonException
     */
    public static void checkIsEmpty(Object fieldValue) throws CommonException {

        if (ObjectUtils.isEmpty(fieldValue)) {
            throw new CommonException(Status.MISS_REQUIRED_PARAMETER);
        }
    }

    /**
     * 检查字符串str是否为空
     *
     * @param fieldValue 字符串
     * @param fieldName  字段名称
     * @throws CommonException
     */
    public static void checkStrIsEmpty(String fieldValue, String fieldName) throws CommonException {

        if (StringUtils.isEmpty(fieldValue)) {
            throw new CommonException(Status.MISS_REQUIRED_PARAMETER, fieldName);
        }
    }

    /**
     * 检查表达式是否为真
     *
     * @param fieldValue
     * @param result
     * @throws CommonException
     */
    public static void checkIsEmpty(Object fieldValue, Status result, String fieldName) throws CommonException {
        if (ObjectUtils.isEmpty(fieldValue)) {
            throw new CommonException(result, fieldName);
        }
    }

    /**
     * 检查表达式是否为真
     *
     * @param expression
     * @param result
     * @throws CommonException
     */
    public static void isTrue(boolean expression, Status result, String fieldName) throws CommonException {
        if (!expression) {
            throw new CommonException(result, fieldName);
        }
    }

    /***
     * 检查字符串为空
     * @param strs
     * @throws CommonException
     */
    public static void stringIsEmpty(Status result, String... strs) throws CommonException {
        for (String str : strs) {
            if (StringUtils.isEmpty(str)) {
                throw new CommonException(result);
            }
        }
    }


}
