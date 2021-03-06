package com.om.blank.trade.mybatis.mapper;

import com.om.blank.trade.mybatis.base.BaseExample;
import com.om.blank.trade.mybatis.base.BaseMapper;
import com.om.blank.trade.mybatis.model.Department;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper extends BaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table euc_department
     *
     * @mbg.generated
     */
    long countByExample(BaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table euc_department
     *
     * @mbg.generated
     */
    int deleteByExample(BaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table euc_department
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long department_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table euc_department
     *
     * @mbg.generated
     */
    int insert(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table euc_department
     *
     * @mbg.generated
     */
    int insertSelective(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table euc_department
     *
     * @mbg.generated
     */
    List<Department> selectByExample(BaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table euc_department
     *
     * @mbg.generated
     */
    Department selectByPrimaryKey(Long department_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table euc_department
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Department record, @Param("example") BaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table euc_department
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Department record, @Param("example") BaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table euc_department
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table euc_department
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Department record);
}