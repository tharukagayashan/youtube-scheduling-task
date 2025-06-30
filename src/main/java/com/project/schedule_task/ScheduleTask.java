package com.project.schedule_task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ScheduleTask {

    @Scheduled(fixedRate = 5000) // 5S
    public void runEveryFiveSeconds(){
        System.out.println("Fixed Rate Task: " + new Date());
    }

    @Scheduled(fixedDelay = 6000)
    public void runWithDelay(){
        System.out.println("Run with delay : " + new Date());
    }

    @Scheduled(initialDelay = 7000, fixedRate = 10000)
    public void runWithInitialDelay(){
        System.out.println("Run with initial delay : " + new Date());
    }

    @Scheduled(cron = "0 * * * * *")
    public void testCronTask(){
        System.out.println("Current time : " + new Date());
    }

}
