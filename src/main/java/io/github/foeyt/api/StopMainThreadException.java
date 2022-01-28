package io.github.foeyt.api;

public class StopMainThreadException extends RuntimeException {
    public StopMainThreadException() {
        super();
    }

    public StopMainThreadException(String message) {
        super(message);
    }

    public StopMainThreadException(String message, Throwable cause) {
        super(message, cause);
    }

    public StopMainThreadException(Throwable cause) {
        super(cause);
    }

    protected StopMainThreadException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
