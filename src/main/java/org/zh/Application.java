package org.zh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by ZhaoHang on 2017/4/13.
 */
@EnableAutoConfiguration
@SpringBootApplication
@EnableRedisHttpSession
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
