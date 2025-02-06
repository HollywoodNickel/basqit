package eu.basqit.store

import eu.basqit.store.dto.StoreDto

fun interface IStoreService {
    fun stores(): List<StoreDto>
}