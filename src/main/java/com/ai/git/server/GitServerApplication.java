package com.ai.git.server;

import okhttp3.OkHttpClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.WebApplicationInitializer;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author pengqiang
 * @date 2017/8/31
 * 在zop工程里面请不要使用Map，HashMap，请尽量使用bean！！！！
 */
@SpringBootApplication
//@ServletComponentScan(basePackages ="com.ai.git.server")
public class GitServerApplication extends SpringBootServletInitializer implements WebApplicationInitializer {


    public static void main(String[] args) {
        SpringApplication.run(GitServerApplication.class, args);
    }


}
