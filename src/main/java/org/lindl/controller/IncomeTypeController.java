package org.lindl.controller;

import com.github.pagehelper.PageInfo;
import org.lindl.entity.Result;
import org.lindl.service.IncomeTypeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/income_type")
public class IncomeTypeController {

	@Resource
	IncomeTypeService incomeTypeService;

	@ResponseBody
	@RequestMapping(value = "/queryIncomeTypes",method = RequestMethod.GET)
	public Result queryIncomeType(HttpServletRequest request) {
		int pageNum = Integer.parseInt(request.getParameter("pageNum"));
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
        PageInfo page=incomeTypeService.queryIncomeTypes(pageNum,pageSize);
		return new Result(0,page,"查询用户收入类别");
	}
}
