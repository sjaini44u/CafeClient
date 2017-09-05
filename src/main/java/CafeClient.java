import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;
import org.eclipse.jetty.websocket.client.WebSocketClient;

import java.net.URI;
import java.util.concurrent.Future;

public class CafeClient {

    public static void main(String[] args) {
        try {
            URI uri = new URI("ws://localhost:4567/cafe/");
            WebSocketClient webSocketClient = new WebSocketClient();
            webSocketClient.start();
            CafeClientSocket cafeClientSocket = new CafeClientSocket();
            Future fut = webSocketClient.connect(cafeClientSocket, uri);
            Session session = (Session)fut.get();
            Thread.sleep(100000);
        } catch (Exception e) {

        }
    }
}
