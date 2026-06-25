import java.util.HashSet;

public class HappyNumber {

    static int square(int n){
        int sum=0;

        while(n>0){
            int d=n%10;
            sum+=d*d;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args){

        int n=19;

        HashSet<Integer> set=new HashSet<>();

        while(n!=1 && !set.contains(n)){
            set.add(n);
            n=square(n);
        }

        System.out.println(n==1?"Happy Number":"Not Happy");
    }
}
