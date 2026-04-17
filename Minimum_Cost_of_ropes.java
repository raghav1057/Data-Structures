
import java.util.PriorityQueue;

public class Minimum_Cost_of_ropes{
    public static int minCost(int[] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : arr){
            pq.offer(num);
        }
        int cost = 0;
        while(pq.size() > 1){
            int first_el = pq.poll();
            int second_el = pq.poll();
            int combined_rope = first_el + second_el;
            cost = cost + combined_rope;
            pq.offer(combined_rope);
        }
        return cost;
    }
}