package com.lee.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.*;
import java.util.Date;

/**
 * @Author cvLee
 * @Description //TODO
 * @Date 2019-09-26 17:02
 **/
@Configuration
public class WebMVCConfig {

    @Bean
    ObjectMapper objectMapper(){
        ObjectMapper om=new ObjectMapper();
        om.setDateFormat(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"));
        return om;
    }
}
