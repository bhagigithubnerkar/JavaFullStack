package String;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println("Capacity" + stringBuffer.capacity());
        stringBuffer.append("Welcome To");
        stringBuffer.append("The");
        System.out.println("Length:" + stringBuffer.length());
        stringBuffer.append("Java World!!");
        stringBuffer.append("Capacity" + stringBuffer.capacity());
        stringBuffer.insert(0, "**");
        stringBuffer.replace(0, 2, "");
        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }
}
