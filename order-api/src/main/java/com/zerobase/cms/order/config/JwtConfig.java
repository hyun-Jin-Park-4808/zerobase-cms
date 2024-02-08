package com.zerobase.cms.order.config;

import com.zerobase.domain.config.JwtAuthenticationProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JwtConfig {
    // JwtAuthenticationProvider 클래스의 인스턴스를 Spring의 ApplicationContext에 빈으로 등록하여,
    // 애플리케이션 전반에서 JwtAuthenticationProvider 클래스의 인스턴스를 사용할 수 있게 하기 위함
    @Bean
    public JwtAuthenticationProvider jwtAuthenticationProvider() {
        return new JwtAuthenticationProvider();
    }
}
