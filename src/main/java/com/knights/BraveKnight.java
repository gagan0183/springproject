/**
 * 
 */
package com.knights;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author Gagan
 *
 */

public class BraveKnight implements Knight, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, BeanPostProcessor, DisposableBean {
	
	private Quest quest;
	
	public BraveKnight(Quest quest) {
		this.quest = quest;
	}

	public void embarkOnQuest() {
		quest.embark();
	}

	public void setBeanName(String arg0) {
		System.out.println("bean name runs");
	}

	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("in beanfactory");
	}

	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("in applicationcontexts");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("in afterproperties");
	}

	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("in postprocess");
		return arg0;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("in postprocessbc");
		return arg0;
	}

	public void destroy() throws Exception {
		System.out.println("in dispose methods");
	}
}
