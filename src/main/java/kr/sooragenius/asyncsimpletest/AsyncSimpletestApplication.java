package kr.sooragenius.asyncsimpletest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableAsync
@EnableScheduling
public class AsyncSimpletestApplication implements ApplicationRunner {
//    @Autowired
//    private ASync1 aSync1;
//    @Autowired
//    private ASync2 aSync2;

    public static void main(String[] args) {
        SpringApplication.run(AsyncSimpletestApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Thread.sleep(10000);
//        aSync1.test();
//        aSync2.test();
//        for(int i = 0; i<1000000; i++)
//        System.out.println("End");
    }
}
