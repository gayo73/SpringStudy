package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruit = "apple,banana,mango";

        String parts[] = fruit.split(",");
        for(String part : parts) {
            System.out.println(part);
        }

        String joinedStrings = String.join("->", parts);
        System.out.println("joinedString = " + joinedStrings);
    }
}
