package com.ruoyi.checkItemFee.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.checkItemFee.mapper.CheckItemFeeMapper;
import com.ruoyi.checkItemFee.domain.CheckItemFee;
import com.ruoyi.checkItemFee.service.ICheckItemFeeService;

/**
 * 检查项目费Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-10-27
 */
@Service
public class CheckItemFeeServiceImpl implements ICheckItemFeeService 
{
    @Autowired
    private CheckItemFeeMapper checkItemFeeMapper;

    /**
     * 查询检查项目费
     * 
     * @param id 检查项目费主键
     * @return 检查项目费
     */
    @Override
    public CheckItemFee selectCheckItemFeeById(Long id)
    {
        return checkItemFeeMapper.selectCheckItemFeeById(id);
    }

    /**
     * 查询检查项目费列表
     * 
     * @param checkItemFee 检查项目费
     * @return 检查项目费
     */
    @Override
    public List<CheckItemFee> selectCheckItemFeeList(CheckItemFee checkItemFee)
    {
        return checkItemFeeMapper.selectCheckItemFeeList(checkItemFee);
    }

    /**
     * 新增检查项目费
     * 
     * @param checkItemFee 检查项目费
     * @return 结果
     */
    @Override
    public int insertCheckItemFee(CheckItemFee checkItemFee)
    {
        return checkItemFeeMapper.insertCheckItemFee(checkItemFee);
    }

    /**
     * 修改检查项目费
     * 
     * @param checkItemFee 检查项目费
     * @return 结果
     */
    @Override
    public int updateCheckItemFee(CheckItemFee checkItemFee)
    {
        return checkItemFeeMapper.updateCheckItemFee(checkItemFee);
    }

    /**
     * 批量删除检查项目费
     * 
     * @param ids 需要删除的检查项目费主键
     * @return 结果
     */
    @Override
    public int deleteCheckItemFeeByIds(Long[] ids)
    {
        return checkItemFeeMapper.deleteCheckItemFeeByIds(ids);
    }

    /**
     * 删除检查项目费信息
     * 
     * @param id 检查项目费主键
     * @return 结果
     */
    @Override
    public int deleteCheckItemFeeById(Long id)
    {
        return checkItemFeeMapper.deleteCheckItemFeeById(id);
    }
}
