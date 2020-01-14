package com.wufan.hello.spring.transaction.domain;

import lombok.Data;

import java.util.Date;

/**
 * 内容分类管理
 * @author Kirsh
 * @date 2020/1/7 20:30
 */
@Data
public class TbContentCategory{
    private Long id;
    private String name;
    private Integer status;
    private Integer sortOrder;
    private Boolean isParent;
    private Date created;
    private Date updated;
    private TbContentCategory parent;
}
