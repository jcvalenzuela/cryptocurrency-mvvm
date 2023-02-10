package com.example.cryptocurrencymvvm.presentation.coin_list

import com.example.cryptocurrencymvvm.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
