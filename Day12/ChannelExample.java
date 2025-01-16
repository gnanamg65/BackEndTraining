package Day12;
import java.nio.CharBuffer;

public class ChannelExample {

    public static void main(String[] args) {
        CharBuffer buffer = CharBuffer.allocate(8);
        String text = "apples";
        System.out.println("Input text: " + text);
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            buffer.put(c);
        }
        int buffPos = buffer.position();
        System.out.println("Position after data is written into buffer: " + buffPos);
        buffer.flip();
        buffPos = buffer.position();
        System.out.println("Position after flipping the buffer: " + buffPos);
        System.out.println("Reading buffer contents:");
        while (buffer.hasRemaining()) {
            System.out.print(buffer.get());
        }
    }
}
