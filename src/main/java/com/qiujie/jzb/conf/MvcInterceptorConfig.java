package com.qiujie.jzb.conf;

import com.qiujie.jzb.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
@Configurable
public class MvcInterceptorConfig extends WebMvcConfigurationSupport {
    @Autowired
    private LoginInterceptor loginInterceptor;
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        System.out.println("开始");
        registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns("/index","/login");
        super.addInterceptors(registry);
    }
}
