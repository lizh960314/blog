package cn.codelizh.core.dao;

import cn.codelizh.core.entity.AdminUser;
import org.apache.ibatis.annotations.Param;

/**
 * @Classname AdminUserMapper
 * @Description TODO
 * @Date 2020/1/26 13:26
 * @Created by "Codelizh"
 */
public interface AdminUserMapper {
    int insert(AdminUser record);

    int insertSelective(@Param("record") AdminUser record);

    /**
     * 登陆方法
     *
     * @param userName
     * @param password
     * @return
     */
    AdminUser login(@Param("userName") String userName, @Param("password") String password);

    AdminUser selectByPrimaryKey(Integer adminUserId);

    int updateByPrimaryKeySelective(AdminUser record);

    int updateByPrimaryKey(AdminUser record);
}
