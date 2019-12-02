package com.dxt.service;


import com.dxt.mapper.DepMapper;
import com.dxt.pojo.Dep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepsService {
     @Autowired
     DepMapper depMapper;
    /*查询所有部门 */
    public List<Dep> selectByExample(){
        return depMapper.selectByExample(null);
    }
}
