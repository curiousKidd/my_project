package my.project.demo.algorithm.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

    }

    public void QueueCreate() {
        Queue<Integer> queue = new LinkedList<>(); //int형 queue 선언, linkedlist 이용
        Queue<String> queue2 = new LinkedList<>(); //String형 queue 선언, linkedlist 이용
    }

    public void QueueAdd() {
        Queue<Integer> queue = new LinkedList<>(); //int형 queue 선언
        // exception 발생
        queue.add(1);     // queue에 값 1 추가
        queue.add(2);     // queue에 값 2 추가

        // 값 리턴 _ boolean
        queue.offer(3);   // queue에 값 3 추가
    }

    public void QueueDelete() {
        Queue<Integer> queue = new LinkedList<>(); //int형 queue 선언
        queue.offer(1);     // queue에 값 1 추가
        queue.offer(2);     // queue에 값 2 추가
        queue.offer(3);     // queue에 값 3 추가

        queue.poll();       // queue에 첫번째 값을 반환하고 제거 비어있다면 null
        queue.remove();     // queue에 첫번째 값 제거
        queue.clear();      // queue 초기화
    }

    public void QueueFirstOut() {
        Queue<Integer> queue = new LinkedList<>(); //int형 queue 선언
        queue.offer(1);     // queue에 값 1 추가
        queue.offer(2);     // queue에 값 2 추가
        queue.offer(3);     // queue에 값 3 추가

        // 값 리턴하지만 삭제되진 않음
        queue.peek();       // queue의 첫번째 값 참조
    }

}
