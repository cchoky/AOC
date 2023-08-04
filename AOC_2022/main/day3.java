package AOC_2022.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class day3 {
    public static void main(String[] args) {
        int sum=0;
        char c;
        ArrayList<String> list=new ArrayList<>();
        try{
            BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Suttichok\\Desktop\\AOC\\AOC_2022\\input\\day3.txt"));
            String line;
            while((line=br.readLine())!=null){
                String[] box=line.trim().split("\\s");
                // for(String i : box){
                //     c=findCommonChar(i);
                //     sum+=calcuSum(c);
                // }
                for(String i : box){
                    list.add(i);
                } 
            }
            for(int i=0;i<list.size();i+=3){
                c=findCommonChar(list.get(i), list.get(i+1), list.get(i+2));
                sum+=calcuSum(c);
            }
            System.out.println(sum);
            br.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    // static char findCommonChar(String s){
    //     String s1=s.substring(0,s.length()/2);
    //     String s2=s.substring(s.length()/2);
    //     char commonChar=' ';
    //     for(char i : s2.toCharArray()){
    //         if(s1.contains(String.valueOf(i))){
    //             commonChar=i;
    //         }
    //     }
    //     return commonChar;
    // }
    static char findCommonChar(String s1,String s2,String s3){
        ArrayList<Character> list1=new ArrayList<>();
        ArrayList<Character> list2=new ArrayList<>();
        ArrayList<Character> list3=new ArrayList<>();
        for(char i : s1.toCharArray()){
            list1.add(i);
        }
        for(char i : s2.toCharArray()){
            list2.add(i);
        }
        for(char i : s3.toCharArray()){
            list3.add(i);
        }
        list1.retainAll(list2);
        list1.retainAll(list3);
        return list1.get(list1.size()-1);
    }
    static int calcuSum(char c){
        int sum=0;
        if(c>='a' && c<='z'){
            sum=sum+(c-96);
        }
        else if(c>='A' && c<='Z'){
            sum=sum+(c-38);
        }
        return sum;
    }
}
