package rest.server.config;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import java.util.List;

@Configuration
@ComponentScan(basePackages = "rest.server")
public class AppConfig {

    @Bean
    public MappingJackson2HttpMessageConverter jsonMessageConverter() {
        return new MappingJackson2HttpMessageConverter();
    }

    @Bean
    RequestMappingHandlerAdapter requestMappingHandlerAdapter() {
        RequestMappingHandlerAdapter adapter = new RequestMappingHandlerAdapter();
        adapter.setMessageConverters(Lists.newArrayList(jsonMessageConverter()));
        return adapter;
    }

}