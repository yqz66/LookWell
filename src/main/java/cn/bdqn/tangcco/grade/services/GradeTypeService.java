package cn.bdqn.tangcco.grade.services;

import cn.bdqn.tangcco.entity.GradeType;
import cn.bdqn.tangcco.tools.PageUtil;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 马保生 on 2017/7/25.
 */
public interface GradeTypeService {




    PageUtil<GradeType> queryAll(Integer page, Integer rows,String gratypName);
}

