package com.hanghea.cicd.api.common.vo

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hanghea.cicd.api.common.vo.validation.StoreValidationGroup
import org.hibernate.validator.constraints.Length

data class StoreVo @JsonCreator constructor(
    @JsonProperty("store_name")
    @field:Length(min = 4, max = 30, groups = [StoreValidationGroup.StoreSave::class] )
    val storeName: String,

    )
