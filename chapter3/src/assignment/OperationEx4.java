package assignment;

public class OperationEx4 {
    public static void main(String[] args){
        int num = 11;
        System.out.println(num += 1);
        System.out.println(num %= 10);
        num -= 1;
        System.out.println(num);

        int fatherAge = 40;
        int motherAge = 35;

        char ch;
        ch = (fatherAge < motherAge) ? 'T' :'F';
        System.out.println(ch);
    }
}
