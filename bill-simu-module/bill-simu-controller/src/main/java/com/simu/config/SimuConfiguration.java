package com.simu.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangzl
 * @date 2023年04月09
 */
@Configuration
@MapperScan(basePackages = "com.simu.mapper")
public class SimuConfiguration {
}
