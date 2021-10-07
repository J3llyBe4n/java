package assignment;

public class OperationEx3 {
    public static void main(String[] agrs){
        int num1 = 10;
        int i = 2;

        boolean value;
        value = ( ((num1 = num1 + 10) < 10) && ((i = i +2)> 10) );      // 앞에 수식이 false이므로, 뒤에 연산은 실행되지 않음
//      value = ( ((num1 = num1 + 10) < 10) || ((i = i +2)> 10) );         왜냐면 &&는 둘다 맞아햐기 때문
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);
    }
}
