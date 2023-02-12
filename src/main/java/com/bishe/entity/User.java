package com.bishe.entity;



import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;


@Data
@Accessors(chain = true)
public class User implements Serializable {
    private Integer id;
    private String number;
    private String username;
    private String password;
    private String email;
    private String state;
    private Date registTime;

}
