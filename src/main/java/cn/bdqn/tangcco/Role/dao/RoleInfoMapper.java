package cn.bdqn.tangcco.Role.dao;

import cn.bdqn.tangcco.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Clown on 2017/07/25.
 */
public interface RoleInfoMapper {
    public Integer queryCountRole();
    public List<Role> queryRoleByName(@Param("start") Integer start,@Param("rows") Integer rows);
}
