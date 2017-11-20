package org.lindl.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.lindl.entity.NoteBook;
import org.lindl.mapper.NoteBookMapper;
import org.lindl.service.NoteBookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述:
 * 作者:LinDL
 * 日期:2017/9/1
 */
@Service
public class NoteBookServiceImpl implements NoteBookService{
    @Resource
    private NoteBookMapper noteBookMapper;
    @Override
    public PageInfo queryNoteBooks(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<NoteBook> list=noteBookMapper.queryNoteBooks();
        PageInfo<NoteBook> page=new PageInfo<NoteBook>(list);
        return page;
    }
}
