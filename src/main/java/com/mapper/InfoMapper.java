package com.mapper;

import com.pojo.Info;
import com.pojo.Org;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface InfoMapper {

    List<Info> selectTest(Map map);

    List<Info> selectExport(Map map);


}
