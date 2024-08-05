package practice;

public class practice12 {
    public double solution (int[] arr){
        double answer=0;
        int i=0;
        for (i=0; i<arr.length; i++){
            answer+=arr[i];
        }
        answer = (double)answer/arr.length;
        return answer;
    }
}
