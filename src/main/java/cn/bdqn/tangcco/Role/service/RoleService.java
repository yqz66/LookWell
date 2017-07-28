package cn.bdqn.tangcco.Role.service;

import cn.bdqn.tangcco.tools.PageUtil;

/**
 * Created by Clown on 2017/07/25.
 */
public interface RoleService {
    PageUtil queryRoleByName(Integer page,Integer rows,String roleName);
}
