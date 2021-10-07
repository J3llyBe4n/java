package assignment;

public class OperationEx5 {
    public static void main(String[] args){
        int num1 = 5;
        int num2 = 10;

        int result = num1 & num2;
        System.out.println(result);

        int result1 = num1 | num2;
        System.out.println(result1);

        int num3 = 5;
        System.out.println(num3 << 1);          // 만약 대입하고싶으면 <<=
        System.out.println(num3);
        System.out.println(num3 << 2);
        System.out.println(num3);
        System.out.println(num3 >> 1);         // 00000010
        System.out.println(num3);
    }
}
