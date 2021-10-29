package com.ruoyi.checkItemFee.service;

import java.util.List;
import com.ruoyi.checkItemFee.domain.CheckItemFee;

/**
 * 检查项目费Service接口
 * 
 * @author ruoyi
 * @date 2021-10-27
 */
public interface ICheckItemFeeService 
{
    /**
     * 查询检查项目费
     * 
     * @param id 检查项目费主键
     * @return 检查项目费
     */
    public CheckItemFee selectCheckItemFeeById(Long id);

    /**
     * 查询检查项目费列表
     * 
     * @param checkItemFee 检查项目费
     * @return 检查项目费集合
     */
    public List<CheckItemFee> selectCheckItemFeeList(CheckItemFee checkItemFee);

    /**
     * 新增检查项目费
     * 
     * @param checkItemFee 检查项目费
     * @return 结果
     */
    public int insertCheckItemFee(CheckItemFee checkItemFee);

    /**
     * 修改检查项目费
     * 
     * @param checkItemFee 检查项目费
     * @return 结果
     */
    public int updateCheckItemFee(CheckItemFee checkItemFee);

    /**
     * 批量删除检查项目费
     * 
     * @param ids 需要删除的检查项目费主键集合
     * @return 结果
     */
    public int deleteCheckItemFeeByIds(Long[] ids);

    /**
     * 删除检查项目费信息
     * 
     * @param id 检查项目费主键
     * @return 结果
     */
    public int deleteCheckItemFeeById(Long id);
}
