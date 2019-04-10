package com.smilcool.server.core.dao;

import com.smilcool.server.core.pojo.po.RuleMap;

import java.util.List;

public interface RuleMapMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RuleMap record);

    int insertSelective(RuleMap record);

    RuleMap selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RuleMap record);

    int updateByPrimaryKey(RuleMap record);

    List<RuleMap> selectAll();

    RuleMap selectByUrl(String url);
}