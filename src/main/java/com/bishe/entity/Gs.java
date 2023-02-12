package com.bishe.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class Gs implements Serializable {
    private String id;
    private String guoshuname;
    private String photo;
    private double price;
    private Integer pid;
}
