package com.om.blank.trade.mybatis.mapper;

import com.om.blank.trade.mybatis.model.Department;
import com.om.blank.trade.mybatis.model.DepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table euc_department
     *
     * @mbg.generated Sun Jan 21 18:20:00 CST 2018
     */
    long countByExample(DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table euc_department
     *
     * @mbg.generated Sun Jan 21 18:20:00 CST 2018
     */
    int deleteByExample(DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table euc_department
     *
     * @mbg.generated Sun Jan 21 18:20:00 CST 2018
     */
    int deleteByPrimaryKey(Long department_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table euc_department
     *
     * @mbg.generated Sun Jan 21 18:20:00 CST 2018
     */
    int insert(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table euc_department
     *
     * @mbg.generated Sun Jan 21 18:20:00 CST 2018
     */
    int insertSelective(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table euc_department
     *
     * @mbg.generated Sun Jan 21 18:20:00 CST 2018
     */
    List<Department> selectByExample(DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table euc_department
     *
     * @mbg.generated Sun Jan 21 18:20:00 CST 2018
     */
    Department selectByPrimaryKey(Long department_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table euc_department
     *
     * @mbg.generated Sun Jan 21 18:20:00 CST 2018
     */
    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table euc_department
     *
     * @mbg.generated Sun Jan 21 18:20:00 CST 2018
     */
    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table euc_department
     *
     * @mbg.generated Sun Jan 21 18:20:00 CST 2018
     */
    int updateByPrimaryKeySelective(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table euc_department
     *
     * @mbg.generated Sun Jan 21 18:20:00 CST 2018
     */
    int updateByPrimaryKey(Department record);
}