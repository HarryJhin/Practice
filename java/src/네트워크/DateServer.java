package 네트워크;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * 날짜 서버 클래스
 */
public class DateServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(999);
        try {
            while (true) {
                Socket socket = serverSocket.accept();
                try {
                    PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
                    printWriter.println(new Date().toString());
                } finally {
                    socket.close();
                }
            }
        } finally {
            serverSocket.close();
        }
    }
}
