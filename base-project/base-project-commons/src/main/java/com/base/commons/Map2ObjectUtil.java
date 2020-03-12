package com.base.commons;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Map;

/**
 *
 * 〈map 转 自定义实体类 自定义工具类〉
 * 
 * @author Zy0116
 * @create 2018/11/16
 * @since 1.0.0
 */
public class Map2ObjectUtil {
	public static Object map2Object(Map<String, Object> map, Class<?> clazz) {

		if (map == null) {
			return null;
		}
		Object obj = null;
		try {
			obj = clazz.newInstance();

			// 获取自定义clazz类的全部字段
			Field[] fields = obj.getClass().getDeclaredFields();
			for (Field field : fields) {

				// 获取字段修饰符 需要排除静态及final修饰的字段
				int mod = field.getModifiers();
				if (Modifier.isStatic(mod) || Modifier.isFinal(mod)) {
					continue;
				}
				// 强制设置为 true 即可以对字段值进行设置 防止一些方法阻碍我们对属性进行赋值
				field.setAccessible(true);

				// map 中如果包含字段名称的 key 则将对应的值放入 clazz 对象对应的字段上
				if (map.containsKey(field.getName())) {
					field.set(obj, map.get(field.getName()));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
}
