package AOC_2022.Coding;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class day1{
    public static void main(String[] args) {
        int calorie=0;
        int max=0;
        ArrayList<Integer> list=new ArrayList<>();
        try{
            BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Suttichok\\Desktop\\AOC\\AOC_2022\\input\\day1.txt"));
            String line;
            while((line=br.readLine()) != null){
                String[] box=line.trim().split("\n");
                for(String i : box){
                    if(!(i.isEmpty())){
                        calorie+=Integer.parseInt(i);
                    }
                    else{
                        if(calorie > max){
                            max=calorie;
                        }
                        list.add(calorie);
                        calorie=0;
                    }
                }                
            }
            Collections.sort(list);
            int top3=list.get(list.size()-1)+list.get(list.size()-2)+list.get(list.size()-3);
            System.out.println(max);
            System.out.println(top3);
            br.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
    }
}