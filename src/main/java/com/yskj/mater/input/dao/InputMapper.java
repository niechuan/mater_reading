package com.yskj.mater.input.dao;

import com.yskj.mater.input.entity.Input;

public interface InputMapper {
    /**
     * 通过主键删除
     * @param userid 主键
     * @return int>0?true:false
     */
    int deleteByPrimaryKey(Integer userid);

    /**
     * 新增
     * @param record
     * @return int>0?true:false
     */
    int insert(Input record);

    /**
     * 通过主键查询
     * @param userid 主键
     * @return Input
     */
    Input selectByPrimaryKey(Integer userid);

    /**
     * 通过主键修改
     * @param record
     * @return int>0?true:false
     */
    int updateByPrimaryKey(Input record);
}