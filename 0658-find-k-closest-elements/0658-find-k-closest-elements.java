class Pair implements Comparable<Pair>{
    int diff;
    int num;
    Pair(int diff, int num)
    {
        this.diff = diff;
        this.num = num;
    }
    public int compareTo(Pair p)
    {
        if(this.diff == p.diff) return this.num - p.num;
        return this.diff - p.diff;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr)
        {
            int num = ele;
            int diff = Math.abs(x-ele);
            pq.add(new Pair(diff,num));
            if(pq.size()>k) pq.remove();
        }
        while(pq.size()>0)
        {
            Pair top = pq.remove();
            ans.add(top.num);
        }
        Collections.sort(ans);
        return ans;
    }
}