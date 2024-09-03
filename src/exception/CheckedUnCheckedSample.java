package exception;

import javax.naming.InterruptedNamingException;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CheckedUnCheckedSample {
    public static void main(String[] args){
        CheckedUnCheckedSample sample = new CheckedUnCheckedSample();
//        sample.checkedException1();
//        sample.checkedException2();
//        sample.unCheckedException1();
        sample.unCheckedException4();
    }

    public void checkedException1(){
        // 1. throws IOException 난몰라 예외처리 방식
        FileInputStream is =null;
        try{
            is = new FileInputStream("src/samle.txt");
            int i = 0;
            while ((i=is.read()) != -1) {
                System.out.println((char) i);
            }
        }catch(IOException e){
            throw new RuntimeException();
        } finally {
            try {
                if(is != null)
                    is.close();
            } catch ( IOException e){
                e.printStackTrace();
            }
        }

    }

    public void checkedException2() {
        try {
            new SimpleDateFormat("yyyy-MM-dd").parse("unvalid");
        } catch (ParseException e){
            e.printStackTrace();
        }

    }

    public void unCheckedException1(int a){
        int d = a;
        int n = 10;
        int r = 0;
        if ( a != 0){
            r = n/d;
        }
        System.out.println(r);
    }

    public void unCheckedException2(){
        int[] arr= new int[20];
        arr[20] = 20;
        System.out.println(arr[20]);
    }

    public void unCheckedException3(){
        String str = "123rk";
        int ans1 = Integer.parseInt(str);
//        int ans2 = Integer.

    }

    public void unCheckedException4(){
        Animal animal = new Lion();
        Dog dog = (Dog) animal;
    }

    class Animal {}
    class Lion extends Animal{}
    class Dog extends Animal{}
}

