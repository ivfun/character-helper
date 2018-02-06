package com.ivfun.character.helper.service

import com.ivfun.character.helper.dto.NetworkGraph

interface NetworkGraphService
{
    fun getNetworkGraph() :  ArrayList<NetworkGraph>?
}