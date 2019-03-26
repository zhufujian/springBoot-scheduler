/**
*@Company
* 
*@Description: 
*@ClassName: MarketingContentMultQryReq.java
*@author zhufj
*@date 2019-03-18 06:16:44
*/
package com.stduy.springBoot.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import org.springframework.util.StringUtils;

import com.stduy.springBoot.enums.SelectTimeFlagEnum;
@Data
@EqualsAndHashCode(callSuper=true)
public class MultQryReq extends BasePageReq{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 标题
     */
    @ApiModelProperty(notes = "标题", required = false)
    private String title;

    /**
     * 类型：常见问题4 系统消息
     */
    @ApiModelProperty(notes = "类型： 常见问题4 系统消息", required = false)
    private String type;

    /**
     * 发布人员名称
     */
    @ApiModelProperty(notes = "类发布人员名称", required = false)
    private String createrName;

    /**
     * 状态：1 待发布；2 已发布，3取消发布
     */
    @ApiModelProperty(notes = "状态：1 待发布；2 已发布，3取消发布", required = false)
    private Integer status;
    
    @Override
    public String validateLogic() {
	if(!StringUtils.isEmpty(selectTimeFlag)&&!SelectTimeFlagEnum.isQueryTimeFlagEnum(selectTimeFlag)){
	    return "请求参数[selectTimeFlag]错误";
	} 
	return null;
    }

}