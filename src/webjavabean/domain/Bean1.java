package webjavabean.domain;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.apache.commons.beanutils.BeanUtils;

public class Bean1 {

	public static void main(String[] args) {
		Class clazz = null;
		try {
			clazz = Class.forName("webjavabean.domain.User");
			Object object = clazz.newInstance();
			BeanUtils.setProperty(object, "id", 1);
			BeanUtils.setProperty(object, "nameString", "zhangsan");
			BeanUtils.setProperty(object, "age", "man");
			System.out.println(object);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String path = clazz.getName();//获取类路径
		System.out.println(path);
		Field[] fields = clazz.getDeclaredFields();//获取所有属性
		for (Field field : fields) {
			System.out.println(field);
		}
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		
		try {
			Constructor cons = clazz.getConstructor();
			System.out.println(cons);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
