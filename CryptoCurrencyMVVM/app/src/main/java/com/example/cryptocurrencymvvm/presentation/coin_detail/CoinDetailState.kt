package com.example.cryptocurrencymvvm.presentation.coin_detail

import com.example.cryptocurrencymvvm.domain.model.Coin
import com.example.cryptocurrencymvvm.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
