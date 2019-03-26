/**
*@Company
* 
*@Description: 
*@ClassName: MarketingContentMultQryReq.java
*@author zhufj
*@date 2019-03-18 06:16:44
*/
package com.stduy.springBoot.bean;

import java.io.Serializable;

import lombok.Data;
@Data
public class MultQryRes implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 标题
     */
    private String title;

    /**
     * 类型：常见问题4 系统消息
     */
    private String type;

    /**
     * 发布人员名称
     */
    private String createrName;

    /**
     * 状态：1 待发布；2 已发布，3取消发布
     */
    private Integer status;
    
}