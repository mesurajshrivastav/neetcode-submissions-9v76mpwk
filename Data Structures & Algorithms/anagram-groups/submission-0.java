class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mapCount = new HashMap<>();


        for(String str : strs){
         int [] arr = new int[26];
            for(char s : str.toCharArray()){
                int count = 0;
                count = s-'a';
                arr[count]++;
            }
            String key = Arrays.toString(arr);

            mapCount.putIfAbsent(key, new ArrayList<>());
            mapCount.get(key).add(str);
        }

        return new ArrayList<>(mapCount.values());


    }
}
