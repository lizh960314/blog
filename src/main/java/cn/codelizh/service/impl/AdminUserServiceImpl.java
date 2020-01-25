package cn.codelizh.service.impl;

import cn.codelizh.dao.AdminUserDao;
import cn.codelizh.entity.AdminUser;
import cn.codelizh.service.AdminUserService;
import cn.codelizh.utils.PageResult;
import cn.codelizh.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author "Codelizh"
 * @Classname AdminUserServiceImpl
 * @Description TODO
 * @Date 2020/1/23 14:39
 * @Created by "Codelizh"
 */
@Service("adminUserService")
public class AdminUserServiceImpl implements AdminUserService {

    @Autowired
    private AdminUserDao adminUserDao;

    @Override
    public PageResult getAdminUserPage(PageUtil pageUtil) {
        //当前页码中的数据列表
        List<AdminUser> users = adminUserDao.findAdminUsers(pageUtil);
        //数据总条数 用于计算分页数据
        int total = adminUserDao.getTotalAdminUser(pageUtil);
        PageResult pageResult = new PageResult(total, pageUtil.getLimit(), pageUtil.getPage(), users);
        return pageResult;
    }
}
