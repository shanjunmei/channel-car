package com.hzins.common;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年1月28日 下午2:14:48
 * @version
 */
public class ObjectMapperFactory {

    private static class Holder {
	private final static ObjectMapper objectMapper = new ObjectMapper();
    }

    public static ObjectMapper getObjectMapper() {
	// ObjectMapper objectMapper = new ObjectMapper();
	Holder.objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	return Holder.objectMapper;
    }
}
