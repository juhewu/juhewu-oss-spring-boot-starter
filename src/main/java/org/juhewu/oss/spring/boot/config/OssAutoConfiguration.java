package org.juhewu.oss.spring.boot.config;

import org.juhewu.oss.spring.boot.core.OssTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * OSS 自动配置
 *
 * @author duanjw
 * @since 2020-04-26
 **/
@Configuration(proxyBeanMethods = false)
@Import({ OssProperties.class })
public class OssAutoConfiguration {

    /**
     * 对象存储模板
     *
     * @param ossProperties 配置
     * @return OssTemplate
     */
    @Bean
    public OssTemplate ossTemplate(OssProperties ossProperties) {
        return new OssTemplate(ossProperties);
    }
}
