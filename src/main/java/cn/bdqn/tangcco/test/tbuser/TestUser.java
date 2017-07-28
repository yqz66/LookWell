package cn.bdqn.tangcco.test.tbuser;

import cn.bdqn.tangcco.entity.Tbuser;
import cn.bdqn.tangcco.tbuser.service.TbuserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

/**
 * Created by 马保生 on 2017/7/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestUser {

    @Inject
    private TbuserService tbuserService;

    @Test
    public void testLogin() {
        Tbuser tbuser = new Tbuser();

        tbuser.setUserName("admin");
        tbuser.setPassword("1234");
        System.out.println(tbuserService.login(tbuser));
    }
}
