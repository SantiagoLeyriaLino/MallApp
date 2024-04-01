package com.mallApp.service;

import com.mallApp.entity.Shop;

import java.util.List;

public interface ShopService {
    List<Shop> findAllShops();

    Shop createShop(Shop shop);
}
