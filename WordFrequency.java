import java.util.*;
public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String words[]=str.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
        for(String ele:words){
            if(map.containsKey(ele))
            map.put(ele,map.get(ele)+1);
            else
            map.put(ele,1);
        }
        for(Map.Entry<String,Integer> ele:map.entrySet()){
            System.out.println(ele.getKey()+":"+ele.getValue());
        }
    }
}
