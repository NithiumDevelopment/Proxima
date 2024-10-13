package id.nithium.libraries.proxima.model;

import id.nithium.libraries.proxima.canopussimpleserver.Server;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(staticName = "of")
@Getter
public class DataSetter {

    private Server server;
    private String data;
    private Object newData;

}
