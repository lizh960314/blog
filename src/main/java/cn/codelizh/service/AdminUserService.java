package cn.codelizh.service;

import cn.codelizh.utils.PageResult;
import cn.codelizh.utils.PageUtil;

/**
 * @Classname AdminUserService
 * @Description TODO
 * @Date 2020/1/22 23:27
 * @Created by "Codelizh"
 */
public interface AdminUserService {

    /**
     *
     * @Description TODO 分页功能
     * @param pageUtil
     * @return
     */
    PageResult getAdminUserPage(PageUtil pageUtil);

}
