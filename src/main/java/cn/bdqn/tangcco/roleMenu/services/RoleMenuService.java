package cn.bdqn.tangcco.roleMenu.services;

import cn.bdqn.tangcco.entity.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 马保生 on 2017/7/27.
 */
public interface RoleMenuService {

    List<Menu> queryMenuByRoleId(Integer roleId);

    List<Menu> queryMenuByParentId(@Param("parentId") Integer parentId,
                                   @Param("id") Integer roleId);
}
