package org.lindl.formatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by lin on 2017/1/31.
 */
public class DateFormatter implements Formatter<Date>{

    @Autowired
    private MessageSource messageSource;

    public DateFormatter(){
        super();
    }
    @Override
    public Date parse(String s, Locale locale) throws ParseException {
        return null;
    }

    @Override
    public String print(Date date, Locale locale) {
        SimpleDateFormat dateFormat=createDateFormat(locale);
        return dateFormat.format(date);
    }

    private SimpleDateFormat createDateFormat(Locale locale){
        String format=this.messageSource.getMessage("date.format",null,locale);
        SimpleDateFormat dateFormat=new SimpleDateFormat(format);
        dateFormat.setLenient(false);
        return dateFormat;
    }
}
