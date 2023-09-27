package com.hanghea.cicd.api.common.vo.core

 abstract class ResCoreVo<T>(
    var code: String,
    var msg: String,
    open var result: T
)
