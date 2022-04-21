package 네트워크;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 미국 시각(NIST)를 알려주는 서버에 소켓을 사용해 접속하는 클래스
 */
public class SocketTest {
    public static void main(String[] args) {
        try (Socket socket = new Socket("time.nist.gov", 13)) {
            InputStream stream = socket.getInputStream();
            Scanner scanner = new Scanner(stream);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();
        } catch (IOException e) {
            System.out.println("Unable to connect");
        }
    }
}
