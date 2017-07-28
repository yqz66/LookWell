package cn.bdqn.tangcco.grade.dao;

import cn.bdqn.tangcco.entity.GradeType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 马保生 on 2017/7/25.
 */
public interface GradeTypeMapper {

    List<GradeType> queryAll(@Param("start")Integer start,@Param("rows")Integer rows,@Param("gratypName") String gratypName);


    Integer queryCountByGratypName(@Param("gratypName") String gratypName);
}
