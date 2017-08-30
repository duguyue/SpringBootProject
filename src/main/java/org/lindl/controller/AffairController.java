package org.lindl.controller;

import org.lindl.entity.Affair;
import org.lindl.entity.Result;
import org.lindl.service.AffairService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class AffairController {

	private static Logger logger= LoggerFactory.getLogger(AffairController.class);

	@Resource
    AffairService affairService;

	@ResponseBody
	@RequestMapping(value="/addAffair",method = RequestMethod.POST)
	public Result addAffair(@RequestBody Affair affair) throws Exception {
		logger.info("添加事务入参",affair);
		// TODO 添加用户数据，同时更新缓存
		affairService.addAffair(affair);

		return new Result(0,"添加事务成功!");
	}
/*
	@ResponseBody
	@RequestMapping(value = "/queryAffairs")
	public Result queryAffair(HttpServletRequest request) throws Exception {
		int page = Integer.parseInt(request.getParameter("page"));
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
		return affairService.queryAffairs(page, pageSize);
	}

	@RequestMapping("/addAffairUI.action")
	public String addAffairUI() throws Exception {
		return "addAffair";
	}



	@RequestMapping("/deleteAffair.action")
	public String deleteAffair(int id) {
		// TODO 删除数据库中指定的记录，然后删除缓存中指定的数据
		affairService.deleteAffair(id);

		return "redirect:queryAffair.action";
	}
	*/
}
