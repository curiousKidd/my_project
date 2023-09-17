package my.project.demo;

import org.springframework.stereotype.Component;

@Component
public class TestScheduler {

    //    @Scheduled(fixedDelay = 1000)  // 1초마다 수행
    public void test1() throws InterruptedException {
        Thread.sleep(5000); // 5초의 작업 시간으로 가정
        System.out.println("scheduling1 with : " + Thread.currentThread().getName());
    }

    //    @Scheduled(fixedDelay = 1000)  // 1초마다 수행
    public void test2() {
        System.out.println("scheduling2 with : " + Thread.currentThread().getName());
    }

}
