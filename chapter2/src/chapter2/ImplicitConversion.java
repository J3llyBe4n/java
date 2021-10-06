package chapter2;

public class ImplicitConversion {
    public static void main(String[] args){
        byte bNum= 10;
        int num = bNum;

        System.out.println(num);

        long lNum = 10;
        float fNum = lNum;

        System.out.println(fNum);

        double dNum = fNum + num;
        System.out.println(dNum);

        //적은 수에 큰수면 상관 x 형변환은 자연스럽게 이루어짐.

    }
}
