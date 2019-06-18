package com.yy.demo.session2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @author yy
 * @ProjectName springboot-session
 * @Description: TODO
 * @date 2019/6/18 15:09
 */

@Configuration
@EnableRedisHttpSession
public class RedisSessionConfig {
}
