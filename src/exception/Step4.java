package exception;

public class Step4 {
    public static void main(String[] args){

        int index = 4;
        Step4 step4 = new Step4();

        try{
            System.out.println("결과 : "+step4.getElement(index));
        } catch (CustomException e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }

    public int getElement(int index){
        int[] list={1,2,3};
        int element = 0;
//        if (index >= list.length){
//        } else{
//        }
        try{
            element = list[index];

        } catch (ArrayIndexOutOfBoundsException e){
           throw new CustomException("인덱스가 배열의 길이를 초과하였습니다.", e.getCause());
        }


        return element;
    }
}


class CustomException extends RuntimeException{
    CustomException(String message, Throwable cause) {
        super(message, cause);

    }
}
