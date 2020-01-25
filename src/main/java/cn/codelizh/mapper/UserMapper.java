package cn.codelizh.mapper;

import cn.codelizh.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Mapper
@Service //这个加的防止usermapper说找不到 后期需要把dao和service分开
public interface UserMapper {

    @Insert("insert into user (name,account_id,token,gmt_create,gmt_modified) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);

//    User findByMapper(String token);

    @Select("select * from user where token = #{token}")
    User findByMapper(@Param("token") String token); //如果形参不是对象得话，需要用注解
}
