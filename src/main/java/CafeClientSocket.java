import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.WebSocketAdapter;

public class CafeClientSocket extends WebSocketAdapter {

    @Override
    public void onWebSocketConnect(Session session){
                      System.out.print("Session connected");
    }

    @Override
    public void onWebSocketClose(int statusCode, String reason){

    }

    @Override
    public void onWebSocketError(Throwable cause) {
    }


    @Override
    public void onWebSocketText(String message) {
        try {

        } catch (Exception e) {
            System.out.print("Exception occured " + e.getLocalizedMessage());
        }
    }
}
