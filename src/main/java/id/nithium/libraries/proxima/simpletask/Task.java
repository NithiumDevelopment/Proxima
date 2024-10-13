package id.nithium.libraries.proxima.simpletask;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Task {

    @NonNull
    private TaskType taskType;
    private String name;
}
