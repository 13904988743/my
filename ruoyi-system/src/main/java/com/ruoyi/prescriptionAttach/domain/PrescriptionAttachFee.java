package com.ruoyi.prescriptionAttach.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 处方附加费对象 prescription_attach_fee
 * 
 * @author ruoyi
 * @date 2021-10-27
 */
public class PrescriptionAttachFee extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 唯一标识 */
    private Long id;

    /** 费用名称 */
    @Excel(name = "费用名称")
    private String name;

    /** 费用金额 */
    @Excel(name = "费用金额")
    private BigDecimal fee;

    /** 处方类型 */
    @Excel(name = "处方类型")
    private String prescriptionType;

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
    public void setFee(BigDecimal fee) 
    {
        this.fee = fee;
    }

    public BigDecimal getFee() 
    {
        return fee;
    }
    public void setPrescriptionType(String prescriptionType) 
    {
        this.prescriptionType = prescriptionType;
    }

    public String getPrescriptionType() 
    {
        return prescriptionType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("fee", getFee())
            .append("prescriptionType", getPrescriptionType())
            .toString();
    }
}
