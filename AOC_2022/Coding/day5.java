package AOC_2022.Coding;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class day5 {
    public static void main(String[] args) {
        List<List<String>> BigList = new ArrayList<>();
        BigList.add(new ArrayList<>(List.of("H", "C", "R")));
        BigList.add(new ArrayList<>(List.of("B", "J", "H", "L", "S", "F")));
        BigList.add(new ArrayList<>(List.of("R", "M", "D", "H", "J", "T", "Q")));
        BigList.add(new ArrayList<>(List.of("S", "G", "R", "H", "Z", "B", "J")));
        BigList.add(new ArrayList<>(List.of("R", "P", "F", "Z", "T", "D", "C", "B")));
        BigList.add(new ArrayList<>(List.of("T", "H", "C", "G")));
        BigList.add(new ArrayList<>(List.of("S", "N", "V", "Z", "B", "P", "W", "L")));
        BigList.add(new ArrayList<>(List.of("R", "J", "Q", "G", "C")));
        BigList.add(new ArrayList<>(List.of("L", "D", "T", "R", "H", "P", "F", "S")));
        Stack[] BigS = new Stack[9];
        Stack<String> s1;
        for(int i = 0; i < BigS.length; i++){
            s1 = new Stack<>();
            s1.addAll(BigList.get(i));
            BigS[i] = s1;
        }
        try{
            BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Suttichok\\Desktop\\AOC\\AOC_2022\\input\\day5.txt"));
            String line;
            while((line=br.readLine())!=null){
                String[] box = line.replaceAll("[a-z]","").trim().split("\\D+");

                int num = Integer.parseInt(box[0]);
                int A = Integer.parseInt(box[1]) - 1;
                int B = Integer.parseInt(box[2]) - 1;
                /* Part 1 */
                // for(int i = 0; i < num; i++){
                //     if(BigS[A].isEmpty()){
                //         break;
                //     }
                //     BigS[B].push(BigS[A].pop());
                // }
                
                /* Part 2 */
                Stack<Object> s2 = new Stack<>();
                for(int i = 0; i < num; i++){
                    if(BigS[A].isEmpty()){
                        break;
                    }
                    s2.push(BigS[A].pop());
                }

                for(int i = 0; i < num; i++){
                    BigS[B].push(s2.pop());
                }
       
            }
            br.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

        for(int i = 0; i < BigS.length; i++){
            System.out.print(BigS[i].peek());
        }
    }
}

