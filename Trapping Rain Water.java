public class TrappingRainWater {
    public static void main(String[] args) {

        int[] h={4,2,0,3,2,5};

        int water=0;

        for(int i=1;i<h.length-1;i++){

            int left=h[i];
            for(int j=0;j<i;j++)
                left=Math.max(left,h[j]);

            int right=h[i];
            for(int j=i+1;j<h.length;j++)
                right=Math.max(right,h[j]);

            water += Math.min(left,right)-h[i];
        }

        System.out.println("Water Trapped = "+water);
    }
}
