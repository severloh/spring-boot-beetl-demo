package cn.silvester.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * web各组件配置类
 * Created by lpf on 2017/5/8.
 */
@Configuration
public class WebComponentConfig {
    /**
     * jwt token过滤器
     * @return
     */
    /*FilterRegistrationBean 用来配置urlpattern 来确定哪些路径触发filter */
    @Bean
    public FilterRegistrationBean someFilterRegistration() {

        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(JsonWebTokenFilter());
        registration.addUrlPatterns("/home");
        registration.setOrder(1);
        return registration;
    }

    /*使用annotation tag来取代<bean></bean>*/
    @Bean()
    public JsonWebTokenFilter JsonWebTokenFilter() {
        return new JsonWebTokenFilter();
    }

}
