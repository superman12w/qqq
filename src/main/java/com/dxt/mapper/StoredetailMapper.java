package com.dxt.mapper;

import com.dxt.pojo.Storedetail;
import com.dxt.pojo.StoredetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoredetailMapper {
    long countByExample(StoredetailExample example);

    int deleteByExample(StoredetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Storedetail record);

    int insertSelective(Storedetail record);

    List<Storedetail> selectByExample(StoredetailExample example);

    Storedetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Storedetail record, @Param("example") StoredetailExample example);

    int updateByExample(@Param("record") Storedetail record, @Param("example") StoredetailExample example);

    int updateByPrimaryKeySelective(Storedetail record);

    int updateByPrimaryKey(Storedetail record);
}