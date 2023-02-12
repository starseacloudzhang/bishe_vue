package com.bishe.Dao;


import com.bishe.dao.CartDao;
import com.bishe.dao.GsDAO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @RunWith:表示启动这个单元测试类（单元测试类是不能够运行的），需要传递一个参数，必须是springrunner的实例类型
 */
@RunWith(SpringRunner.class)
/**
 * @SpringBootTest:表示当前类是一个测试类，不会随同项目一块打包
 */

@SpringBootTest
@Slf4j
public class CartDaoTests {

    @Autowired
    private GsDAO gsDAO;
    @Autowired
    private CartDao cartDao;

    @Test
    public void findAll(){
        System.out.println(gsDAO.findById("6"));
    }
    @Test
    public void delete(){
        cartDao.delete(9,2);
    }

}
