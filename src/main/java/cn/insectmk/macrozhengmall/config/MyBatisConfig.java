package cn.insectmk.macrozhengmall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description MyBatis配置类，用于配置动态生成的mapper接口的路径
 * @Author makun
 * @Date 2023/6/30 16:04
 * @Version 1.0
 */
@Configuration
@MapperScan("cn.insectmk.macrozhengmall.mbg.mapper")
public class MyBatisConfig {
}