class Duo implements Comparable<Duo>
{
    int ele;
    int freq;
    Duo(int ele, int freq)
    {
        this.ele = ele;
        this.freq = freq;
    }
    public int compareTo(Duo d)
    {
        if(this.freq==d.freq) return this.ele - d.freq;
        return this.freq - d.freq;
    }

}
class Solution{
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele:nums)
        {
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        PriorityQueue<Duo> pq = new PriorityQueue<>();
        for(int ele : map.keySet())
        {
            int freq = map.get(ele);   // is key ki value return hog
            pq.add(new Duo(ele,freq));
            if(pq.size()>k) pq.remove();
        }
        int[] arr = new int[k];
        int i=0;
        while(pq.size()>0)
        {
            Duo top = pq.remove();
            arr[i++] = top.ele;
        }
        return arr;
    }
}


// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {
//         // PriorityQueue<Integer> pq = new PriorityQueue<>();
//         // for(int i=0;i<nums.length;i++)
//         // {
//         //     pq.add(nums[i]);
//         // }
//         // ArrayList<Integer> arr = new ArrayList<>();
//         // while(pq.size()>0)
//         // {
//         //     if(!arr.contains(pq.peek())) arr.add(pq.remove());
//         //     else pq.remove();
//         // }
//         // int[] ans = new int[k];
//         // for(int i=0;i<k;i++)
//         // {
//         //     ans[i] = arr.get(i);
//         // }
//         // return ans;
//     }
// }