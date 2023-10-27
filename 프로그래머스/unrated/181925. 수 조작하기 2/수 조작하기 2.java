class Solution {
    public static String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < numLog.length - 1; i++) {
            switch(numLog[i+1] - numLog[i]) {
                case 1:
                    answer.append("w");
                    break;
                case -1:
                    answer.append("s");
                    break;
                case 10:
                    answer.append("d");
                    break;
                case -10:
                    answer.append("a");
                    break;
            }
        }

        return answer.toString();
    }
}
