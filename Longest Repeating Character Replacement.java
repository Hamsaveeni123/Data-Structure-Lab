public class CharacterReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";

        int maxCount = 0;

        for(int i=0;i<s.length();i++) {
            int count = 1;

            for(int j=i+1;j<s.length();j++) {
                if(s.charAt(i)==s.charAt(j))
                    count++;
            }

            maxCount = Math.max(maxCount,count);
        }

        System.out.println(maxCount);
    }
}
