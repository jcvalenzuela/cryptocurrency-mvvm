package com.example.cryptocurrencymvvm.data.repository

import com.example.cryptocurrencymvvm.data.remote.CoinPaprikaApi
import com.example.cryptocurrencymvvm.data.remote.dto.CoinDetailDto
import com.example.cryptocurrencymvvm.data.remote.dto.CoinDto
import com.example.cryptocurrencymvvm.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}