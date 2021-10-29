package com.ruoyi.prescriptionAttach.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.prescriptionAttach.domain.PrescriptionAttachFee;
import com.ruoyi.prescriptionAttach.service.IPrescriptionAttachFeeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 处方附加费Controller
 * 
 * @author ruoyi
 * @date 2021-10-27
 */
@RestController
@RequestMapping("/prescriptionAttach/fee")
public class PrescriptionAttachFeeController extends BaseController
{
    @Autowired
    private IPrescriptionAttachFeeService prescriptionAttachFeeService;

    /**
     * 查询处方附加费列表
     */
    @PreAuthorize("@ss.hasPermi('prescriptionAttach:fee:list')")
    @GetMapping("/list")
    public TableDataInfo list(PrescriptionAttachFee prescriptionAttachFee)
    {
        startPage();
        List<PrescriptionAttachFee> list = prescriptionAttachFeeService.selectPrescriptionAttachFeeList(prescriptionAttachFee);
        return getDataTable(list);
    }

    /**
     * 导出处方附加费列表
     */
    @PreAuthorize("@ss.hasPermi('prescriptionAttach:fee:export')")
    @Log(title = "处方附加费", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(PrescriptionAttachFee prescriptionAttachFee)
    {
        List<PrescriptionAttachFee> list = prescriptionAttachFeeService.selectPrescriptionAttachFeeList(prescriptionAttachFee);
        ExcelUtil<PrescriptionAttachFee> util = new ExcelUtil<PrescriptionAttachFee>(PrescriptionAttachFee.class);
        return util.exportExcel(list, "处方附加费数据");
    }

    /**
     * 获取处方附加费详细信息
     */
    @PreAuthorize("@ss.hasPermi('prescriptionAttach:fee:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(prescriptionAttachFeeService.selectPrescriptionAttachFeeById(id));
    }

    /**
     * 新增处方附加费
     */
    @PreAuthorize("@ss.hasPermi('prescriptionAttach:fee:add')")
    @Log(title = "处方附加费", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PrescriptionAttachFee prescriptionAttachFee)
    {
        return toAjax(prescriptionAttachFeeService.insertPrescriptionAttachFee(prescriptionAttachFee));
    }

    /**
     * 修改处方附加费
     */
    @PreAuthorize("@ss.hasPermi('prescriptionAttach:fee:edit')")
    @Log(title = "处方附加费", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PrescriptionAttachFee prescriptionAttachFee)
    {
        return toAjax(prescriptionAttachFeeService.updatePrescriptionAttachFee(prescriptionAttachFee));
    }

    /**
     * 删除处方附加费
     */
    @PreAuthorize("@ss.hasPermi('prescriptionAttach:fee:remove')")
    @Log(title = "处方附加费", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(prescriptionAttachFeeService.deletePrescriptionAttachFeeByIds(ids));
    }
}
