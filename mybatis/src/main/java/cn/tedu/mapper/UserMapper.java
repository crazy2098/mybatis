package cn.tedu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.tedu.pojo.User;

public interface UserMapper {

	//<select id="find" resultType="User">
	List<User> find();
	
	//注解方式sql,查询某个用户  @param是必须的,映射参数
	@Select(value = { "select id,name,birthday,address from user where id=#{id}" })
	User get(@Param("id")Integer id);
	
	//增加用户
	@Insert(value = { "insert into user(id,name,birthday,address) "
			+ " values(null,#{name},#{birthday},#{address})" })
	void add(User user);
	
	//修改用户
	@Update(value = { "update user "
			+ " set name=#{name},birthday=#{birthday},address=#{address} "
			+ " where id=#{id}" })
	void update(User user);
	
	//删除用户
	@Delete(value = { "delete from user where id=#{id}" })
	void delete(Integer id);
}
