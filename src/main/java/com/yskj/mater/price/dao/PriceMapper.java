package com.yskj.mater.price.dao;

import com.yskj.mater.price.entity.Price;

public interface PriceMapper {
    /**
     * 通过主键删除
     * @param prjid 主键
     * @return int>0?true:false
     */
    int deleteByPrimaryKey(Integer prjid);

    /**
     * 插入
     * @param record
     * @return int>0?true:false
     */
    int insert(Price record);

    /**
     * 通过主键查询
     * @param prjid
     * @return price
     */
    Price selectByPrimaryKey(Integer prjid);

    /**
     * 通过主键修改
     * @param record
     * @return int>0?true:false
     */
    int updateByPrimaryKey(Price record);
}