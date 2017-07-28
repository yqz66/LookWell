package cn.bdqn.tangcco.Tbuser.service;

import cn.bdqn.tangcco.Tbuser.dao.UserInfoMapper;
import cn.bdqn.tangcco.entity.Tbuser;
import cn.bdqn.tangcco.tools.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ZUO-PC on 2017/7/25.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{
    @Resource
    private UserInfoMapper userInfoMapper;
    @Override
    public PageUtil<Tbuser> queryTbuser(Integer page, Integer rows,String userName) {
        Integer count=userInfoMapper.queryCountTbuser (userName);
        PageUtil pageUtil=new PageUtil (page,rows);
        List<Tbuser> tbuserList=userInfoMapper.queryTbuser (pageUtil.getStart (),rows,userName);
        pageUtil.setTotal (count);
        pageUtil.setObjs (tbuserList);
        return pageUtil;
    }
}
