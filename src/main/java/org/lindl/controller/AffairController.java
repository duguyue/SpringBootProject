package org.lindl.controller;

import com.github.pagehelper.PageInfo;
import org.hibernate.jpa.criteria.expression.function.AbsFunction;
import org.lindl.entity.Affair;
import org.lindl.entity.Result;
import org.lindl.service.AffairService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/affair")
public class AffairController {

	private static Logger logger= LoggerFactory.getLogger(AffairController.class);

	@Resource
    AffairService affairService;

	@ResponseBody
	@RequestMapping(value="/addAffair",method = RequestMethod.POST)
	public Result addAffair(@RequestBody Affair affair) throws Exception {
		logger.info("添加事务入参",affair);
		affairService.addAffair(affair);

		return new Result(0,"添加事务成功!");
	}
	@ResponseBody
	@RequestMapping(value = "/updateAffair",method = RequestMethod.POST)
	public Result updateAffair(@RequestBody Affair affair){
		logger.info("修改事务入参",affair);
		affairService.updateAffair(affair);
		return new Result(0,"修改事务");
	}
	@ResponseBody
	@RequestMapping(value = "/queryAffairs",method = RequestMethod.GET)
	public Result queryAffair(HttpServletRequest request) throws Exception {
		int pageNum = Integer.parseInt(request.getParameter("pageNum"));
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
		PageInfo<Affair> page=affairService.queryAffairs(pageNum,pageSize);
		return new Result(0,page,"查询事务列表成功!");
	}
	@ResponseBody
	@RequestMapping(value = "/queryAffairById/{id}")
	public Result queryAffairById(@PathVariable int id){
		Affair affair=affairService.queryAffairById(id);
		return new Result(0,affair,"查询单个事务信息");
	}

	@ResponseBody
	@RequestMapping(value="/deleteAffair/{id}")
	public Result deleteAffair(@PathVariable int id) {
		affairService.deleteAffair(id);

		return new Result(0,"删除事务");
	}

}
