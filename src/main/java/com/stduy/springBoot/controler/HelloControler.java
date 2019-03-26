package com.stduy.springBoot.controler;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stduy.springBoot.bean.MultQryReq;
import com.stduy.springBoot.bean.MultQryRes;

@RestController
@Api(tags = "查询管理")
@RequestMapping(value = "/root/")
public class HelloControler {

	@PostMapping(value = "multQry")
    @ApiOperation(value = "分页查询")
	public MultQryRes multQry(@RequestBody MultQryReq multQryReq){
		MultQryRes multQryRes= new MultQryRes();
		return multQryRes;
	};
}
