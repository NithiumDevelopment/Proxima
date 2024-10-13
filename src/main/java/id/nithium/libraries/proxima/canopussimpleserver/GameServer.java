package id.nithium.libraries.proxima.canopussimpleserver;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GameServer extends Server{

    private int gameType;

    GameServer(String name, String containerId, String modeType, String environment, int port, int serverType, int maximumSize, boolean restricted, int gameType) {
        super(name, containerId, modeType, environment, port, serverType, maximumSize, restricted);

        this.gameType = gameType;
    }
}
