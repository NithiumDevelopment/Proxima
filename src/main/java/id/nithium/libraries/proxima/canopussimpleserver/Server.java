package id.nithium.libraries.proxima.canopussimpleserver;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Server {

    private String name, containerId, modeType, environment;
    private int port, serverType, maximumSize;
    private boolean restricted;

}
