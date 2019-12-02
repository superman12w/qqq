package com.dxt.mapper;

import com.dxt.pojo.Storeoper;
import com.dxt.pojo.StoreoperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreoperMapper {
    long countByExample(StoreoperExample example);

    int deleteByExample(StoreoperExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Storeoper record);

    int insertSelective(Storeoper record);

    List<Storeoper> selectByExample(StoreoperExample example);

    Storeoper selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Storeoper record, @Param("example") StoreoperExample example);

    int updateByExample(@Param("record") Storeoper record, @Param("example") StoreoperExample example);

    int updateByPrimaryKeySelective(Storeoper record);

    int updateByPrimaryKey(Storeoper record);
}