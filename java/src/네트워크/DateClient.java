package 네트워크;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * 날짜 서버에서 날짜 정보를 얻는 클라이언트 클래스
 */
public class DateClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 999);
            BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
            );
            String resolution = bufferedReader.readLine();
            System.out.println(resolution);
            socket.close();
            System.exit(0);
        } catch (Exception e) {}
    }
}
