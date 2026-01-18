package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        Integer i1 = Integer.valueOf(str);
        System.out.println("integer1 = " + i1);

        int i2 = i1.intValue();
        System.out.println("intValue = " + i2);

        Integer i3 = Integer.valueOf(i2);
        System.out.println("integer2 = " + i3);
    }
}
