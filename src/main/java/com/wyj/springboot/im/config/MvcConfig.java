package com.wyj.springboot.im.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.wyj.springboot.im.authorize.AnalyzeInterceptor;

/**
 * 
 * @author wuyingjie
 * @date 2017年9月29日
 */


@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"com.wyj.springboot.im.controller"})
//@PropertySource(value = "classpath:application.properties",  ignoreResourceNotFound = true,encoding = "UTF-8") 
public class MvcConfig extends WebMvcConfigurerAdapter{
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new AnalyzeInterceptor())
				.addPathPatterns("/**");
	}
	
}