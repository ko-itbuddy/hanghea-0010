package com.hanghea.cicd.api.store.save.vo

import com.hanghea.cicd.api.common.vo.core.ResCoreVo
import com.hanghea.cicd.api.common.ResultCodeMsg
import com.hanghea.cicd.api.common.vo.StoreVo

data class ResSaveStorePostVo(var resultCodeMsg: ResultCodeMsg, override var result: StoreVo) :
    ResCoreVo<StoreVo>(resultCodeMsg.code, resultCodeMsg.msg, result) {
}