package com.lee.gson;

//import com.fasterxml.jackson.databind.ObjectMapper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author cvLee
 * @Description //TODO
 * @Date 2019-09-26 17:02
 **/
@Configuration
public class WebMVCConfig {

//    @Bean
//    ObjectMapper objectMapper(){
//        ObjectMapper om=new ObjectMapper();
//        om.setDateFormat(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"));
//        return om;
//    }

//    @Bean
//    public GsonHttpMessageConverter gsonHttpMessageConverter() {
//        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
//        converter.setGson(new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create());
//        return converter;
//    }

    @Bean
    Gson gson() {
        return new GsonBuilder().setDateFormat("yyyy/MM/dd HH:mm:ss")
                .disableHtmlEscaping().create();
    }

}
