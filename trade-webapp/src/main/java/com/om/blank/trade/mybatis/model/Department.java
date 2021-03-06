package com.om.blank.trade.mybatis.model;

import java.util.Date;

public class Department {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column euc_department.department_id
     *
     * @mbg.generated
     */
    private Long department_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column euc_department.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column euc_department.parent_department_id
     *
     * @mbg.generated
     */
    private Long parent_department_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column euc_department.enterprise_id
     *
     * @mbg.generated
     */
    private Long enterprise_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column euc_department.type
     *
     * @mbg.generated
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column euc_department.adapter_param
     *
     * @mbg.generated
     */
    private String adapter_param;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column euc_department.enterprise_code
     *
     * @mbg.generated
     */
    private String enterprise_code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column euc_department.manufacturer_code
     *
     * @mbg.generated
     */
    private String manufacturer_code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column euc_department.secret
     *
     * @mbg.generated
     */
    private String secret;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column euc_department.address
     *
     * @mbg.generated
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column euc_department.level_code
     *
     * @mbg.generated
     */
    private String level_code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column euc_department.created
     *
     * @mbg.generated
     */
    private Date created;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column euc_department.updated
     *
     * @mbg.generated
     */
    private Date updated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column euc_department.deleted
     *
     * @mbg.generated
     */
    private Date deleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column euc_department.department_shortened
     *
     * @mbg.generated
     */
    private String department_shortened;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column euc_department.department_id
     *
     * @return the value of euc_department.department_id
     *
     * @mbg.generated
     */
    public Long getDepartment_id() {
        return department_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column euc_department.department_id
     *
     * @param department_id the value for euc_department.department_id
     *
     * @mbg.generated
     */
    public void setDepartment_id(Long department_id) {
        this.department_id = department_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column euc_department.name
     *
     * @return the value of euc_department.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column euc_department.name
     *
     * @param name the value for euc_department.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column euc_department.parent_department_id
     *
     * @return the value of euc_department.parent_department_id
     *
     * @mbg.generated
     */
    public Long getParent_department_id() {
        return parent_department_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column euc_department.parent_department_id
     *
     * @param parent_department_id the value for euc_department.parent_department_id
     *
     * @mbg.generated
     */
    public void setParent_department_id(Long parent_department_id) {
        this.parent_department_id = parent_department_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column euc_department.enterprise_id
     *
     * @return the value of euc_department.enterprise_id
     *
     * @mbg.generated
     */
    public Long getEnterprise_id() {
        return enterprise_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column euc_department.enterprise_id
     *
     * @param enterprise_id the value for euc_department.enterprise_id
     *
     * @mbg.generated
     */
    public void setEnterprise_id(Long enterprise_id) {
        this.enterprise_id = enterprise_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column euc_department.type
     *
     * @return the value of euc_department.type
     *
     * @mbg.generated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column euc_department.type
     *
     * @param type the value for euc_department.type
     *
     * @mbg.generated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column euc_department.adapter_param
     *
     * @return the value of euc_department.adapter_param
     *
     * @mbg.generated
     */
    public String getAdapter_param() {
        return adapter_param;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column euc_department.adapter_param
     *
     * @param adapter_param the value for euc_department.adapter_param
     *
     * @mbg.generated
     */
    public void setAdapter_param(String adapter_param) {
        this.adapter_param = adapter_param == null ? null : adapter_param.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column euc_department.enterprise_code
     *
     * @return the value of euc_department.enterprise_code
     *
     * @mbg.generated
     */
    public String getEnterprise_code() {
        return enterprise_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column euc_department.enterprise_code
     *
     * @param enterprise_code the value for euc_department.enterprise_code
     *
     * @mbg.generated
     */
    public void setEnterprise_code(String enterprise_code) {
        this.enterprise_code = enterprise_code == null ? null : enterprise_code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column euc_department.manufacturer_code
     *
     * @return the value of euc_department.manufacturer_code
     *
     * @mbg.generated
     */
    public String getManufacturer_code() {
        return manufacturer_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column euc_department.manufacturer_code
     *
     * @param manufacturer_code the value for euc_department.manufacturer_code
     *
     * @mbg.generated
     */
    public void setManufacturer_code(String manufacturer_code) {
        this.manufacturer_code = manufacturer_code == null ? null : manufacturer_code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column euc_department.secret
     *
     * @return the value of euc_department.secret
     *
     * @mbg.generated
     */
    public String getSecret() {
        return secret;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column euc_department.secret
     *
     * @param secret the value for euc_department.secret
     *
     * @mbg.generated
     */
    public void setSecret(String secret) {
        this.secret = secret == null ? null : secret.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column euc_department.address
     *
     * @return the value of euc_department.address
     *
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column euc_department.address
     *
     * @param address the value for euc_department.address
     *
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column euc_department.level_code
     *
     * @return the value of euc_department.level_code
     *
     * @mbg.generated
     */
    public String getLevel_code() {
        return level_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column euc_department.level_code
     *
     * @param level_code the value for euc_department.level_code
     *
     * @mbg.generated
     */
    public void setLevel_code(String level_code) {
        this.level_code = level_code == null ? null : level_code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column euc_department.created
     *
     * @return the value of euc_department.created
     *
     * @mbg.generated
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column euc_department.created
     *
     * @param created the value for euc_department.created
     *
     * @mbg.generated
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column euc_department.updated
     *
     * @return the value of euc_department.updated
     *
     * @mbg.generated
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column euc_department.updated
     *
     * @param updated the value for euc_department.updated
     *
     * @mbg.generated
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column euc_department.deleted
     *
     * @return the value of euc_department.deleted
     *
     * @mbg.generated
     */
    public Date getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column euc_department.deleted
     *
     * @param deleted the value for euc_department.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Date deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column euc_department.department_shortened
     *
     * @return the value of euc_department.department_shortened
     *
     * @mbg.generated
     */
    public String getDepartment_shortened() {
        return department_shortened;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column euc_department.department_shortened
     *
     * @param department_shortened the value for euc_department.department_shortened
     *
     * @mbg.generated
     */
    public void setDepartment_shortened(String department_shortened) {
        this.department_shortened = department_shortened == null ? null : department_shortened.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table euc_department
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Department other = (Department) that;
        return (this.getDepartment_id() == null ? other.getDepartment_id() == null : this.getDepartment_id().equals(other.getDepartment_id()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getParent_department_id() == null ? other.getParent_department_id() == null : this.getParent_department_id().equals(other.getParent_department_id()))
            && (this.getEnterprise_id() == null ? other.getEnterprise_id() == null : this.getEnterprise_id().equals(other.getEnterprise_id()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getAdapter_param() == null ? other.getAdapter_param() == null : this.getAdapter_param().equals(other.getAdapter_param()))
            && (this.getEnterprise_code() == null ? other.getEnterprise_code() == null : this.getEnterprise_code().equals(other.getEnterprise_code()))
            && (this.getManufacturer_code() == null ? other.getManufacturer_code() == null : this.getManufacturer_code().equals(other.getManufacturer_code()))
            && (this.getSecret() == null ? other.getSecret() == null : this.getSecret().equals(other.getSecret()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getLevel_code() == null ? other.getLevel_code() == null : this.getLevel_code().equals(other.getLevel_code()))
            && (this.getCreated() == null ? other.getCreated() == null : this.getCreated().equals(other.getCreated()))
            && (this.getUpdated() == null ? other.getUpdated() == null : this.getUpdated().equals(other.getUpdated()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getDepartment_shortened() == null ? other.getDepartment_shortened() == null : this.getDepartment_shortened().equals(other.getDepartment_shortened()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table euc_department
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDepartment_id() == null) ? 0 : getDepartment_id().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getParent_department_id() == null) ? 0 : getParent_department_id().hashCode());
        result = prime * result + ((getEnterprise_id() == null) ? 0 : getEnterprise_id().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getAdapter_param() == null) ? 0 : getAdapter_param().hashCode());
        result = prime * result + ((getEnterprise_code() == null) ? 0 : getEnterprise_code().hashCode());
        result = prime * result + ((getManufacturer_code() == null) ? 0 : getManufacturer_code().hashCode());
        result = prime * result + ((getSecret() == null) ? 0 : getSecret().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getLevel_code() == null) ? 0 : getLevel_code().hashCode());
        result = prime * result + ((getCreated() == null) ? 0 : getCreated().hashCode());
        result = prime * result + ((getUpdated() == null) ? 0 : getUpdated().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getDepartment_shortened() == null) ? 0 : getDepartment_shortened().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table euc_department
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", department_id=").append(department_id);
        sb.append(", name=").append(name);
        sb.append(", parent_department_id=").append(parent_department_id);
        sb.append(", enterprise_id=").append(enterprise_id);
        sb.append(", type=").append(type);
        sb.append(", adapter_param=").append(adapter_param);
        sb.append(", enterprise_code=").append(enterprise_code);
        sb.append(", manufacturer_code=").append(manufacturer_code);
        sb.append(", secret=").append(secret);
        sb.append(", address=").append(address);
        sb.append(", level_code=").append(level_code);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", deleted=").append(deleted);
        sb.append(", department_shortened=").append(department_shortened);
        sb.append("]");
        return sb.toString();
    }
}