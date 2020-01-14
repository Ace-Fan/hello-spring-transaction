package com.wufan.hello.spring.transaction.service;

import com.wufan.hello.spring.transaction.domain.TbContent;
import com.wufan.hello.spring.transaction.domain.TbContentCategory;

/**
 * @author Kirsh
 * @date 2020/1/11 20:19
 */
public interface TbContentCategoryService {
    public void save(TbContentCategory tbContentCategory, TbContent tbContent);
}
