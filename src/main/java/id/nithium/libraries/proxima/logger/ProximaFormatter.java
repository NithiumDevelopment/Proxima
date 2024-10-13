package id.nithium.libraries.proxima.logger;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class ProximaFormatter extends Formatter {
    private DateFormat dateFormat = new SimpleDateFormat(System.getProperty("id.nithium.log-date-format", "HH:mm:ss"));
    private String prefix;

    public ProximaFormatter() {
    }

    public ProximaFormatter(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String format(LogRecord record) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(dateFormat.format(record.getMillis()));
        stringBuilder.append(" [" + record.getSourceClassName() + "." + record.getSourceMethodName() +"]");

        if (prefix != null) {
            stringBuilder.append(" [" + prefix + "]");
        }

        stringBuilder.append(" [" + record.getLevel().getLocalizedName() + "]: ");
        stringBuilder.append(formatMessage(record));
        stringBuilder.append('\n');

        if (record.getThrown() != null) {
            StringWriter stringWriter = new StringWriter();
            record.getThrown().printStackTrace(new PrintWriter(stringWriter));
            stringBuilder.append(stringWriter);
        }

        return stringBuilder.toString();
    }
}
