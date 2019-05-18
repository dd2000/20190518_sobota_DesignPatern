package pl.sdacademy.designpatterns.singleton_cw1_2_sl_15_16;
import java.util.List;

public class AppConnections {
    private List<String> connectedUsers;
    private int currentConnectionsNum;

    public List<String> getConnectedUsers(){
        return connectedUsers;
    }


}
