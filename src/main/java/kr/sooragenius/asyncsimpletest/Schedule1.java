package kr.sooragenius.asyncsimpletest;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Schedule1 {
    @Scheduled(fixedDelay = 100L)
    public void hello() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Schedule1");
        try {
            Thread.sleep(100);
        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
