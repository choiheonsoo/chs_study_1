package chs.variable;

public class CharToCode {
    public static void main(String[] args) {
        char ch = 'A';      //char ch = 65;
        int code = (int)ch;     //ch에 저장된 값을 int 타입으로 변환하여 저장함.

        System.out.printf("%c=%d(%#x)%n", ch, code, code);
    }
}
