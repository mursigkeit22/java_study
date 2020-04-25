package classwork;

public class BufferStringUse {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("kisik");
        sb.append("murysik");
        sb.delete(5, 12);
        sb.insert(sb.length(), " is the best");
        System.out.println(sb);
    }
}
