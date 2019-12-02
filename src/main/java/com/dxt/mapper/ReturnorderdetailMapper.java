package com.dxt.mapper;

import com.dxt.pojo.Returnorderdetail;
import com.dxt.pojo.ReturnorderdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReturnorderdetailMapper {
    long countByExample(ReturnorderdetailExample example);

    int deleteByExample(ReturnorderdetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Returnorderdetail record);

    int insertSelective(Returnorderdetail record);

    List<Returnorderdetail> selectByExample(ReturnorderdetailExample example);

    Returnorderdetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Returnorderdetail record, @Param("example") ReturnorderdetailExample example);

    int updateByExample(@Param("record") Returnorderdetail record, @Param("example") ReturnorderdetailExample example);

    int updateByPrimaryKeySelective(Returnorderdetail record);

    int updateByPrimaryKey(Returnorderdetail record);
}