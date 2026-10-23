public class leet10 {

    public int len(String s)

    {
        String[] w=s.trim().split("\\s+");
        return (w[w.length-1].length());
        
    }
    public static void main(String[] args) {
        
        
        String s="Hi i am Boy";
        leet10 ob=new leet10();
        System.out.println(ob.len(s));
        
        
}
}