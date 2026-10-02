public class leet4 {


    public static  String longp(String[] s1)
    {
        String res = "";

        for (int p = 0; p < s1[0].length(); p++) {

            char c = s1[0].charAt(p);

            for (int j = 1; j < s1.length; j++) {

                if (p >= s1[j].length() || s1[j].charAt(p) != c) {
                    return res;
                }
            }

            
            res = res + c;
        }

        return res;
    
    }
    public static void main(String[] args) {
        
        String s1[]={"flower","flow","flame","apple"};
         String result = longp(s1);

        System.out.println(result);
        
        
    }
    
}
