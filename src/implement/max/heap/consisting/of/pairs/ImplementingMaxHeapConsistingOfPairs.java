package implement.max.heap.consisting.of.pairs;

import java.util.PriorityQueue;
import java.util.Queue;

public class ImplementingMaxHeapConsistingOfPairs {

    public void solution() {
        Queue<Pair> maxHeap = new PriorityQueue<>((a, b) -> {
            int diff = b.distance - a.distance;
            if (diff == 0) {
                diff = a.node - b.node;
            }
            return diff;
        });
        maxHeap.offer(new Pair(4, 1));
        maxHeap.offer(new Pair(7, 2));
        maxHeap.offer(new Pair(1, 3));
        maxHeap.offer(new Pair(4, 4));
        maxHeap.offer(new Pair(3, 5));
        while (!maxHeap.isEmpty()) {
            Pair element = maxHeap.poll();
            System.out.println(element.node + " -> " + element.distance);
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