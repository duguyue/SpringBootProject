package org.lindl.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.lindl.entity.NoteBook;

import java.util.List;

/**
 * 描述:
 * 作者:LinDL
 * 日期:2017/9/1
 */
@Mapper
public interface NoteBookMapper {
    List<NoteBook> queryNoteBooks();
}
