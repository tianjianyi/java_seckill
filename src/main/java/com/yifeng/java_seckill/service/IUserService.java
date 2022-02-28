package com.yifeng.java_seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yifeng.java_seckill.pojo.User;
import com.yifeng.java_seckill.vo.LoginVo;
import com.yifeng.java_seckill.vo.RespBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yifeng
 * @since 2022-02-27
 */
public interface IUserService extends IService<User> {
    /**
     * 功能描述: 登录
     */
    RespBean doLogin(LoginVo loginVo, HttpServletRequest request, HttpServletResponse response);
    /**
     * 功能描述: 根据cookie获取用户
     */
    User getUserByCookie(String userTicket, HttpServletRequest request, HttpServletResponse response);

}
