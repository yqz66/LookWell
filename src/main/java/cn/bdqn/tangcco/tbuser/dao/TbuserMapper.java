package cn.bdqn.tangcco.tbuser.dao;

import cn.bdqn.tangcco.entity.Roleuser;
import cn.bdqn.tangcco.entity.Tbuser;

/**
 * Created by Clown on 2017/07/25.
 */
public interface TbuserMapper {

    Roleuser queryUserByUsernameAndPassword(Tbuser tbuser);
}
