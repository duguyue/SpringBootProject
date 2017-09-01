package org.lindl.controller;

import com.github.pagehelper.PageInfo;
import org.lindl.entity.Result;
import org.lindl.service.ExpenseTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/expense_type")
public class ExpenseTypeController {

	@Resource
	ExpenseTypeService expenseTypeService;

	@ResponseBody
	@RequestMapping(value = "/queryExpenseTypes",method = RequestMethod.GET)
	public Result queryExpenseType(HttpServletRequest request) {
		int pageNum = Integer.parseInt(request.getParameter("pageNum"));
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
        PageInfo page=expenseTypeService.queryExpenseTypes(pageNum,pageSize);
		return new Result(0,page,"查询支出类别");
	}
}
