package cn.zj.ssm.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.zj.ssm.contorller.UserContorller;
import cn.zj.ssm.mapper.UserMapper;
import cn.zj.ssm.pojo.User;
import cn.zj.ssm.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class UserServiceTest{
    
	@Autowired
	private DataSource dataSource;
	@Autowired
	private UserService userservice;
	@Test
	public void test() {
		   try {
			Connection connection = dataSource.getConnection();
			System.err.println(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void test01() {
		   List<User> getlist = userservice.getlist();
		        for (User user : getlist) {
					System.out.println(user);
				}
	}

}
