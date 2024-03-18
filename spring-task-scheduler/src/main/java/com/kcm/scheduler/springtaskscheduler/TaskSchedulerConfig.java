package com.kcm.scheduler.springtaskscheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@Configuration
@EnableScheduling
public class TaskSchedulerConfig {

    @Bean
    public ThreadPoolTaskScheduler taskScheduler() {
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setPoolSize(5); // Set the number of threads in the pool
        scheduler.setThreadNamePrefix("DatabaseFetcher-");
        scheduler.setAwaitTerminationSeconds(60); // Set the await termination time for tasks
        scheduler.setWaitForTasksToCompleteOnShutdown(true); // Wait for tasks to complete on shutdown
        return scheduler;
    }
}
