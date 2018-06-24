package com.demo.bootmybatis.service;


import com.demo.bootmybatis.model.People;
import com.demo.bootmybatis.model.User;

import java.util.List;

public interface IUserService {
    People selectPeople(int peopleId);
     User selectUser(int userId);

    List<User> selectAllUsers();
}
