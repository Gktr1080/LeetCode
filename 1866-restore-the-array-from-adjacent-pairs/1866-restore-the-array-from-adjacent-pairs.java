class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {

        int[] ret = new int[adjacentPairs.length + 1];
        Set<Integer> vis = new HashSet<>();
        List<Integer> lst = new ArrayList<>();
         
        // Storing the adjacent Element accoriding to the given pairs.
        Map<Integer , Set<Integer>> map = new HashMap<>();
        for(int [] adj: adjacentPairs){
            int u = adj[0];
            int v = adj[1];

            map.putIfAbsent(u , new HashSet<>());
            map.putIfAbsent(v , new HashSet<>());

            map.get(u).add(v);
            map.get(v).add(u);
        } 
        
        int start = Integer.MIN_VALUE;

        // finding the start of the array.. as it only appears once.
        for(Map.Entry<Integer , Set<Integer>> entry: map.entrySet()){
            if(entry.getValue().size() == 1 && start == Integer.MIN_VALUE){
                start = entry.getKey();
                break;
            }  
        }
        int i = 0;
        lst.add(start); 
        vis.add(start);

        // filling the array and marking all the elements which we have already seen.
        while(i < ret.length){
            
            for(int j : map.get(lst.get(i))){
                if(vis.contains(j)) continue;
                else {
                    lst.add(j);
                    vis.add(j);
                }
            }
            i++;
        }

        int k = 0;
        for(int el: lst){
            ret[k++] = el;
        }

        return ret;

       
    }
}