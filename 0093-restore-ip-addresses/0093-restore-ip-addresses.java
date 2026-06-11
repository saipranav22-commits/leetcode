class Solution {
    private static boolean isValid(String part) 
    {
        if (part.length() > 1 && part.charAt(0) == '0')
        {
            return false;
        }
        
        int num = Integer.parseInt(part);
        
        return num >= 0 && num <= 255;
    }
    
    public List<String> restoreIpAddresses(String s) {

        
        s = s.trim();
        
        ArrayList<String> ans = new ArrayList<>();
        
        int n = s.length();

        for (int i = 1; i <= 3; i++) 
        {
            for (int j = i + 1; j <= i + 3; j++) 
            {
                for (int k = j + 1; k <= j + 3; k++) 
                {

                    if (k >= n)
                    {
                        continue;
                    }
                    String a = s.substring(0, i);
                    String b = s.substring(i, j);
                    String c = s.substring(j, k);
                    String d = s.substring(k);

                    if (a.length() > 3 || b.length() > 3 || c.length() > 3 || d.length() > 3)
                    {
                        continue;
                    }

                    if (isValid(a) && isValid(b) && isValid(c) && isValid(d)) 
                    {
                        ans.add(a + "." + b + "." + c + "." + d);    
                    }
                }
            }
        }

        return ans;

    }
}