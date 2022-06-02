package com.mapper;

import com.pojo.Org;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrgMapper {

      List<Org> selectTest();
}
