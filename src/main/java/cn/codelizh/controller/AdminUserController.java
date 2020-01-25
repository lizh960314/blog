package cn.codelizh.controller;

import cn.codelizh.common.Constants;
import cn.codelizh.common.Result;
import cn.codelizh.common.ResultGenerator;
import cn.codelizh.service.AdminUserService;
import cn.codelizh.utils.PageResult;
import cn.codelizh.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Classname AdminUserController
 * @Description TODO
 * @Date 2020/1/23 14:47
 * @Created by "Codelizh"
 */
@RestController
@RequestMapping("/users")
public class AdminUserController {

    @Autowired
    private AdminUserService adminUserService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Result list(@RequestParam Map<String, Object> params) {
        if (StringUtils.isEmpty(params.get("page")) || StringUtils.isEmpty(params.get("limit"))) {
            return ResultGenerator.genErrorResult(Constants.RESULT_CODE_PARAM_ERROR, "参数异常！");
        }

        //查询列表数据
        PageUtil pageUtil = new PageUtil(params);
        return ResultGenerator.genSuccessResult(adminUserService.getAdminUserPage(pageUtil));
    }

}
