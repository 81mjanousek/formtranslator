package com.janousek.formtranslator.common.util;

import java.lang.reflect.Method;

public class BeanUtil {

	static class TestBean {
		private int id = 0;

		private String name = null;

		private String code = null;

		public TestBean(int id, String name, String code) {
			this.id = id;
			this.name = name;
			this.code = code;
		}

		public String getCode() {
			return code;
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public String toString() {
			return getString(this);
		}
	}

	@SuppressWarnings("unchecked")
	public static String getString(Object bean) {
		StringBuilder sb = new StringBuilder();
		if (bean == null)
			return "null value";
		String className = bean.getClass().getCanonicalName();

		//get methods
		Method[] methods = bean.getClass().getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			String methodName = method.getName();

			if ((!methodName.startsWith("get") && !methodName.startsWith("is"))
					|| methodName.startsWith("getClass"))
				continue;

			String propertiesName = "??";
			if (methodName.startsWith("get"))
				propertiesName = methodName.substring(3);
			if (methodName.startsWith("is"))
				propertiesName = methodName.substring(2);

			propertiesName = propertiesName.substring(0, 1).toLowerCase()
					+ propertiesName.substring(1);
			//get method
			Class[] paramTypes = method.getParameterTypes();
			if (paramTypes.length != 0)
				continue;
			String value = "null";
			try {
				Object obj = method.invoke(bean, new Object[] {});
				if (obj != null)
					value = obj.toString();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			if (sb.length() != 0)
				sb.append(",");
			sb.append(propertiesName + "=" + value);
		}
		sb.insert(0, className + "[");
		sb.append("]");
		return sb.toString();
	}

	public static void main(String[] args) {
		try {
			TestBean bean = new TestBean(123, "sdsd", "pokus");
			System.out.println(bean);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
