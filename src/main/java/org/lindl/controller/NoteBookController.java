package org.lindl.controller;

import com.github.pagehelper.PageInfo;
import org.lindl.entity.NoteBook;
import org.lindl.entity.Result;
import org.lindl.service.NoteBookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/note_book")
public class NoteBookController {

	@Resource
	NoteBookService noteBookService;

	@ResponseBody
	@RequestMapping(value = "/queryNoteBooks",method = RequestMethod.GET)
	public Result queryNoteBook(HttpServletRequest request) throws Exception {
		int pageNum = Integer.parseInt(request.getParameter("pageNum"));
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
        PageInfo page=noteBookService.queryNoteBooks(pageNum,pageSize);
		return new Result(0,page,"查询用户笔记列表");
	}
/*
	@RequestMapping("/addNoteBookUI.action")
	public String addNoteBookUI() throws Exception {
		return "addNoteBook";
	}

	@RequestMapping("/addNoteBook.action")
	public String addNoteBook(NoteBook noteBook) throws Exception {
		// TODO 添加用户数据，同时更新缓存
		noteBookService.addNoteBook(noteBook);

		return "redirect:queryNoteBook.action";
	}

	@RequestMapping("/deleteNoteBook.action")
	public String deleteNoteBook(int id) {
		// TODO 删除数据库中指定的记录，然后删除缓存中指定的数据
		noteBookService.deleteNoteBook(id);

		return "redirect:queryNoteBook.action";
	}
	*/
}
