package cn.codelizh.core.service.impl;

import cn.codelizh.core.dao.AdminUserMapper;
import cn.codelizh.core.entity.AdminUser;
import cn.codelizh.core.util.MD5Util;
import cn.codelizh.core.service.AdminUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author "Codelizh"
 * @Classname AdminUserServiceImpl
 * @Description TODO
 * @Date 2020/1/23 14:39
 * @Created by "Codelizh"
 */
@Service
public class AdminUserServiceImpl implements AdminUserService {

    @Resource
    private AdminUserMapper adminUserMapper;

    @Override
    public AdminUser login(String userName, String password) {
        String passwordMd5 = MD5Util.MD5Encode(password, "UTF-8");
        return adminUserMapper.login(userName, passwordMd5);
    }

    @Override
    public AdminUser getUserDetailById(Integer loginUserId) {
        return null;
    }

    @Override
    public boolean updatePassword(Integer loginUserId, String originalPassword, String newPassword) {
        AdminUser adminUser = adminUserMapper.selectByPrimaryKey(loginUserId);
        //当前用户非空才可以进行更改
        if (adminUser != null) {
            String originalPasswordMd5 = MD5Util.MD5Encode(originalPassword, "UTF-8");
            String newPasswordMd5 = MD5Util.MD5Encode(newPassword, "UTF-8");
            //比较是否正确
            if (originalPasswordMd5.equals(adminUser.getLoginPassword())) {
                //设置新密码并修改
                adminUser.setLoginPassword(newPasswordMd5);
                if (adminUserMapper.updateByPrimaryKeySelective(adminUser) > 0) {
                    //修改成功则返回true
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean updateName(Integer loginUserId, String loginUserName, String nickName) {
        AdminUser adminUser = adminUserMapper.selectByPrimaryKey(loginUserId);
        //当前用户非空才可以进行更改
        if (adminUser != null) {
            //设置新密码并修改
            adminUser.setLoginUserName(loginUserName);
            adminUser.setNickName(nickName);
            if (adminUserMapper.updateByPrimaryKeySelective(adminUser) > 0) {
                //修改成功则返回true
                return true;
            }
        }
        return false;
    }

    //    @Autowired
//    private AdminUserDao adminUserDao;
//
//    @Override
//    public PageResult getAdminUserPage(PageUtil pageUtil) {
//        //当前页码中的数据列表
//        List<AdminUser> users = adminUserDao.findAdminUsers(pageUtil);
//        //数据总条数 用于计算分页数据
//        int total = adminUserDao.getTotalAdminUser(pageUtil);
//        PageResult pageResult = new PageResult(total, pageUtil.getLimit(), pageUtil.getPage(), users);
//        return pageResult;
//    }
}
