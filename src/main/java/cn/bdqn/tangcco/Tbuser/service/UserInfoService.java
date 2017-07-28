package cn.bdqn.tangcco.Tbuser.service;

import cn.bdqn.tangcco.entity.Tbuser;
import cn.bdqn.tangcco.tools.PageUtil;

/**
 * Created by ZUO-PC on 2017/7/25.
 */
public interface UserInfoService {
    PageUtil<Tbuser> queryTbuser(Integer page, Integer rows,String userName);
}
