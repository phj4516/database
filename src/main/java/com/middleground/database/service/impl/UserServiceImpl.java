package com.middleground.database.service.impl;

import com.middleground.database.pojo.entity.User;
import com.middleground.database.mapper.UserMapper;
import com.middleground.database.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jinzhiyuan
 * @since 2020-12-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
