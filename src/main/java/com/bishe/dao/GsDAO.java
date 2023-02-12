package com.bishe.dao;

import com.bishe.entity.Gs;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface  GsDAO {
    Gs findOne(String id);
    List<Gs>findAll();
    List<Gs> findAllGs();
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
    Gs findById(String id);

    Integer getGsCount(String guoshuname);
    List<Gs> getGsPages(Map<String,Object> map);

}
