package A5;
 class Logger {
    private static Logger instance = null;
    private StringBuilder logMsg;

    
    private Logger() {
        logMsg = new StringBuilder();
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        logMsg.append(message).append("\n");
    }

    public String getLog() {
        return logMsg.toString();
    }

    public void clearLog() {
        logMsg.setLength(0); 
    }
}
public class Logger_manage {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Application started.");
        logger.log("User logged in");
        
        System.out.println("Current Logs:\n" + logger.getLog());

        logger.clearLog();
        System.out.println("Logs cleared.\nCurrent Logs:\n" + logger.getLog());
    }
}




