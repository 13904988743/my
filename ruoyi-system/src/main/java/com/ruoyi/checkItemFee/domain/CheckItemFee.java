package com.ruoyi.checkItemFee.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 检查项目费对象 check_item_fee
 * 
 * @author ruoyi
 * @date 2021-10-27
 */
public class CheckItemFee extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 唯一标识 */
    private Long id;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String name;

    /** 项目单价 */
    @Excel(name = "项目单价")
    private BigDecimal itemFee;

    /** 项目成本 */
    @Excel(name = "项目成本")
    private BigDecimal itemCost;

    /** 项目单位 */
    @Excel(name = "项目单位")
    private String checkItemUnit;

    /** 项目类别 */
    @Excel(name = "项目类别")
    private String checkItemType;

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
    public void setItemFee(BigDecimal itemFee) 
    {
        this.itemFee = itemFee;
    }

    public BigDecimal getItemFee() 
    {
        return itemFee;
    }
    public void setItemCost(BigDecimal itemCost) 
    {
        this.itemCost = itemCost;
    }

    public BigDecimal getItemCost() 
    {
        return itemCost;
    }
    public void setCheckItemUnit(String checkItemUnit) 
    {
        this.checkItemUnit = checkItemUnit;
    }

    public String getCheckItemUnit() 
    {
        return checkItemUnit;
    }
    public void setCheckItemType(String checkItemType) 
    {
        this.checkItemType = checkItemType;
    }

    public String getCheckItemType() 
    {
        return checkItemType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("itemFee", getItemFee())
            .append("itemCost", getItemCost())
            .append("checkItemUnit", getCheckItemUnit())
            .append("checkItemType", getCheckItemType())
            .toString();
    }
}
