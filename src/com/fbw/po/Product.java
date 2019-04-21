package com.fbw.po;

import lombok.Data;

@Data
public class Product {
    private int id;
    private String name;
    private float price;
    private Category category;
}
