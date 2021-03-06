package com.springboot.racemanage.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.springboot.racemanage.po.Raceinfo;

@Mapper
public interface RaceinfoDao {
    int insert(@Param("pojo") Raceinfo pojo);

    int insertSelective(@Param("pojo") Raceinfo pojo);

    int insertList(@Param("pojos") List<Raceinfo> pojo);

    int update(@Param("pojo") Raceinfo pojo);
}
