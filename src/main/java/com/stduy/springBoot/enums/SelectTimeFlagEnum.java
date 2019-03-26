package com.stduy.springBoot.enums;

import org.springframework.util.StringUtils;

/**
 * 
 * @author zhu_f
 *
 */
public enum SelectTimeFlagEnum {

    CREATE_TIME("1", "根据创建时间条件查询"), 
    PUBLISH_TIME("2", "根据发布时间条件查询");
    private String code;
    private String desc;

    private SelectTimeFlagEnum(String code, String desc) {
	this.code = code;
	this.desc = desc;
    }

    public String getCode() {
	return code;
    }

    public String getDesc() {
	return desc;
    }

    /**
     * 
     * @Title: isQueryTimeFlagEnum
     * @Description: 枚举类判断
     * @param code
     * @return boolean
     */
    public static boolean isQueryTimeFlagEnum(String code) {
	for (SelectTimeFlagEnum contentTypeEnum : SelectTimeFlagEnum.values()) {
	    if (StringUtils.isEmpty(code)) {
		return false;
	    }
	    if (contentTypeEnum.getCode().equals(code)) {
		return true;
	    }
	}
	return false;
    }
}
