package com.bishe.service;

import com.bishe.entity.Gs;

import java.util.List;
import java.util.Map;

public interface GsService {
    Gs findOne(String id);
    List<Gs>findAll();
    List<Gs>findAllGs();
    List<Gs> findAllHx();
    List<Gs> findAllMeat();
    List<Gs> findAllRice();
    List<Gs> findAllSnack();
    List<Gs> findAllCloth();
    List<Gs> findAllPants();
    List<Gs> findAllSkirt();
    List<Gs> findAllShoe();
    List<Gs> findAllTv();
    List<Gs> findAllCook();
    List<Gs> findAllTable();

    Integer getGsCount(String guoshuname);
    List<Gs> getGsPages(Map<String,Object> map);
}
