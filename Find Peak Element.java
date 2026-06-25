public class FindPeakElement {
    public static void main(String[] args) {

        int[] arr = {1,2,3,1};

        int peak = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>peak)
                peak=arr[i];
        }

        System.out.println("Peak = "+peak);
    }
}
