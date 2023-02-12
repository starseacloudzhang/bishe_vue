package com.bishe.controller;

import com.bishe.entity.Gs;
import com.bishe.service.GsService;
import com.bishe.utl.PageBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin//跨域访问
@RequestMapping("gsshop")//域名
@Slf4j
public class GsController {
    @Autowired
    private GsService gsService;
    @GetMapping("findAll")
    public Map<String,Object> findAll(){
        Map<String, Object> map = new HashMap<>();
        try {
            List<Gs> allgsList = gsService.findAll();
            map.put("records", allgsList);
            map.put("state", true);
            map.put("code", 200);
            map.put("msg", "商品信息查询成功!");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("state", false);
            map.put("code", 500);
            map.put("msg", "商品信息查询失败!");
        }
        return map;
    }

    @GetMapping("findAllGs")
    public Map<String, Object> findAllGs() {


        Map<String, Object> map = new HashMap<>();
        try {
            List<Gs> gsList = gsService.findAllGs();
            map.put("records", gsList);
            map.put("state", true);
            map.put("code", 200);
            map.put("msg", "商品信息查询成功!");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("state", false);
            map.put("code", 500);
            map.put("msg", "商品信息查询失败!");
        }
        return map;

    }

    @GetMapping("findAllHx")
    public Map<String, Object> findAllHx() {


        Map<String, Object> map = new HashMap<>();
        try {
            List<Gs> hxList = gsService.findAllHx();
            map.put("records", hxList);
            map.put("state", true);
            map.put("code", 200);
            map.put("msg", "商品信息查询成功!");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("state", false);
            map.put("code", 500);
            map.put("msg", "商品信息查询失败!");
        }
        return map;

    }

    @GetMapping("findAllMeat")
    public Map<String, Object> findAllMeat() {


        Map<String, Object> map = new HashMap<>();
        try {
            List<Gs> meatList = gsService.findAllMeat();
            map.put("records",meatList);
            map.put("state", true);
            map.put("code", 200);
            map.put("msg", "商品信息查询成功!");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("state", false);
            map.put("code", 500);
            map.put("msg", "商品信息查询失败!");
        }
        return map;

    }
    @GetMapping("findAllRice")
    public Map<String, Object> findAllRice() {


        Map<String, Object> map = new HashMap<>();
        try {
            List<Gs> riceList = gsService.findAllRice();
            map.put("records",riceList);
            map.put("state", true);
            map.put("code", 200);
            map.put("msg", "商品信息查询成功!");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("state", false);
            map.put("code", 500);
            map.put("msg", "商品信息查询失败!");
        }
        return map;

    }

    @GetMapping("findAllSnack")
    public Map<String, Object> findAllSnack() {


        Map<String, Object> map = new HashMap<>();
        try {
            List<Gs> snackList = gsService.findAllSnack();
            map.put("records",snackList);
            map.put("state", true);
            map.put("code", 200);
            map.put("msg", "商品信息查询成功!");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("state", false);
            map.put("code", 500);
            map.put("msg", "商品信息查询失败!");
        }
        return map;

    }

    @GetMapping("findAllCloth")
    public Map<String, Object> findAllCloth() {


        Map<String, Object> map = new HashMap<>();
        try {
            List<Gs> clothList = gsService.findAllCloth();
            map.put("records",clothList);
            map.put("state", true);
            map.put("code", 200);
            map.put("msg", "商品信息查询成功!");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("state", false);
            map.put("code", 500);
            map.put("msg", "商品信息查询失败!");
        }
        return map;

    }
    @GetMapping("findAllPants")
    public Map<String, Object> findAllSkirt() {


        Map<String, Object> map = new HashMap<>();
        try {
            List<Gs> skirtList = gsService.findAllSkirt();
            map.put("records",skirtList);
            map.put("state", true);
            map.put("code", 200);
            map.put("msg", "商品信息查询成功!");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("state", false);
            map.put("code", 500);
            map.put("msg", "商品信息查询失败!");
        }
        return map;

    }
    @GetMapping("findAllSkirt")
    public Map<String, Object> findAllPants() {


        Map<String, Object> map = new HashMap<>();
        try {
            List<Gs> pantList = gsService.findAllPants();
            map.put("records",pantList);
            map.put("state", true);
            map.put("code", 200);
            map.put("msg", "商品信息查询成功!");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("state", false);
            map.put("code", 500);
            map.put("msg", "商品信息查询失败!");
        }
        return map;

    }
    @GetMapping("findAllShoe")
    public Map<String, Object> findAllShoe() {


        Map<String, Object> map = new HashMap<>();
        try {
            List<Gs> shoeList = gsService.findAllShoe();
            map.put("records",shoeList);
            map.put("state", true);
            map.put("code", 200);
            map.put("msg", "商品信息查询成功!");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("state", false);
            map.put("code", 500);
            map.put("msg", "商品信息查询失败!");
        }
        return map;

    }

