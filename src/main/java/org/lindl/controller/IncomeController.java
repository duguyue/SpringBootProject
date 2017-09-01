package org.lindl.controller;

import com.github.pagehelper.PageInfo;
import org.lindl.entity.Result;
import org.lindl.service.IncomeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/income")
public class IncomeController {


	@Resource
	IncomeService incomeService;

	@ResponseBody
	@RequestMapping(value = "/queryIncome",method = RequestMethod.GET)
	public Result queryIncome(HttpServletRequest request) {
		int pageNum = Integer.parseInt(request.getParameter("pageNum"));
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
        PageInfo page=incomeService.queryIncome(pageNum,pageSize);
		return new Result(0,page,"查询用户收入列表");
	}
}
