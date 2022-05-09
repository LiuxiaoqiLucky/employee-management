package priv.liuxq.employeemgt.controller;

import org.springframework.web.bind.annotation.*;
import priv.liuxq.employeemgt.bean.EmployeeInfo;
import priv.liuxq.employeemgt.bean.ResponseResult;
import priv.liuxq.employeemgt.mapper.EmployeeInfoMapper;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Desc:雇员信息管理：对雇员信息进行增，删，改和查操作
 * @Author: Administrator
 * @Date: 2022/5/8-16:25
 */


@RestController
@RequestMapping("api")
public class EmployeeManagementController {

    @Resource
    EmployeeInfoMapper employeeInfoMapper;


    /**
     * 根据雇员ID查询指定雇员信息
     * @param id 雇员id
     * @return
     */
    @GetMapping("/empinfo/{id}")
    public ResponseResult getEmployeeInfo(@PathVariable("id")  Integer id){
        EmployeeInfo employeeInfo = employeeInfoMapper.getEmployeeInfoById(id);
        ResponseResult responseResult = new ResponseResult(0, "", employeeInfo);
        return responseResult;
    }

    /**
     * 查询所有雇员记录
     * @return
     */
    @GetMapping("/empinfo/all")
    public ResponseResult getAllEmployeeInfo(){
        List<EmployeeInfo> list = employeeInfoMapper.getAllEmployeeInfo();
        ResponseResult responseResult = new ResponseResult(0, "", list);
        return responseResult;
    }


    /**
     * 根据雇员ID删除雇员记录
     * @param id 雇员id
     * @return
     */
    @DeleteMapping("/empinfo/{id}")
    public ResponseResult deleteEmployeeInfo(@PathVariable("id") Integer id){
        int result = employeeInfoMapper.deleteEmployeeInfoById(id);
        Map<String, Integer> map = new HashMap<>();
        map.put("delCount", result);
        ResponseResult responseResult = new ResponseResult(0, "", map);
        return responseResult;
    }

    /**
     * 新增雇员记录
     * @param employeeInfo
     * @return
     */
    @PostMapping("/empinfo/add")
    public ResponseResult insertEmployeeInfo(EmployeeInfo employeeInfo){
        employeeInfo.setRegDate(new java.sql.Date(new Date().getTime()));
        int result = employeeInfoMapper.insertEmployeeInfo(employeeInfo);
        Map<String, Integer> map = new HashMap<>();
        map.put("insertCount", result);
        ResponseResult responseResult = new ResponseResult(0, "", map);
        return responseResult;
    }

    /**
     * 修改雇员记录
     * @param employeeInfo
     * @return
     */
    @PutMapping("/empinfo/edit")
    public ResponseResult updateEmployeeInfo(EmployeeInfo employeeInfo){
        employeeInfo.setUpdateDate(new java.sql.Date(new Date().getTime()));
        int result = employeeInfoMapper.updateEmployeeInfo(employeeInfo);
        Map<String, Integer> map = new HashMap<>();
        map.put("updateCount", result);
        ResponseResult responseResult = new ResponseResult(0, "", map);
        return responseResult;
    }
}
