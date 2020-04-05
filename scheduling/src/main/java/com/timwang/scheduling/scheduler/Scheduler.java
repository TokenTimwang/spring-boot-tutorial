package com.timwang.scheduling.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ Author  : Tim Wang
 * @ FileName: Scheduler.java
 * @ Time    : 2020/4/5 22:40
 */

/*
 * @Scheduled批注用于在特定时间段内触发调度程序。
 * 显示了如何每天从每天的9:00 AM开始到9:59 AM结束每分钟执行任务
 * */

@Component
public class Scheduler {

    @Scheduled(cron = "0 * 9 * * ?")
    public void cronJobSch(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date now = new Date();
        String strDate = simpleDateFormat.format(now);
        System.out.println("Java cron job expression::" + strDate);
    }
}
