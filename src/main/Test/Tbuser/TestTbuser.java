package Tbuser;

import base.TestBase;
import cn.bdqn.tangcco.Tbuser.service.UserInfoService;
import cn.bdqn.tangcco.entity.Tbuser;
import cn.bdqn.tangcco.tools.PageUtil;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ZUO-PC on 2017/7/25.
 */
public class TestTbuser extends TestBase{
    @Resource
    private UserInfoService userInfoService;
    @Test
    public void testqueryTbuser(){
        PageUtil<Tbuser> t=userInfoService.queryTbuser (1,2,"admin");
        System.out.println (t.getTotal ());
        List<Tbuser> tbuserList=t.getObjs ();
        for (int i=0;i<tbuserList.size ();i++){
            System.out.println (tbuserList.get (i));
        }

    }
}
