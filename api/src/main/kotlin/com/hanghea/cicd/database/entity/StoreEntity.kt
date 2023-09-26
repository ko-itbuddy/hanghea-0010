package com.hanghea.cicd.database.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
open class StoreEntity {
    @Id
    var id: Long = 0L

}