package com.ivfun.character.helper.service.impl


import com.ivfun.character.helper.dto.NetworkGraph
import com.ivfun.character.helper.repository.ConnectionRepository
import com.ivfun.character.helper.repository.NodeRepository
import com.ivfun.character.helper.repository.TypeConnectionRepository
import com.ivfun.character.helper.service.NetworkGraphService
import org.springframework.stereotype.Service

@Service
class NetworkGraphServiceImpl(val connectionRepository: ConnectionRepository,
                              val nodeRepository: NodeRepository,
                              val typeConnectionRepository: TypeConnectionRepository)
: NetworkGraphService
{

    override fun getNetworkGraph() :  ArrayList<NetworkGraph>
    {
        val connections = connectionRepository.findAll()
        val list = ArrayList<NetworkGraph>()
        connections
        .forEach{ c ->
                  val n_a = nodeRepository.findOne(c.id_node_a)
                  val n_b = nodeRepository.findOne(c.id_node_b)
                  val type = typeConnectionRepository.findOne(c.id_type_connection)
                   list.add(NetworkGraph(n_a, n_b, type))
                }

        return list
    }



}

