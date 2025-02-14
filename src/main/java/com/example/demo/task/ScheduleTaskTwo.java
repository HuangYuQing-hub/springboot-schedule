package com.example.demo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 13198 on 2020/1/19.
 */
@Component
public class ScheduleTaskTwo {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /**
     *   @Scheduled(fixedRate = 6000) ：上一次开始执行时间点之后6秒再执行
     *   @Scheduled(fixedDelay = 6000) ：上一次执行完毕时间点之后6秒再执行
     *    @Scheduled(initialDelay=1000, fixedRate=6000) ：第一次延迟1秒后执行，之后按 fixedRate 的规则每6秒执行一次
     */
    @Scheduled(fixedDelay = 6000)
    private void reportCurrnetTime(){
        System.out.println("Second Task To  Show CurrentTime ...."+dateFormat.format(new Date()));
    }
}
