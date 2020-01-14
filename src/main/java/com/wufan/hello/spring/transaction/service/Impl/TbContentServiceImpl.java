package com.wufan.hello.spring.transaction.service.Impl;


import com.wufan.hello.spring.transaction.dao.TbContentDao;
import com.wufan.hello.spring.transaction.domain.TbContent;
import com.wufan.hello.spring.transaction.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Kirsh
 * @date 2020/1/11 20:22
 */
@Service
public class TbContentServiceImpl implements TbContentService {
    @Autowired
    private TbContentDao tbContentDao;

    @Override
    public void save(TbContent tbContent) {
        tbContentDao.insert(tbContent);
    }
}
