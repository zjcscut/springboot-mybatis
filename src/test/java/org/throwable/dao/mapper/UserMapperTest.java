package org.throwable.dao.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.throwable.Application;
import org.throwable.entity.User;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @author zhangjinci
 * @version 2017/2/16 11:58
 * @function
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void insertUser() throws Exception {
        User user = new User();
        user.setAge(24);
        user.setName("zjcscut");
        user.setEmail("zjcscut@163.com");
        user.setBirth(new Date());
        int insertCount = userMapper.insertUser(user);

        assertEquals(1,insertCount);
        //插入完毕之后,主键会set进去更新的实体
        System.out.println("id -- > " + user.getId());

    }

}