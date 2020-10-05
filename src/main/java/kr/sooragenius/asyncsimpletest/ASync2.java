package kr.sooragenius.asyncsimpletest;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ASync2 {
    @Async
    public void test() {
        for(int i = 0; i<1000000; i++)
        System.out.println("Async2");
    }
}
