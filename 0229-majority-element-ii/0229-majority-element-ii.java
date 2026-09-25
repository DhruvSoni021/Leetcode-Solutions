class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int num : nums)
        {
            m.put(num,m.getOrDefault(num,0)+1);
        }
        
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getValue() > nums.length / 3) {
                arr.add(entry.getKey());
            }
        }
        return arr;
    }
}