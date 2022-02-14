public class LogMessage
{
    private String machineId;
    private String description;
    /** Precondition: message is a valid log message. */
    public LogMessage(String message)
    { /* to be implemented in part (a) */
    int ind = message.indexOf(":");
    if(ind != -1) {
        machineId = message.substring(0,ind);
        description = message.substring(ind + 1);
    }

    }
    /** Returns true if the description in this log message properly contains keyword;
     * false otherwise.
     */
    public boolean containsWord(String keyword)
    { if (description.equals(keyword)) return true;

        if (description.indexOf(keyword + " ") == 0) return true;
        if (description.indexOf(" " + keyword + " ") != -1) return true;

        int keywordWithSpace = keyword.length()+1;
        int descriptionLength = description.length();
        int end = descriptionLength - keywordWithSpace;

        if (description.indexOf(" " + keyword) == end) return true;

        return false; }

    public String getMachineId()
    { return machineId; }
    public String getDescription()
    { return description; }
// There may be instance variables, constructors, and methods that are not shown.
}