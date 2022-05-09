package priv.liuxq.employeemgt.mapper;

import org.apache.ibatis.annotations.Mapper;
import priv.liuxq.employeemgt.bean.EmployeeInfo;

import java.util.List;

/**
 * @Desc:
 * @Author: Administrator
 * @Date: 2022/5/8-17:07
 */

@Mapper
public interface EmployeeInfoMapper {

    EmployeeInfo getEmployeeInfoById(Integer id);

    List<EmployeeInfo> getAllEmployeeInfo();

    int insertEmployeeInfo(EmployeeInfo employeeInfo);

    int updateEmployeeInfo(EmployeeInfo employeeInfo);

    int deleteEmployeeInfoById(Integer id);

}
