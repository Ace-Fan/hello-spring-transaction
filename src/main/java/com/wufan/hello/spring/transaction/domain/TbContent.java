package com.wufan.hello.spring.transaction.domain;


import lombok.Data;

import java.util.Date;

/**
 * 内容管理
 * @author Kirsh
 * @date 2020/1/8 11:51
 */
@Data
public class TbContent {

   private Long id;
   private String title;
   private String subTitle;
   private String titleDesc;
   private String url;
   private String pic;
   private String pic2;
   private String content;
   private Date created;
   private Date updated;
   private TbContentCategory tbContentCategory;
}
