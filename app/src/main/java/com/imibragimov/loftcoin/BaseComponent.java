package com.imibragimov.loftcoin;

import android.content.Context;

import com.imibragimov.loftcoin.data.CoinsRepo;
import com.imibragimov.loftcoin.data.CurrencyRepo;
import com.imibragimov.loftcoin.data.WalletsRepo;
import com.imibragimov.loftcoin.util.ImageLoader;
import com.imibragimov.loftcoin.util.Notifier;
import com.imibragimov.loftcoin.util.RxSchedulers;

public interface BaseComponent {
    Context context();

    CoinsRepo coinsRepo();

    CurrencyRepo currencyRepo();

    WalletsRepo walletsRepo();

    ImageLoader imageLoader();

    RxSchedulers schedulers();

    Notifier notifier();
}
