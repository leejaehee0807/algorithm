package practice;

public class practice01 {
    public static int practice01(int num1, int num2){
        int answer = 0;
        if (-50000 <= num1 && num1 <= 50000){
            if (-50000<= num2 && num2 <= 50000){
                answer = num1-num2;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int result =practice01(10,5);
        System.out.println("result"+result);
    }
}
