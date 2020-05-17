package name.guolanren.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author guolanren
 */
public class BeanFactoryStart {

	public static void main(String[] args) {
		BeanFactory bf = new DefaultListableBeanFactory();
		BeanDefinitionReader bdr = new XmlBeanDefinitionReader((BeanDefinitionRegistry) bf);
		// 1. 使用 AbstractBeanDefinitionReader 的 loadBeanDefinitions(String location)
		bdr.loadBeanDefinitions("classpath:bean-definition-reader.xml");
		// 2. 使用 XmlBeanDefinitionReader 重写后的 loadBeanDefinitions(Resource resource)
		Resource resource = new ClassPathResource("bean-definition-reader.xml");
		bdr.loadBeanDefinitions(resource);
	}

}
