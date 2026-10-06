import java.util.*;
public class leet5 {


    public boolean isval(String s)
    {
        Stack<Character> myStack=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {

        
        char c=s.charAt(i);
        if(c=='(' || c=='{' || c=='[')
        {
            myStack.push(c);


        }
        else{
        
        if(myStack.isEmpty())
        {
            return  false;
        }

        char top=myStack.peek();
        if(c==')' && top!='(')
        {
            return  false;
        }
        if(c=='}' && top!='{')
        {
            return false;
        }
        if(c==']' && top!='[')
        {
            return  false;
        }
        myStack.pop();
        }
    }
        return myStack.isEmpty();
    }
    public static void main(String[] args) {
        
        leet5 ob=new leet5();

        System.out.println(ob.isval("({])"));
        

    }
}
