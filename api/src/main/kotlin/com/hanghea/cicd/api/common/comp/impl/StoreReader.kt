package com.hanghea.cicd.api.common.comp.impl

import com.hanghea.cicd.api.common.comp.ReaderComponent
import com.hanghea.cicd.database.entity.StoreEntity
import org.springframework.stereotype.Component
import org.springframework.validation.annotation.Validated

@Component
@Validated
class StoreReader : ReaderComponent<StoreEntity, Long>(
) {
    override fun read(id: Long): StoreEntity {
        TODO("Not yet implemented")
    }

    override fun readAll(ids: List<Long>): StoreEntity {
        TODO("Not yet implemented")
    }

}