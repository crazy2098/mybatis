package cn.tedu.service;

import java.util.List;

import cn.tedu.pojo.User;

public interface UserService {

	//查询全部用户
	List<User> find();
	//查询某个用户
	User get(Integer id);
	//增加用户
	void add(User user);
	//修改用户
	void update(User user);
	//删除用户
	void delete(Integer id);
	
}
