package AOC_2022.Coding;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class day2 {
    public static void main(String[] args) {
        int totalScore=0;
        try{
            BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Suttichok\\Desktop\\AOC\\AOC_2022\\input\\day2.txt"));
            String line;
            while((line=br.readLine())!=null){
                String[] box=line.trim().split("\\s");
                for(int i=0;i<box.length;i+=2){
                    
                    if(box[i].equals("A") && box[i+1].equals("X")) totalScore+=3;
                    else if(box[i].equals("A") && box[i+1].equals("Y")) totalScore+=4;
                    else if(box[i].equals("A") && box[i+1].equals("Z")) totalScore+=8;
                    
                    else if(box[i].equals("B") && box[i+1].equals("X")) totalScore+=1;
                    else if(box[i].equals("B") && box[i+1].equals("Y")) totalScore+=5;
                    if(box[i].equals("B") && box[i+1].equals("Z")) totalScore+=9;
                    
                    else if(box[i].equals("C") && box[i+1].equals("X")) totalScore+=2;
                    else if(box[i].equals("C") && box[i+1].equals("Y")) totalScore+=6;
                    else if(box[i].equals("C")&& box[i+1].equals("Z")) totalScore+=7;
                }
            }
            System.out.println(totalScore);
            br.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
