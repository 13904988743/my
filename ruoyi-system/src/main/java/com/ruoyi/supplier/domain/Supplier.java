package com.ruoyi.supplier.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 供应商对象 supplier
 * 
 * @author ruoyi
 * @date 2021-10-27
 */
public class Supplier extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 唯一标识 */
    private Long id;

    /** 供应商名称 */
    @Excel(name = "供应商名称")
    private String name;

    /** 供应商地址 */
    @Excel(name = "供应商地址")
    private String address;

    /** 联系人姓名 */
    @Excel(name = "联系人姓名")
    private String contactPersonName;

    /** 座机号 */
    @Excel(name = "座机号")
    private String telephone;

    /** 手机号码 */
    @Excel(name = "手机号码")
    private String mobilePhone;

    /** 银行卡号 */
    @Excel(name = "银行卡号")
    private String bankCardNumber;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setContactPersonName(String contactPersonName) 
    {
        this.contactPersonName = contactPersonName;
    }

    public String getContactPersonName() 
    {
        return contactPersonName;
    }
    public void setTelephone(String telephone) 
    {
        this.telephone = telephone;
    }

    public String getTelephone() 
    {
        return telephone;
    }
    public void setMobilePhone(String mobilePhone) 
    {
        this.mobilePhone = mobilePhone;
    }

    public String getMobilePhone() 
    {
        return mobilePhone;
    }
    public void setBankCardNumber(String bankCardNumber) 
    {
        this.bankCardNumber = bankCardNumber;
    }

    public String getBankCardNumber() 
    {
        return bankCardNumber;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("address", getAddress())
            .append("contactPersonName", getContactPersonName())
            .append("telephone", getTelephone())
            .append("mobilePhone", getMobilePhone())
            .append("bankCardNumber", getBankCardNumber())
            .toString();
    }
}
