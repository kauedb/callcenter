package com.callcenter.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * callcenter
 * UserBean: Kauê Q. Carbonari
 * Date: 8/24/13
 * Time: 11:22 AM
 */
public class Client {

    private String name;

    private final List<Product> productList;


    public Client() {
        productList = new ArrayList<Product>(1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("name='").append(name).append('\'');
        sb.append(", productList=").append(productList);
        sb.append('}');
        return sb.toString();
    }
}
