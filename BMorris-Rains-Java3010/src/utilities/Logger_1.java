package utilities;

public class Logger_1 {

    public static boolean loggingEnabled = true;
    public static int DEBUG = 4;
    public static int INFO = 3;
    public static int WARNING = 2;
    public static int ERROR = 1;
    public static int logLevel = 4;

//------------------------------------------------------
    public static void main(String[] args) {

    }

    public static void logDebug(String debug) {

        if (loggingEnabled == true && (logLevel >= 4)) {

            System.out.println("DEBUG: " + debug);
        }

    }

    public static void logInfo(String info) {

        if (loggingEnabled == true && (logLevel >= 3)) {

            System.out.println("INFO: " + info);

        }
    }

    public static void logWarning(String warning) {

        if (loggingEnabled == true && (logLevel >= 2)) {

            System.out.println("WARNING: " + warning);

        }
    }

    public static void logError(String error) {

        if (loggingEnabled == true && (logLevel >= 1)) {

            System.out.println("ERROR: " + error);
        }
    }

    /* I have been unable to make the enableLogging and disableLogging tests pass */

    public static void enableLogging() {
        loggingEnabled = true;
        if (loggingEnabled == true) {
        }
    }

    static void disableLogging() {

        loggingEnabled = false;

    }

    public static void setDetailDebug() {
        logLevel = 4;
        if (logLevel >= 4);

    }

    public static void setDetailInfo() {
        logLevel = 3;
        if (logLevel >= 3);

    }

    public static void setDetailWarning() {
        logLevel = 2;
        if (logLevel >= 2);

    }

    public static void setDetailError() {
        logLevel = 1;
        if (logLevel >= 1);

    }

}
