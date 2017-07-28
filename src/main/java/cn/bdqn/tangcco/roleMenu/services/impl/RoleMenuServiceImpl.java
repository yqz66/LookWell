package cn.bdqn.tangcco.roleMenu.services.impl;

import cn.bdqn.tangcco.entity.Menu;
import cn.bdqn.tangcco.roleMenu.dao.RoleMenuMapper;
import cn.bdqn.tangcco.roleMenu.services.RoleMenuService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by 马保生 on 2017/7/27.
 */
@Service
public class RoleMenuServiceImpl implements RoleMenuService {

    @Inject
    private RoleMenuMapper roleMenuMapper;
    @Override
    public List<Menu> queryMenuByRoleId(Integer roleId) {
        return roleMenuMapper.queryMenuByRoleId(roleId);
    }

    @Override
    public List<Menu> queryMenuByParentId(Integer parentId, Integer roleId) {
        return roleMenuMapper.queryMenuByParentId(parentId,roleId);
    }
}
