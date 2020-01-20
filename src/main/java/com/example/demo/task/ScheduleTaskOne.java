package com.example.demo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by 13198 on 2020/1/19.
 */
@Component
public class ScheduleTaskOne {

    private int count = 0;

    /**
     *  注解 属性 cron
     *      每隔 6 秒 打印下一内容
     *
     *      (注意   星号 之间的空格)
     */
    @Scheduled(cron = "*/6 * * * * ?")
    private void process(){
        System.out.println("This is the first Scheduler task Running......."+(count++));
    }
}
