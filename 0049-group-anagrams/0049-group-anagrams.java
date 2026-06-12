class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

          HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            char[] arr = s.toCharArray();

            // Bubble Sort
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        char temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            String key = new String(arr);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());

        // HashMap<String,ArrayList<String>> map = new HashMap<>();

        // for(String s:strs)
        // {
        //     int[] freq = new int[26];
        //     for(int i=0;i<s.length();i++)
        //     {
        //         freq[s.charAt(i)-'a']++;
        //     }

        //     String key = "";
        //     for(int i=0;i<26;i++)
        //     {
        //         key += "*"+freq[i];
        //     }
        //     if(!map.containsKey(key))
        //     {
        //         map.put(key,new ArrayList<>());
        //     }
        //     map.get(key).add(s);
        // }
        // return new ArrayList<>(map.values());
    }
}