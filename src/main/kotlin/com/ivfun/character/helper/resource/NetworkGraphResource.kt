package com.ivfun.character.helper.resource

import com.ivfun.character.helper.dto.NetworkGraph
import com.ivfun.character.helper.service.NetworkGraphService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["network-graph"])
class NetworkGraphResource(val networkGraphService: NetworkGraphService)
{
    @RequestMapping(method = [RequestMethod.GET])
    fun getAll() :ArrayList<NetworkGraph>?
    {
        return networkGraphService.getNetworkGraph()
    }
}