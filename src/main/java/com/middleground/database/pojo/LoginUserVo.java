package com.middleground.database.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class LoginUserVo implements Serializable {

    private String userId;
    private String userName;
    private String userAccount;
    private String user;

}
