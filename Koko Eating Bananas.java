public class KokoEatingBananas {
    public static void main(String[] args) {

        int[] piles = {3,6,7,11};

        int max = piles[0];

        for(int i=1;i<piles.length;i++){
            if(piles[i]>max)
                max=piles[i];
        }

        System.out.println("Minimum Speed = " + max);
    }
}
