package com.easypan;

import com.easypan.component.RedisComponent;
import com.easypan.exception.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Component("initRun")
public class InitRun implements ApplicationRunner {

    private static final Logger logger = LoggerFactory.getLogger(InitRun.class);

    @Resource
    private DataSource dataSource;

    @Resource
    private RedisComponent redisComponent;

    @Override
    public void run(ApplicationArguments args) {
        try {
            dataSource.getConnection();
            redisComponent.getSysSettingsDto();
            logger.error("Service started successfully");
        } catch (Exception e) {
            logger.error("Failed to set up database or Redis, please check the configuration");
            throw new BusinessException("Service startup failed.");
        }
    }
}
