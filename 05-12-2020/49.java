class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         
        Map<String,List>map=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            String s=strs[i];
            int[] count=new int[27];
            
            for(char c: s.toCharArray())
            {
                count[c-'a'+1]++;
            }
            
            StringBuilder sb=new StringBuilder("");
            for(int j=1;j<=26;j++)
            {
                sb.append("#");
                sb.append(count[j]);
            }
            
            String key=sb.toString();
            
            if(!map.containsKey(key))
            {
                map.put(key,new ArrayList());
                map.get(key).add(s);
            }
            else
            {
                map.get(key).add(s);
            }
            
            
        }
        return new ArrayList(map.values());
    }
}