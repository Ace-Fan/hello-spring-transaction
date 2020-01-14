package com.wufan.hello.spring.transaction.dao;

import com.wufan.hello.spring.transaction.domain.TbContent;
import org.springframework.stereotype.Repository;

/**
 * @author Kirsh
 * @date 2020/1/11 20:16
 */
@Repository
public interface TbContentDao {
    public void insert(TbContent tbContent);
}
