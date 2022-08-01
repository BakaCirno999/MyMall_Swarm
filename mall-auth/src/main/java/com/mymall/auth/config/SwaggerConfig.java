package com.mymall.auth.config;

import com.mymall.common.config.BaseSwaggerConfig;
import com.mymall.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.mymall.auth.controller")
                .title("MyMall认证中心")
                .description("MyMall认证中心相关接口文档")
                .contactName("ganqian")
                .enableSecurity(true)
                .build();
    }
}
