package com.bishe.service.impl;

import com.bishe.dao.GsDAO;
import com.bishe.entity.Gs;
import com.bishe.service.GsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class GsServiceImpl implements GsService {
    @Autowired
    private GsDAO gsDAO;

    @Override
    public Gs findOne(String id) {
        return gsDAO.findOne(id);
    }

    @Override
    public List<Gs> findAll() {
        return gsDAO.findAll();
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Gs> findAllGs() {
        return gsDAO.findAllGs();
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Gs> findAllHx() {
        return gsDAO.findAllHx();
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Gs> findAllMeat() {
        return  gsDAO.findAllMeat();
    }

    @Override
    public List<Gs> findAllRice() {
        return gsDAO.findAllRice();
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Gs> findAllSnack() {
        return gsDAO.findAllSnack();
    }

    @Override
    public List<Gs> findAllCloth() {
        return gsDAO.findAllCloth();
    }

    @Override
    public List<Gs> findAllPants() {
        return gsDAO.findAllPants();
    }

    @Override
    public List<Gs> findAllSkirt() {
        return gsDAO.findAllSkirt();
    }

    @Override
    public List<Gs> findAllShoe() {
        return gsDAO.findAllShoe();
    }

    @Override
    public List<Gs> findAllTv() {
        return gsDAO.findAllTv();
    }

    @Override
    public List<Gs> findAllCook() {
        return gsDAO.findAllCook();
    }

    @Override
    public List<Gs> findAllTable() {
        return gsDAO.findAllTable();
    }

    /*
    * 搜索
    * */
    @Override
    public Integer getGsCount(String guoshuname) {
        return gsDAO.getGsCount(guoshuname);
    }

    @Override
    public List<Gs> getGsPages(Map<String, Object> map) {
        return gsDAO.getGsPages(map);
    }
}
