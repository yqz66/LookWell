package cn.bdqn.tangcco.Role.service;

import cn.bdqn.tangcco.Role.dao.RoleInfoMapper;
import cn.bdqn.tangcco.entity.Role;
import cn.bdqn.tangcco.tools.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Clown on 2017/07/25.
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleInfoMapper roleInfoMapper;
    @Override
    public PageUtil queryRoleByName(Integer page, Integer rows) {

        PageUtil pageUtil=new PageUtil (page,rows);
        List<Role> roleList=roleInfoMapper.queryRoleByName (pageUtil.getStart (),rows);
        Integer count=roleInfoMapper.queryCountRole ();
        pageUtil.setTotal (count);
        pageUtil.setObjs (roleList);
        return pageUtil;
    }
}
