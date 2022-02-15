public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.replaceFirst("\\[.*?\\]:", "").trim();
    }

    public static String logLevel(String logLine) {
        return logLine.replaceFirst("\\[(.*?)\\]:.*" , "$1").trim().toLowerCase(); 
    }

    public static String reformat(String logLine) {
        String message = message(logLine);
        String level = logLevel(logLine);
        return message + " (" + level + ")";
    }
}
