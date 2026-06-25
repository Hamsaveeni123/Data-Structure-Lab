import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};

        Arrays.sort(arr);

        for(int i=0;i<arr.length-2;i++){
            int l=i+1,r=arr.length-1;

            while(l<r){
                int sum=arr[i]+arr[l]+arr[r];

                if(sum==0){
                    System.out.println(arr[i]+" "+arr[l]+" "+arr[r]);
                    l++;
                    r--;
                }
                else if(sum<0)
                    l++;
                else
                    r--;
            }
        }
    }
}
