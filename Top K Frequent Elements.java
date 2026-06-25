import java.util.HashMap;

public class TopKFrequent {
    public static void main(String[] args){

        int[] arr={1,1,1,2,2,3};

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int n:arr)
            map.put(n,map.getOrDefault(n,0)+1);

        for(int key:map.keySet())
            System.out.println(key+" -> "+map.get(key));
    }
}
