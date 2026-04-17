class Solution {
    public String frequencySort(String s) {
        //frequency map
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        //map based on frequqncy
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());

        //build result
        StringBuilder result = new StringBuilder();
        while(!pq.isEmpty()){
            char c = pq.poll();
            int freq = map.get(c);

            while(freq-- >0){
                result.append(c);
            }
        }  
        return result.toString();
    }
}