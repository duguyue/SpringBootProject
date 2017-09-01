package org.lindl.controller;

import com.github.pagehelper.PageInfo;
import org.lindl.entity.Result;
import org.lindl.service.ExpenseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/expense")
public class ExpenseController {

	@Resource
	ExpenseService expenseService;

	@ResponseBody
	@RequestMapping(value = "/queryExpense",method = RequestMethod.GET)
	public Result queryExpense(HttpServletRequest request) {
		int pageNum = Integer.parseInt(request.getParameter("pageNum"));
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
        PageInfo page=expenseService.queryExpense(pageNum,pageSize);
		return new Result(0,page,"查询用户支出列表");
	}
}
