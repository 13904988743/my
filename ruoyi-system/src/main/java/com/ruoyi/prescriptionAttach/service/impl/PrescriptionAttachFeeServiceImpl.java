package com.ruoyi.prescriptionAttach.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.prescriptionAttach.mapper.PrescriptionAttachFeeMapper;
import com.ruoyi.prescriptionAttach.domain.PrescriptionAttachFee;
import com.ruoyi.prescriptionAttach.service.IPrescriptionAttachFeeService;

/**
 * 处方附加费Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-10-27
 */
@Service
public class PrescriptionAttachFeeServiceImpl implements IPrescriptionAttachFeeService 
{
    @Autowired
    private PrescriptionAttachFeeMapper prescriptionAttachFeeMapper;

    /**
     * 查询处方附加费
     * 
     * @param id 处方附加费主键
     * @return 处方附加费
     */
    @Override
    public PrescriptionAttachFee selectPrescriptionAttachFeeById(Long id)
    {
        return prescriptionAttachFeeMapper.selectPrescriptionAttachFeeById(id);
    }

    /**
     * 查询处方附加费列表
     * 
     * @param prescriptionAttachFee 处方附加费
     * @return 处方附加费
     */
    @Override
    public List<PrescriptionAttachFee> selectPrescriptionAttachFeeList(PrescriptionAttachFee prescriptionAttachFee)
    {
        return prescriptionAttachFeeMapper.selectPrescriptionAttachFeeList(prescriptionAttachFee);
    }

    /**
     * 新增处方附加费
     * 
     * @param prescriptionAttachFee 处方附加费
     * @return 结果
     */
    @Override
    public int insertPrescriptionAttachFee(PrescriptionAttachFee prescriptionAttachFee)
    {
        return prescriptionAttachFeeMapper.insertPrescriptionAttachFee(prescriptionAttachFee);
    }

    /**
     * 修改处方附加费
     * 
     * @param prescriptionAttachFee 处方附加费
     * @return 结果
     */
    @Override
    public int updatePrescriptionAttachFee(PrescriptionAttachFee prescriptionAttachFee)
    {
        return prescriptionAttachFeeMapper.updatePrescriptionAttachFee(prescriptionAttachFee);
    }

    /**
     * 批量删除处方附加费
     * 
     * @param ids 需要删除的处方附加费主键
     * @return 结果
     */
    @Override
    public int deletePrescriptionAttachFeeByIds(Long[] ids)
    {
        return prescriptionAttachFeeMapper.deletePrescriptionAttachFeeByIds(ids);
    }

    /**
     * 删除处方附加费信息
     * 
     * @param id 处方附加费主键
     * @return 结果
     */
    @Override
    public int deletePrescriptionAttachFeeById(Long id)
    {
        return prescriptionAttachFeeMapper.deletePrescriptionAttachFeeById(id);
    }
}
