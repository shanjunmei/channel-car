package com.hzins;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>
 * 
 *
 *
 * </p>
 * @author	hz15101769 
 * @date	2015年11月4日 下午4:53:40
 * @version      
 */
public class TypeUtils {
    
    
    private final static Set<Class<?>> TYPES = new HashSet<Class<?>>();
    
    
    static {
	TYPES.add(String.class);
	TYPES.add(Boolean.class);
	TYPES.add(boolean.class);
	TYPES.add(Character.class);
	TYPES.add(char.class);
	TYPES.add(Byte.class);
	TYPES.add(byte.class);
	TYPES.add(Short.class);
	TYPES.add(short.class);
	TYPES.add(Integer.class);
	TYPES.add(int.class);
	TYPES.add(Long.class);
	TYPES.add(long.class);
	TYPES.add(Float.class);
	TYPES.add(float.class);
	TYPES.add(Double.class);
	TYPES.add(double.class);
    }

    public static boolean isWrapperType(Class<?> clazz) {
	return TYPES.contains(clazz);
    }

}
 