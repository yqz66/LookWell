package cn.bdqn.tangcco.test.gradeType;

import cn.bdqn.tangcco.entity.GradeType;
import cn.bdqn.tangcco.grade.services.GradeTypeService;
import cn.bdqn.tangcco.tools.PageUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by 马保生 on 2017/7/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestGradeType {

    @Inject
    private GradeTypeService gradeTypeService;

    @Test
    public void testGradeType() {


        PageUtil<GradeType> pageUtil = gradeTypeService.queryAll(1,2,"二");
        System.out.println(pageUtil.getTotal());
        for (GradeType g : pageUtil.getObjs()) {
            System.out.println(g);
        }
    }
}
