package my.project.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class FutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<CompletableFuture> futures = new ArrayList<>();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 20; i++) {
            int finalI = i;
            futures.add(
                    CompletableFuture.supplyAsync(() -> {
                        try {
                            Thread.sleep(1000);
                            System.out.println("Future 실행중" + finalI);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        return "Thread: " + Thread.currentThread().getName();
                    })
            );
        }
        for (int j = 0; j < 20; j++) {
            System.out.println(futures.get(j).get());
            System.out.println("Thread: " + Thread.currentThread().getName());
        }

        //        System.out.println(futures.get(19));

        System.out.println("여기는 위에가 무조건 다 끝나고 실행");
        long endTime = System.currentTimeMillis();

        Thread.sleep(5000);
        long lTime = endTime - startTime;
        System.out.println("TIME : " + lTime + "(ms)");
    }
}

// 1. 동기와 비동기의 속도 실행 시간 차이
// 2. futures.get().get() 차이
