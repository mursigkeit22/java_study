package lera.shel.chat.network;

public interface TCPConnectionListener {

    void onConnectionReady(TCPConnection TCPConnection);
    void onReceiveString(TCPConnection TCPConnection, String value );
    void onDisconnect(TCPConnection TCPConnection);
    void onException(TCPConnection TCPConnection, Exception e);


}
