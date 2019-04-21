package com.fbw.test;


import com.fbw.po.Product;
import com.fbw.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import com.fbw.mapper.ProductMapper;

import java.util.List;

public class ManyToOneTest {
    public static void main(String[] args) {
        SqlSession sqlSession= MybatisUtils.getSqlSession(false);
        ProductMapper productMapper=sqlSession.getMapper(ProductMapper.class);
        List<Product> products=productMapper.listProduct();
        System.out.println("manytoone");
        for (Product product : products){
            System.out.println(product);

        }
        System.out.println("manytoone");
    }
}
