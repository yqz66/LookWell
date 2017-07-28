package cn.bdqn.tangcco.tbuser.service;

import cn.bdqn.tangcco.entity.Roleuser;
import cn.bdqn.tangcco.entity.Tbuser;

/**
 * Created by Clown on 2017/07/25.
 */
public interface TbuserService {

    Roleuser login(Tbuser tbuser);
}
