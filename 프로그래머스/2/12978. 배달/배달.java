import java.util.*;
class Solution {
    public int solution(int N, int[][] road, int K) {
        DijsktraLecture dijsktraLecture = new DijsktraLecture(N);
        dijsktraLecture.findPath(road);

        int count = 0;
        for (int cost : dijsktraLecture.costs) {
            if (cost <= K) {
                count++;
            }

        }

        return count;
    }

    public class DijsktraLecture {
        private final int INF = 500001;
        boolean[] visited;
        int[] costs;
        int[] path;

        public DijsktraLecture(int nodeCount) {
            visited = new boolean[nodeCount];
            costs = new int[nodeCount];
            path = new int[nodeCount];

            Arrays.fill(visited, false);
            Arrays.fill(costs, 500001);
            Arrays.fill(path, -1);
        }

        public int findMinIndex() {
            int min = INF;
            int minIndex = -1;

            for (int j = 0; j < costs.length; j++) {
                if (!visited[j] && costs[j] < min) {
                    min = costs[j];
                    minIndex = j;
                }
            }

            return minIndex;
        }

        public void findPath(int[][] road) {
            int start = 0;
            costs[start] = 0;

            for (int i = 0; i < visited.length - 1; i++) {
                int minIndex = findMinIndex();

                visited[minIndex] = true;

                for (int[] edge : road) {
                    int from = 0;
                    int to = 0;
                    int cost = 0;

                    if (edge[0]-1 == minIndex) {
                        from = edge[0] -1 ;
                        to = edge[1] - 1;
                        cost = edge[2];
                    } else if (edge[1] - 1 == minIndex) {
                        from = edge[1] -1 ;
                        to = edge[0] -1 ;
                        cost = edge[2];
                    }

                    if (!visited[to] && from == minIndex && costs[from] + cost < costs[to]) {
                        costs[to] = costs[from] + cost;
                        path[to] = from;
                    }
                }
            }

        }
    }


}