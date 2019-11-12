package cn.zj.ssm.service;

import java.util.List;

import cn.zj.ssm.pojo.User;

public interface UserService {

	List<User> getlist();
	
	int delete(Integer id);
	
	User login(String username,String passString);
	
}

