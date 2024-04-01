package com.mallApp.service;

import com.mallApp.entity.Shop;
import com.mallApp.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    ShopRepository shopRepository;

    @Override
    public List<Shop> findAllShops() {
        return shopRepository.findAll();
    }

    @Override
    public Shop createShop(Shop shop) {
        return shopRepository.save(shop);
    }
}
