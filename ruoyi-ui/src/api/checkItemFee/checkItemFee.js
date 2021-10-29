import request from '@/utils/request'

// 查询检查项目费列表
export function listCheckItemFee(query) {
  return request({
    url: '/checkItemFee/checkItemFee/list',
    method: 'get',
    params: query
  })
}

// 查询检查项目费详细
export function getCheckItemFee(id) {
  return request({
    url: '/checkItemFee/checkItemFee/' + id,
    method: 'get'
  })
}

// 新增检查项目费
export function addCheckItemFee(data) {
  return request({
    url: '/checkItemFee/checkItemFee',
    method: 'post',
    data: data
  })
}

// 修改检查项目费
export function updateCheckItemFee(data) {
  return request({
    url: '/checkItemFee/checkItemFee',
    method: 'put',
    data: data
  })
}

// 删除检查项目费
export function delCheckItemFee(id) {
  return request({
    url: '/checkItemFee/checkItemFee/' + id,
    method: 'delete'
  })
}

// 导出检查项目费
export function exportCheckItemFee(query) {
  return request({
    url: '/checkItemFee/checkItemFee/export',
    method: 'get',
    params: query
  })
}