package priv.liuxq.employeemgt.bean;

import java.util.Date;

/**
 * @Desc: 雇员信息实体类
 * @Author: Administrator
 * @Date: 2022/5/8-16:27
 */
public class EmployeeInfo {

    private Integer Id;
    private String FirstName;
    private String LastName;
    private String DepartmentName;
    private String EmailAddress;
    private String FamilyAddress;
    private Date RegDate;
    private Date UpdateDate;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getFamilyAddress() {
        return FamilyAddress;
    }

    public void setFamilyAddress(String familyAddress) {
        FamilyAddress = familyAddress;
    }

    public Date getRegDate() {
        return RegDate;
    }

    public void setRegDate(Date regDate) {
        RegDate = regDate;
    }

    public Date getUpdateDate() {
        return UpdateDate;
    }

    public void setUpdateDate(Date updateDate) {
        UpdateDate = updateDate;
    }
}
