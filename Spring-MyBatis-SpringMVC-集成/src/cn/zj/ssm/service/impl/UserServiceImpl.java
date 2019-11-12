package cn.zj.ssm.service.impl;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zj.ssm.mapper.UserMapper;
import cn.zj.ssm.pojo.User;
import cn.zj.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper UserMapper;
	
	@Override
	public List<User> getlist() {
		
	  return UserMapper.getlist();
	}

	@Override
	public int delete(Integer id) {
		int delete = UserMapper.delete(id);
		return delete;
	}

	@Override
	public User login(String username,String password) {
		
		   User user = UserMapper.login(username);
		      
		   if (user!=null) {
		          if (user.getPassword().equals(password)) {
		        	  System.err.println(user);
		        	  return user;
			}else {
				 return null;
			}
		}
		      
		return null;
	}

}
