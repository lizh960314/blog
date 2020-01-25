package cn.codelizh.dao;

import cn.codelizh.entity.AdminUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Classname AdminUserDao
 * @Description TODO
 * @Date 2020/1/22 22:44
 * @Created by "Codelizh"
 */
public interface AdminUserDao {

    /**
     *
     * @Description TODO 根据参数查询用户列表
     * @param
     * @return
     */
    List<AdminUser> findAdminUsers(Map param);

    /**
     *
     * @Description TODO 查询用户总数
     * @param
     * @returns
     */
    int getTotalAdminUser(Map param);

    /**
     * @param
     * @return
     * @Description TODO 根据登录名和密码获取用户记录
     */
    AdminUser getAdminUserByUserNameAndPassword(@Param("userName") String username, @Param("password") String password);


}
