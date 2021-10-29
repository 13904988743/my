import request from '@/utils/request'

// 查询处方附加费列表
export function listFee(query) {
  return request({
    url: '/prescriptionAttach/fee/list',
    method: 'get',
    params: query
  })
}

// 查询处方附加费详细
export function getFee(id) {
  return request({
    url: '/prescriptionAttach/fee/' + id,
    method: 'get'
  })
}

// 新增处方附加费
export function addFee(data) {
  return request({
    url: '/prescriptionAttach/fee',
    method: 'post',
    data: data
  })
}

// 修改处方附加费
export function updateFee(data) {
  return request({
    url: '/prescriptionAttach/fee',
    method: 'put',
    data: data
  })
}

// 删除处方附加费
export function delFee(id) {
  return request({
    url: '/prescriptionAttach/fee/' + id,
    method: 'delete'
  })
}

// 导出处方附加费
export function exportFee(query) {
  return request({
    url: '/prescriptionAttach/fee/export',
    method: 'get',
    params: query
  })
}