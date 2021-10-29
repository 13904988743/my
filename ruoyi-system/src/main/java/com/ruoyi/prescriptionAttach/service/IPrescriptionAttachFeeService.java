package com.ruoyi.prescriptionAttach.service;

import java.util.List;
import com.ruoyi.prescriptionAttach.domain.PrescriptionAttachFee;

/**
 * 处方附加费Service接口
 * 
 * @author ruoyi
 * @date 2021-10-27
 */
public interface IPrescriptionAttachFeeService 
{
    /**
     * 查询处方附加费
     * 
     * @param id 处方附加费主键
     * @return 处方附加费
     */
    public PrescriptionAttachFee selectPrescriptionAttachFeeById(Long id);

    /**
     * 查询处方附加费列表
     * 
     * @param prescriptionAttachFee 处方附加费
     * @return 处方附加费集合
     */
    public List<PrescriptionAttachFee> selectPrescriptionAttachFeeList(PrescriptionAttachFee prescriptionAttachFee);

    /**
     * 新增处方附加费
     * 
     * @param prescriptionAttachFee 处方附加费
     * @return 结果
     */
    public int insertPrescriptionAttachFee(PrescriptionAttachFee prescriptionAttachFee);

    /**
     * 修改处方附加费
     * 
     * @param prescriptionAttachFee 处方附加费
     * @return 结果
     */
    public int updatePrescriptionAttachFee(PrescriptionAttachFee prescriptionAttachFee);

    /**
     * 批量删除处方附加费
     * 
     * @param ids 需要删除的处方附加费主键集合
     * @return 结果
     */
    public int deletePrescriptionAttachFeeByIds(Long[] ids);

    /**
     * 删除处方附加费信息
     * 
     * @param id 处方附加费主键
     * @return 结果
     */
    public int deletePrescriptionAttachFeeById(Long id);
}
