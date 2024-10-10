
/* 이상한 문자 만들기 */
package practice4n;

public class Practice41 {
    public String solution(String s) {
        String answer = "";
        String[] a = s.split("");
        int i = 0;

        for(String b : a){
            if(b.contains(" ")){
                i=0;
            } else {
                i++;
            }
            if (i%2==0){
                answer += b.toLowerCase();
            } else {
                answer += b.toUpperCase();
            }
        }
        return answer;
    }
}
