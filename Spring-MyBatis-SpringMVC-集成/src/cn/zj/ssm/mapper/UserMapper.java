package cn.zj.ssm.mapper;

import java.util.List;

import cn.zj.ssm.pojo.User;

public interface UserMapper {
   
	List<User> getlist();
	
	int delete(Integer id);
	
	User login(String username);
}
