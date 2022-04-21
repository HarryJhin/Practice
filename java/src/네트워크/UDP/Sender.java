package 네트워크.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 송신하는 클래스
 */
public class Sender {
    public static void main(String[] args) throws IOException {
        
        DatagramSocket socket = new DatagramSocket();
        String string = "Data";
        byte[] buf = string.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 5000);
        socket.send(packet);
        socket.close();
        
    }
}
