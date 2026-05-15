class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character,Integer> countS = new HashMap<>();
        Map<Character,Integer> countT = new HashMap<>();

        for(char val : s.toCharArray()){
            countS.put(val, countS.getOrDefault(val,0)+1);
        }
        for(char val : t.toCharArray()){
            countT.put(val, countT.getOrDefault(val,0)+1);
        }

        return countS.equals(countT);


    }
}
