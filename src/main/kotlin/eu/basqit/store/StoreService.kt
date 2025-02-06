package eu.basqit.store

import eu.basqit.store.dto.StoreDto
import org.springframework.stereotype.Service

@Service
class StoreService : IStoreService {
    override fun stores(): List<StoreDto> {
        return listOf(
            StoreDto("Store 1"),
            StoreDto("Store 2"),
            StoreDto("Store 3")
        )
    }
}