package com.example.cryptocurrencymvvm.domain.repository

import com.example.cryptocurrencymvvm.data.remote.dto.CoinDetailDto
import com.example.cryptocurrencymvvm.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun  getCoinById(coinId: String): CoinDetailDto
}