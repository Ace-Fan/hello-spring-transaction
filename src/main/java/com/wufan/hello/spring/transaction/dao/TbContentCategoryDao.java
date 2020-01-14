package com.wufan.hello.spring.transaction.dao;

import com.wufan.hello.spring.transaction.domain.TbContentCategory;
import org.springframework.stereotype.Repository;

/**
 * @author Kirsh
 * @date 2020/1/11 20:15
 */
@Repository
public interface TbContentCategoryDao {
    public void insert(TbContentCategory tbContentCategory);
}
