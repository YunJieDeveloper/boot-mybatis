package com.demo.bootmybatis.service.impl;

import com.demo.bootmybatis.mapper.PeopleMapper;
import com.demo.bootmybatis.mapper.UserMapper;
import com.demo.bootmybatis.model.People;
import com.demo.bootmybatis.model.User;
import com.demo.bootmybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/***
 * @Date 2017/12/26
 *@Description UserServiceImpl
 * @author zhanghesheng
 * */
@Service("userServiceImpl")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private PeopleMapper peopleMapper;

    @Override
    public User selectUser(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<User> selectAllUsers() {
        return userMapper.selectAllUsers();
    }

    @Override
   public People selectPeople(int peopleId) {
        return peopleMapper.selectByPrimaryKey(peopleId);
    }
}
