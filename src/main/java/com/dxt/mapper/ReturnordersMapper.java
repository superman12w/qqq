package com.dxt.mapper;

import com.dxt.pojo.Returnorders;
import com.dxt.pojo.ReturnordersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReturnordersMapper {
    long countByExample(ReturnordersExample example);

    int deleteByExample(ReturnordersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Returnorders record);

    int insertSelective(Returnorders record);

    List<Returnorders> selectByExample(ReturnordersExample example);

    Returnorders selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Returnorders record, @Param("example") ReturnordersExample example);

    int updateByExample(@Param("record") Returnorders record, @Param("example") ReturnordersExample example);

    int updateByPrimaryKeySelective(Returnorders record);

    int updateByPrimaryKey(Returnorders record);
}