package com.hanghea.cicd.api.store

import com.hanghea.cicd.api.common.comp.impl.StoreManager
import com.hanghea.cicd.api.common.comp.impl.StoreReader
import org.springframework.stereotype.Service

@Service
class StoreService(
    private val storeReader: StoreReader,
    private val storeManager: StoreManager
) {

}