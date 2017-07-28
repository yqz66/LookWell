package cn.bdqn.tangcco.grade.services.impl;

import cn.bdqn.tangcco.entity.GradeType;
import cn.bdqn.tangcco.grade.dao.GradeTypeMapper;
import cn.bdqn.tangcco.grade.services.GradeTypeService;
import cn.bdqn.tangcco.tools.PageUtil;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by 马保生 on 2017/7/25.
 */
@Service
public class GradeTypeServiceImpl implements GradeTypeService {

    @Inject
    private GradeTypeMapper gradeTypeMapper;

    @Override
    public PageUtil<GradeType> queryAll(Integer page, Integer rows,String gratypName) {

        PageUtil<GradeType> pageUtil = new PageUtil<>(page, rows);
        List<GradeType> list = gradeTypeMapper.queryAll(pageUtil.getStart(), rows,gratypName);
        Integer count = gradeTypeMapper.queryCountByGratypName(gratypName);
        pageUtil.setObjs(list);
        pageUtil.setTotal(count);
        return pageUtil;
    }
}
