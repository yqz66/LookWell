package Role;

import base.TestBase;
import cn.bdqn.tangcco.Role.service.RoleService;
import cn.bdqn.tangcco.entity.Role;
import cn.bdqn.tangcco.tools.PageUtil;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ZUO-PC on 2017/7/25.
 */
public class TestRole extends TestBase{
    @Resource
    private RoleService roleService;
    @Test
    public void TestQueryRole(){
        PageUtil<Role> r=roleService.queryRoleByName (1,2);
        System.out.println (r.getTotal ());
        List<Role> roleList=r.getObjs ();
        for (int i=0;i<roleList.size ();i++){
            System.out.println (roleList.get (i));
        }
    }
}
