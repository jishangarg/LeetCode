class Solution {
    public String minWindow(String s, String t) {
        
        Map<Character,Integer> m_r=new HashMap<>();
        Map<Character,Integer> m=new HashMap<>();
        int st=0,e=0;
        int count=0;
        int min_l=s.length()+1;
        int min_st=0;
        int min_e=0;
        
        for(int i=0;i<t.length();i++)
        {
            if(m_r.containsKey(t.charAt(i)))
            {
                m_r.put(t.charAt(i),m_r.get(t.charAt(i))+1);
            }
            else
                m_r.put(t.charAt(i),1);
        }
        
        while(st<=e && e<=s.length())
        {
            // System.out.println(s.substring(st,e));
            if(count<m_r.size())
            {
                if(e==s.length())
                {
                    // System.out.println("hk"+);
                    break;
                }
                if(m_r.containsKey(s.charAt(e)))
                {
                    if(m.containsKey(s.charAt(e)))
                    {
                        // System.out.println("rr");
                        m.put(s.charAt(e),m.get(s.charAt(e))+1);
                    }
                    else
                        m.put(s.charAt(e),1);
                    
                    // if(m_r.get(s.charAt(e))-m.get(s.charAt(e))==0)
                    // System.out.println(m_r.get(s.charAt(e))+" "+m.get(s.charAt(e)));
                    if((int)m_r.get(s.charAt(e))==(int)m.get(s.charAt(e)))
                    {
                        System.out.println(m_r.get(s.charAt(e))+" "+m.get(s.charAt(e)));
                        count++;
                        
                    }
                }
                e++;
            }
            else
            {
                // System.out.println("rr");
                if(m_r.containsKey(s.charAt(st)))
                {
                    m.put(s.charAt(st),m.get(s.charAt(st))-1);
                    if(m_r.get(s.charAt(st))>m.get(s.charAt(st)))
                    {
                        count--;
                    }
                }
                if(e-st<min_l)
                {
                    min_st=st;
                    min_e=e;
                    min_l=e-st+1;
                }
                st++;
            }
            // System.out.println(min_l);
        }
        // System.out.println(m_r.get('b')+" "+m.get('b'));
        // for(int c=0;c<26;c++)
        // {
            // char a=(char)(c+'a');
            // System.out.println(a);
            // System.out.println(m_r.get(a)+" "+m.get(a));
        // }
        return s.substring(min_st,min_e);
        
    }
}