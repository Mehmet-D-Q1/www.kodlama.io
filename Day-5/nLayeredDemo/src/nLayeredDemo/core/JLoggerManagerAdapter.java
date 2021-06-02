package nLayeredDemo.core;

import nLayeredDemo.JLogger.JLoggerManager;

public class JLoggerManagerAdapter implements ILoggerService{

    @Override
    public void logToSystem(String message) {

        JLoggerManager manager = new JLoggerManager();
        manager.log(message);

    }
}
