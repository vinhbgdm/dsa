package dfs;

import java.util.*;

public class BFSWithQueue {
    public static void main(String[] args) {
        int[][] graph = {
                {0, 1, 0, 0, 0, 0, 0},
                {1, 0, 1, 1, 1, 0, 0},
                {0, 1, 0, 0, 0, 1, 0},
                {0, 1, 0, 0, 0, 1, 1},
                {0, 1, 0, 0, 0, 0, 1},
                {0, 0, 1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1, 0, 0}
        };

        // Khai bao
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> daDuyet = new HashSet<>();

        // Khoi tao
        queue.add(0);
        daDuyet.add(0);

        // Duyet theo queue
        while (!queue.isEmpty()) {
            int u = queue.remove();
            // process u
            System.out.print(u + " ");
            // Add tất cả các đỉnh kề v với u mà chưa được duyệt vào queue.

            for (int v = 0; v < graph.length; v++) {
                if(graph[u][v] == 1 && !daDuyet.contains(v)){
                    queue.add(v);
                    // Đánh dấu đã duyệt
                    daDuyet.add(v);
                }
            }
        }
    }
}
