package cn.codelizh.core.service;

import cn.codelizh.core.entity.AdminUser;

/**
 * @Classname AdminUserService
 * @Description TODO
 * @Date 2020/1/22 23:27
 * @Created by "Codelizh"
 */
public interface AdminUserService {

    AdminUser login(String userName, String password);

    AdminUser getUserDetailById(Integer loginUserId);

    boolean updatePassword(Integer loginUserId, String originalPassword, String newPassword);

    boolean updateName(Integer loginUserId, String loginUserName, String nickName);
}
