package com.hanghea.cicd.api.store.save.vo

import com.fasterxml.jackson.annotation.JsonProperty
import com.hanghea.cicd.api.common.StoreVo
import jakarta.validation.Valid

data class ReqSaveStorePostVo(
    @JsonProperty("store")
    @field: Valid
    val store: StoreVo,
)
