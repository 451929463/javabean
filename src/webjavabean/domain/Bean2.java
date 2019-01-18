package webjavabean.domain;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

public class Bean2 {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("webjavabean.domain.User");
		Object object = clazz.newInstance();
		//通过反射得到对象，通过BeanUtils设置属性
		BeanUtils.setProperty(object, "id", "1");
		BeanUtils.setProperty(object, "nameString", "tian");
		BeanUtils.setProperty(object, "age", "23");
		System.out.println(object);
		//---------------------populate(object,map)-----------------------------
		User user = new User();
		Map<String , String> map = new HashMap<>();
		map.put("id", "1");
		map.put("nameString", "yu");
		map.put("age", "23");
		BeanUtils.populate(user, map);
		System.out.println(user);
	}

}
