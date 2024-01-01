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