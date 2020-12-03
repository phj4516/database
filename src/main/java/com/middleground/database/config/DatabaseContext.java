package com.middleground.database.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 姬海威 [haiwei.ji@tigermed.net
 * @Date 2017-6-23 15:01
 */
@Component
public class DatabaseContext {

    @Autowired
    HttpServletRequest request;


/*    public void addLoginUserInfo(LoginUserVo loginUserVo) {
        if (null != request) {
            HttpSession session = request.getSession(true);
            session.setAttribute(ProjectCostConstants.SessionKey.USER_LOGIN_INFO, loginUserVo);
        }
    }

    public LoginUserVo getLoginUserInfo() {
        if (null != request) {
            HttpSession session = request.getSession(false);
            if (null != session && null != session.getAttribute(ProjectCostConstants.SessionKey.USER_LOGIN_INFO)) {
                return (LoginUserVo) session.getAttribute(ProjectCostConstants.SessionKey.USER_LOGIN_INFO);
            }
        }
        return null;
    }

    public String getUserName() {
        if (null != getLoginUserInfo()) {
            return getLoginUserInfo().getUser_name();
        }
        return "";
    }

    public String getUserType() {
        if (null != getLoginUserInfo()) {
            return getLoginUserInfo().getUser_type();
        }
        return "";
    }

    public String getUserId() {
        if (getLoginUserInfo() != null) {
            return getLoginUserInfo().();
        }
        return null;
    }*/


}
