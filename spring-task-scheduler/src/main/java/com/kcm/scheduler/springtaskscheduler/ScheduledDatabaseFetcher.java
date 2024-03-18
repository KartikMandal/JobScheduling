package com.kcm.scheduler.springtaskscheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@Component
public class ScheduledDatabaseFetcher {

    @Autowired
    private ThreadPoolTaskScheduler taskScheduler;

    @Autowired
    private DatabaseFetchService fetchService;

    @Scheduled(fixedRate = 2000) // Fetch data every 2 seconds
    public void fetchScheduledData() {
        taskScheduler.submit(() -> {
            fetchService.fetchDataFromDatabase();
        });
    }
}
