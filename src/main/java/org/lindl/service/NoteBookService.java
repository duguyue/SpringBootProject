package org.lindl.service;

import com.github.pagehelper.PageInfo;
import org.lindl.entity.NoteBook;

/**
 * 描述:
 * 作者:LinDL
 * 日期:2017/8/25
 */
public interface NoteBookService {
//    void addNoteBook(NoteBook noteBook);
//
//    void updateNoteBook(NoteBook noteBook);
//
//    void deleteNoteBook(int id);

    PageInfo queryNoteBooks(int pageNum, int pageSize);

//    NoteBook queryNoteBookById(int id);
}
