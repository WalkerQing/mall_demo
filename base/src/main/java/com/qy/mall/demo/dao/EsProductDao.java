package com.qy.mall.demo.dao;

import com.qy.mall.demo.nosql.elasticsearch.document.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description
 * @Author zyq
 * @Date 2020-05-27 10:45
 */
public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
