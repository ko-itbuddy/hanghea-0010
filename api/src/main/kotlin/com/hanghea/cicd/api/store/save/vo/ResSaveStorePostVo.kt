package com.hanghea.cicd.api.store.save.vo

import com.hanghea.cicd.api.common.ResCoreVo
import com.hanghea.cicd.api.common.ResultCodeMsg
import com.hanghea.cicd.api.common.StoreVo

data class ResSaveStorePostVo(var resultCodeMsg: ResultCodeMsg, override var result: StoreVo) :
    ResCoreVo<StoreVo>(resultCodeMsg.code, resultCodeMsg.msg, result) {
}