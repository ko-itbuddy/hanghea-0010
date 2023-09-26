package com.hanghea.cicd.api.common.comp.impl

import com.hanghea.cicd.api.common.comp.ManagerComponent
import com.hanghea.cicd.database.entity.StoreEntity
import org.springframework.stereotype.Component
import org.springframework.validation.annotation.Validated

@Component
@Validated
class StoreManager : ManagerComponent<StoreEntity, Long>() {
    override fun update(entities: List<StoreEntity>): Long {
        TODO("Not yet implemented")
    }

    override fun delete(entityIds: List<Long>): Long {
        TODO("Not yet implemented")
    }

    override fun create(entities: List<StoreEntity>): List<StoreEntity> {
        TODO("Not yet implemented")
    }

}