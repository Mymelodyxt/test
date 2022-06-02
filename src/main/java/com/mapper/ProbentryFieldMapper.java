package com.mapper;

import com.pojo.Probentry;
import com.pojo.ProbentryField;
import com.pojo.ProbentryVo;

import java.util.List;

public interface ProbentryFieldMapper {

    List<ProbentryField> getTreeField();


    List<ProbentryVo> getAll();

}
