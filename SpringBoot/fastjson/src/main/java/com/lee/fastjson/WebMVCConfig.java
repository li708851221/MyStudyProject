package com.lee.fastjson;

//import com.fasterxml.jackson.databind.ObjectMapper;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;

import java.util.ArrayList;
import java.util.List;

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

//    @Bean
//    Gson gson() {
//        return new GsonBuilder().setDateFormat("yyyy/MM/dd HH:mm:ss")
//                .disableHtmlEscaping().create();
//    }

    @Bean
    FastJsonHttpMessageConverter fastJsonHttpMessageConverter(){
        FastJsonHttpMessageConverter fastJson =new FastJsonHttpMessageConverter();
        FastJsonConfig config=new FastJsonConfig();
        config.setDateFormat("yyyy-MM-dd HH:mm:ss");
        config.setSerializerFeatures(SerializerFeature.PrettyFormat);
        // 处理中文的乱码问题
        // 创建MediaType的集合
        List<MediaType> supportedMediaTypes = new ArrayList<MediaType>();
        // 设置编码格式为UTF8
        supportedMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
        // 将supportedMediaTypes对象赋值给fastJsonHttpMessageConverter的SupportedMediaTypes属性
        fastJson.setSupportedMediaTypes(supportedMediaTypes );
        fastJson.setFastJsonConfig(config);
        return fastJson;
    }

}
