package my.project.demo.algorithm.queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueTest {

    /**
     * 일반적인 큐(Queue)는 먼저 집어넣은 데이터가 먼저 나오는 FIFO (First In First Out) 구조로 저장하는 선형 자료구조입니다.
     * 하지만 우선순위 큐(Priority Queue)는 들어간 순서에 상관없이 우선순위가 높은 데이터가 먼저 나오는 것을 말합니다.
     */

    public void priorityQueueCreate() {

        // 오름차순으로 값이 정렬되어 poll - 가장 낮은값을 반환한다
        PriorityQueue<Object> pq1 = new PriorityQueue<>();

        // 내림차순으로 값이 정렬되어 poll - 가장 높은값을 반환한다
        PriorityQueue<Object> pq2 = new PriorityQueue<>(Collections.reverseOrder());

    }

}
