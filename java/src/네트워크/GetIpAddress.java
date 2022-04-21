package 네트워크;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 호스트 이름을 IP 주소로 출력하는 클래스
 */
public class GetIpAddress {
    public static void main(String[] args) {

        String host = "google.com";

        try {
            InetAddress address = InetAddress.getByName(host);
            System.out.println(address.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println(host + " not found");
        }

    }
}
