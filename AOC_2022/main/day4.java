package AOC_2022.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class day4 {
    public static void main(String[] args) {
        int count=0;
        int no_overlap=0;
        int n1=0 ,n2=0 ,n3=0 ,n4=0;
        try{
            BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Suttichok\\Desktop\\AOC\\AOC_2022\\input\\day4.txt"));
            String line;
            while((line=br.readLine())!=null){
                String[] box=line.trim().split("[,-]");
                n1=Integer.parseInt(box[0]);
                n2=Integer.parseInt(box[1]);
                n3=Integer.parseInt(box[2]);
                n4=Integer.parseInt(box[3]);
                
                // if(n1<=n3 && n2>=n4) count++;
                // else if(n1>=n3 && n2>=n4) count++;
                
                if(n2<n3 && n2<n4) no_overlap++;
                else if(n1>n4 && n2>n4) no_overlap++;
                              
            }
            System.out.println(1000-no_overlap);
            // System.out.println(count);
            br.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
