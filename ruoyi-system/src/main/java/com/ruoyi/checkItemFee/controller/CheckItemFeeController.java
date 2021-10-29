package com.ruoyi.checkItemFee.controller;

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
import com.ruoyi.checkItemFee.domain.CheckItemFee;
import com.ruoyi.checkItemFee.service.ICheckItemFeeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 检查项目费Controller
 * 
 * @author ruoyi
 * @date 2021-10-27
 */
@RestController
@RequestMapping("/checkItemFee/checkItemFee")
public class CheckItemFeeController extends BaseController
{
    @Autowired
    private ICheckItemFeeService checkItemFeeService;

    /**
     * 查询检查项目费列表
     */
    @PreAuthorize("@ss.hasPermi('checkItemFee:checkItemFee:list')")
    @GetMapping("/list")
    public TableDataInfo list(CheckItemFee checkItemFee)
    {
        startPage();
        List<CheckItemFee> list = checkItemFeeService.selectCheckItemFeeList(checkItemFee);
        return getDataTable(list);
    }

    /**
     * 导出检查项目费列表
     */
    @PreAuthorize("@ss.hasPermi('checkItemFee:checkItemFee:export')")
    @Log(title = "检查项目费", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(CheckItemFee checkItemFee)
    {
        List<CheckItemFee> list = checkItemFeeService.selectCheckItemFeeList(checkItemFee);
        ExcelUtil<CheckItemFee> util = new ExcelUtil<CheckItemFee>(CheckItemFee.class);
        return util.exportExcel(list, "检查项目费数据");
    }

    /**
     * 获取检查项目费详细信息
     */
    @PreAuthorize("@ss.hasPermi('checkItemFee:checkItemFee:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(checkItemFeeService.selectCheckItemFeeById(id));
    }

    /**
     * 新增检查项目费
     */
    @PreAuthorize("@ss.hasPermi('checkItemFee:checkItemFee:add')")
    @Log(title = "检查项目费", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CheckItemFee checkItemFee)
    {
        return toAjax(checkItemFeeService.insertCheckItemFee(checkItemFee));
    }

    /**
     * 修改检查项目费
     */
    @PreAuthorize("@ss.hasPermi('checkItemFee:checkItemFee:edit')")
    @Log(title = "检查项目费", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CheckItemFee checkItemFee)
    {
        return toAjax(checkItemFeeService.updateCheckItemFee(checkItemFee));
    }

    /**
     * 删除检查项目费
     */
    @PreAuthorize("@ss.hasPermi('checkItemFee:checkItemFee:remove')")
    @Log(title = "检查项目费", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(checkItemFeeService.deleteCheckItemFeeByIds(ids));
    }
}
