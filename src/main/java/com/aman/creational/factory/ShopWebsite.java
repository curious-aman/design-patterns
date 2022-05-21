package com.aman.creational.factory;

public class ShopWebsite extends Website{

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
