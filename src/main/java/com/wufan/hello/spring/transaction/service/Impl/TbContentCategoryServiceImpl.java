package com.wufan.hello.spring.transaction.service.Impl;

import com.wufan.hello.spring.transaction.dao.TbContentCategoryDao;
import com.wufan.hello.spring.transaction.domain.TbContent;
import com.wufan.hello.spring.transaction.domain.TbContentCategory;
import com.wufan.hello.spring.transaction.service.TbContentCategoryService;
import com.wufan.hello.spring.transaction.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Kirsh
 * @date 2020/1/11 20:21
 */
@Service
@Transactional
public class TbContentCategoryServiceImpl implements TbContentCategoryService {

    @Autowired
    private TbContentCategoryDao tbContentCategoryDao;

    @Autowired
    private TbContentService tbContentService;

    @Override
    public void save(TbContentCategory tbContentCategory, TbContent tbContent) {
        tbContentCategoryDao.insert(tbContentCategory);
        tbContentService.save(tbContent);
    }
}
