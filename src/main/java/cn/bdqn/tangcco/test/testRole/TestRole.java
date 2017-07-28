package cn.bdqn.tangcco.test.testRole;

import cn.bdqn.tangcco.entity.Menu;
import cn.bdqn.tangcco.roleMenu.services.RoleMenuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import javax.ws.rs.core.Context;
import java.util.List;

/**
 * Created by 马保生 on 2017/7/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestRole {

    @Inject
    private RoleMenuService roleMenuService;

    @Test
    public void testRole() {


    }
}
