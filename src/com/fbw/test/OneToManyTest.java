package com.fbw.test;
import com.fbw.mapper.CategoryMapper;
import com.fbw.po.Category;
import com.fbw.po.Product;
import com.fbw.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class OneToManyTest {
    public static void main(String[] args) {
        SqlSession sqlSession= MybatisUtils.getSqlSession( false);
       CategoryMapper categoryMapper=sqlSession.getMapper(CategoryMapper.class);
        List<Category> categories=categoryMapper.listCategory();
        for (Category category : categories){
            System.out.println(category);
            List<Product> products = category.getProducts();
            for(Product product : products){
                System.out.println(product);
            }
        }
    }
}
