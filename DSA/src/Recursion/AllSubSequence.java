package Recursion;

import java.util.ArrayList;
import java.util.List;

public class AllSubSequence {

    //include and exclude pattern
    static void getAllSequence(String s, int index, StringBuilder output,List<String> ans){
        if (index>=s.length()){
            String subSequence=output.toString();
            ans.add(subSequence);
            return;
        }
        char ch=s.charAt(index);
        output.append(ch);
        getAllSequence(s,index+1, output, ans);

        output.deleteCharAt(output.length()-1);
        getAllSequence(s,index+1, output, ans);
    }
    static void main() {
        String s="abc";
        List<String> ans =new ArrayList<>();
        StringBuilder output= new StringBuilder();
        int index=0;
        getAllSequence(s,index,output,ans);
        System.out.println(ans);
    }
}
