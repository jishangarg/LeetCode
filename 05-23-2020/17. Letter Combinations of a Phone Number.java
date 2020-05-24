class Solution {
    public List<String> letterCombinations(String digits) {
        
        Map<Character,String> map=new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        
        if(digits.length()==0)
            return new ArrayList<String>();
        
        return patterns(digits.charAt(0),digits.substring(1),map);
         
        
    }
    
    public List<String> patterns(char c, String s, Map<Character,String> map)
    {
        if(s.equals(""))
        {
            List<String> temp_al= new ArrayList<String>();
            String c_alph=map.get(c);
            for(char element: c_alph.toCharArray())
            {
                temp_al.add(String.valueOf(element));
            }
            
            // temp_al.add("");
            return temp_al;
        }
        
        List<String> al=new ArrayList<>();
        al=patterns(s.charAt(0),s.substring(1),map);
        
        String c_alph=map.get(c);
        List<String> al2=new ArrayList<>();
        for(char element: c_alph.toCharArray())
        {
            for(String element_st: al)
            {
                al2.add(element+element_st);
            }
        }
        
        return al2;
        
        
    }
}