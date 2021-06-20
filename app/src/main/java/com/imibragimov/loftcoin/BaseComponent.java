package com.imibragimov.loftcoin;

import android.content.Context;

import com.imibragimov.loftcoin.data.CoinsRepo;
import com.imibragimov.loftcoin.data.CurrencyRepo;
import com.imibragimov.loftcoin.util.ImageLoader;

public interface BaseComponent {
    Context context();
    CoinsRepo coinsRepo();
    CurrencyRepo currencyRepo();
    ImageLoader imageLoader();
}