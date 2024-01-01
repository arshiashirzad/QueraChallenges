public class RepeatInString {
    public static int StringInString(String one, String two) {
        int replicationCount = 0;
        if( one ==null || two==null){
           return replicationCount;
        }
        if (one.isEmpty() || two.isEmpty()){
            return replicationCount ;
        }
            int index = one.indexOf(two);
            while (index != -1) {
                replicationCount++;
                index = one.indexOf(two, index + 1);
            }
        return replicationCount;
    }
}

// the challenge was to complete a piece of code to search in first string and tell us that how many times the second string is
//replicated in the first string entered || also we have to check for null and empty values entered as arguments to our method
