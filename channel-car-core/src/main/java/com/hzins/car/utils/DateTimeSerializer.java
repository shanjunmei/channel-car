package com.hzins.car.utils;

import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年3月4日 下午6:05:13
 * @version
 */
public class DateTimeSerializer extends JsonSerializer<Date> {

    @Override
    public void serialize(Date value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
	jgen.writeString(dateTimeFormat(value));

    }

    private String dateTimeFormat(Date value) {
	return DateUtils.dateTimeFormat(value);
    }
}
