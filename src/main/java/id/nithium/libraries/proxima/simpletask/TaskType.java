package id.nithium.libraries.proxima.simpletask;

import lombok.Getter;

@Getter
public enum TaskType {
    CREATE_SERVER("createServer"),
    DESTROY_SERVER("destroyServer"),
    LOAD_SERVERS("loadServers"),
    LOAD_SERVER("loadServer");

    private String methodName;

    TaskType(String methodName) {
        this.methodName = methodName;
    }
}
