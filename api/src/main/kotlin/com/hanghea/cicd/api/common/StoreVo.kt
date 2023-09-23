package com.hanghea.cicd.api.common

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import org.hibernate.validator.constraints.Length

open class StoreVo @JsonCreator constructor(
    @JsonProperty("store_name")
    @field:Length(min = 4, max = 30)
    val storeName: String,


    )
