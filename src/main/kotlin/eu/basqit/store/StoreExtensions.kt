package eu.basqit.store

import eu.basqit.store.dto.StoreDto
import eu.basqit.store.models.StoreModel

fun StoreModel.toStoreDto() = StoreDto(
    name = this.name
)

fun StoreDto.toStoreModel() = StoreModel(
    name = this.name
)
