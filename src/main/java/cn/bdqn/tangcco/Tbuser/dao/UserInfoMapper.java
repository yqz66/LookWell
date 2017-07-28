package cn.bdqn.tangcco.Tbuser.dao;

import cn.bdqn.tangcco.entity.Tbuser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by ZUO-PC on 2017/7/25.
 */
public interface UserInfoMapper {
    Integer queryCountTbuser(@Param ("userName") String userName);
    List<Tbuser> queryTbuser(@Param("start") Integer start, @Param("rows") Integer rows,@Param ("userName")String userName);
}
