class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int num : arr)
        {
            m.put(num,m.getOrDefault(num,0)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int freq : m.values())
        {
            if(set.contains(freq)) return false;

            set.add(freq);
        }
        return true;
    }
}