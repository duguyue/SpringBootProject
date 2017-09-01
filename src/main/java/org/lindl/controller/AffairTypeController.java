package org.lindl.controller;

import com.github.pagehelper.PageInfo;
import org.lindl.entity.AffairType;
import org.lindl.entity.Result;
import org.lindl.service.AffairTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/affair_type")
public class AffairTypeController {

	@Resource
	AffairTypeService affairTypeService;

	@ResponseBody
	@RequestMapping(value = "/queryAffairTypes",method = RequestMethod.GET)
	public Result queryAffairType(HttpServletRequest request) throws Exception {
		int pageNum = Integer.parseInt(request.getParameter("pageNum"));
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
        PageInfo<AffairType> page=affairTypeService.queryAffairTypes(pageNum,pageSize);
		return new Result(0,page,"查询事务类别");
	}
/*
	@RequestMapping("/addAffairTypeUI.action")
	public String addAffairTypeUI() throws Exception {
		return "addAffairType";
	}

	@RequestMapping("/addAffairType.action")
	public String addaffairType(AffairType affairType) throws Exception {
		// TODO 添加用户数据，同时更新缓存
		affairTypeService.addAffairType(affairType);

		return "redirect:queryAffairType.action";
	}

	@RequestMapping("/deleteAffairType.action")
	public String deleteAffairType(int id) {
		// TODO 删除数据库中指定的记录，然后删除缓存中指定的数据
		affairTypeService.deleteAffairType(id);

		return "redirect:queryAffairType.action";
	}
	*/
}
