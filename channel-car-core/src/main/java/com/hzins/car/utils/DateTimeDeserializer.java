package com.hzins.car.utils;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年3月4日 下午6:08:52
 * @version
 */
public class DateTimeDeserializer extends JsonDeserializer<Date> {

    @Override
    public Date deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
	return dateTimeParse(jp.getText());
    }

    private Date dateTimeParse(String value) {
	Date date = null;
	try {
	    date = DateUtils.dateTimeParse(value);
	} catch (ParseException e) {
	    e.printStackTrace();
	}
	
	return date;
    }

}
