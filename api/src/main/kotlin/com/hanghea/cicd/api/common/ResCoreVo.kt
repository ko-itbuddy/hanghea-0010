package com.hanghea.cicd.api.common

 abstract class ResCoreVo<T>(
    var code: String,
    var msg: String,
    open var result: T
)
