/**
 * 
 */
package memento.def.multistate;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * @author Ang Li
 *
 */
public class BeanUtils {

	public static HashMap<String, Object> backupProp(Object bean) {

		HashMap<String, Object> result = new HashMap<>();

		try {

			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());

			PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();

			for (PropertyDescriptor descriptor : descriptors) {

				String fieldName = descriptor.getName();

				Method getter = descriptor.getReadMethod();

				Object fieldValue = getter.invoke(bean, new Object[] {});

				if (!fieldName.equalsIgnoreCase("class")) {

					result.put(fieldName, fieldValue);

				}

			}

		} catch (Exception e) {

			// TODO: handle exception

		}

		return result;

	}

	public static void restoreProp(Object bean, HashMap<String, Object> propMap) {

		try {

			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());

			PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();

			for (PropertyDescriptor descriptor : descriptors) {

				String fieldName = descriptor.getName();

				if (propMap.containsKey(fieldName)) {

					Method setter = descriptor.getWriteMethod();

					setter.invoke(bean, new Object[] { propMap.get(fieldName) });
				}
			}
		} catch (Exception e) {

			System.out.println("shit");

			e.printStackTrace();
		}
	}

}
