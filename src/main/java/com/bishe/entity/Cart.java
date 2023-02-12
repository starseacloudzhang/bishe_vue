package com.bishe.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Cart {
    private Integer cid;
    private String pic;
    private String shopname;
    private double price;
    private Integer id;
    private Integer tid;
    private Integer uid;
}