    @GetMapping("findAllTv")
    public Map<String, Object> findAllTv() {


        Map<String, Object> map = new HashMap<>();
        try {
            List<Gs> tvList = gsService.findAllTv();
            map.put("records",tvList);
            map.put("state", true);
            map.put("code", 200);
            map.put("msg", "商品信息查询成功!");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("state", false);
            map.put("code", 500);
            map.put("msg", "商品信息查询失败!");
        }
        return map;

    }
    @GetMapping("findAllCook")
    public Map<String, Object> findAllCook() {


        Map<String, Object> map = new HashMap<>();
        try {
            List<Gs> cookList = gsService.findAllCook();
            map.put("records",cookList);
            map.put("state", true);
            map.put("code", 200);
            map.put("msg", "商品信息查询成功!");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("state", false);
            map.put("code", 500);
            map.put("msg", "商品信息查询失败!");
        }
        return map;

    }
    @GetMapping("findAllTable")
    public Map<String, Object> findAllTable() {


        Map<String, Object> map = new HashMap<>();
        try {
            List<Gs> tableList = gsService.findAllTable();
            map.put("records",tableList);
            map.put("state", true);
            map.put("code", 200);
            map.put("msg", "商品信息查询成功!");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("state", false);
            map.put("code", 500);
            map.put("msg", "商品信息查询失败!");
        }
        return map;

    }

    @GetMapping("findOne")
    public Map<String, Object>  findOne(String id){
        log.info("查询商品信息的id: [{}]",id);

        Map<String, Object> map = new HashMap<>();
        try {
            Gs shopinfo = gsService.findOne(id);
            map.put("records", shopinfo);
            map.put("state", true);
            map.put("code", 200);
            map.put("msg", "商品信息保存成功!");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("state", false);
            map.put("code", 500);
            map.put("msg", "商品信息保存失败!");
        }
        return map;

    }

/*
* 搜索
*
* */
@GetMapping("getSearchPage")
public Map<String , Object> getSearchPage(@RequestParam("currentPage")int currentPage, @RequestParam("guoshuname")String guoshuname){
    PageBean pageBean=new PageBean();
    pageBean.setCurrentPage(currentPage);
//    分页的条数
    pageBean.setPageSize(8);
    //传入总数
    Integer a=gsService.getGsCount(guoshuname);
    System.out.println("总数："+a);
    pageBean.setTotalCount(a);


    Map <String ,Object> map=new HashMap<>();
    try{
        map.put("guoshuname",guoshuname);
        map.put("startIndex",pageBean.getStartIndex());
        map.put("pageSize",pageBean.getPageSize());
        map.put("currentPage",pageBean.getCurrentPage());
        List<Gs> gsList=gsService.getGsPages(map);
        for(Gs gs:gsList){
            System.out.println(gs);
        }
        map.put("page",gsList);
        map.put("pageCount",pageBean.getTotalPage());
        map.put("total",a);
        map.put("state", true);
        map.put("code", 200);
        map.put("msg", "商品信息查询成功!");
    }catch (Exception e){
        e.printStackTrace();
        map.put("state", false);
        map.put("code", 500);
        map.put("msg", "商品信息查询失败!");
    }
    return map;

}


}
