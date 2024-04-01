package com.mallApp.controller;

import com.mallApp.entity.Shop;
import com.mallApp.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShopController {
    @Autowired
    ShopService shopService;

    @GetMapping("/findAllShops")
    public List<Shop> findAllShops (){
        return shopService.findAllShops();
    }

    @PostMapping("/createShop")
    public Shop createShop(@RequestBody Shop shop){
        return shopService.createShop(shop);
    }
}
