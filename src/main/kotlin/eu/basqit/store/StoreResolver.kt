package eu.basqit.store

import eu.basqit.store.dto.StoreDto
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class StoreResolver(private val storeService: StoreService) {
    @QueryMapping
    fun stores(): List<StoreDto> {
        return storeService.stores()
    }
}