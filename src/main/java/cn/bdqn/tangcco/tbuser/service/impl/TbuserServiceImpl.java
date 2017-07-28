package cn.bdqn.tangcco.tbuser.service.impl;

import cn.bdqn.tangcco.entity.Roleuser;
import cn.bdqn.tangcco.entity.Tbuser;
import cn.bdqn.tangcco.tbuser.dao.TbuserMapper;
import cn.bdqn.tangcco.tbuser.service.TbuserService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by Clown on 2017/07/25.
 */
@Service
public class TbuserServiceImpl implements TbuserService {

    @Inject
    private TbuserMapper tbuserMapper;


    @Override
    public Roleuser login(Tbuser tbuser) {
        return tbuserMapper.queryUserByUsernameAndPassword(tbuser);
    }
}
