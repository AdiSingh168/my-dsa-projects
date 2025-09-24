package implement.min.heap.consisting.of.pairs;

import java.util.PriorityQueue;
import java.util.Queue;

public class ImplementingMinHeapConsistingOfPairs {

    public void solution() {
        Queue<Pair> minHeap = new PriorityQueue<>((a, b) -> {
            int diff = a.distance - b.distance;
            if (diff == 0) {
                diff = a.node - b.node;
            }
            return diff;
        });
        minHeap.offer(new Pair(4, 1));
        minHeap.offer(new Pair(2, 3));
        minHeap.offer(new Pair(4, 6));
        minHeap.offer(new Pair(7, 9));
        while (!minHeap.isEmpty()) {
            Pair element = minHeap.poll();
            System.out.println(element.node + "->" + element.distance);
        }
    }

}

class Pair {
    int distance, node;

    Pair() {
    }

    Pair(int _distance, int _node) {
        this.distance = _distance;
        this.node = _node;
    }
}