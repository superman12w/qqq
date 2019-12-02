package com.dxt.contorller;



import com.dxt.pojo.Dep;
import com.dxt.service.DepsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class DepContorller {
     @Autowired
     DepsService depsService;


    @RequestMapping("/ssm.html")
    public String  queryByExampleController(@RequestParam(value = "pn",defaultValue = "1")Integer pn ,Model model){
        /*引入分页插件*/
        //在查询之前 调用传入页码 以及每页大小
        PageHelper.startPage(pn,5);
         List<Dep> dep=depsService.selectByExample();
        PageInfo page=new PageInfo(dep,5);
        model.addAttribute("pageInfo",page);
        return "list";
    }
}
