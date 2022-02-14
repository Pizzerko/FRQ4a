import java.util.*;

public class Main {
    public static void main(String[] args) {
        LogMessage l = new LogMessage("Hello:people are weird");
        LogMessage a = new LogMessage("Hello:people ");
        LogMessage b = new LogMessage("Hello:peopleno");
        LogMessage t = new LogMessage("Hello:nofish");
        LogMessage d = new LogMessage("Hello:there aremany people");
        ArrayList<LogMessage> messageList = new ArrayList<LogMessage>();
        messageList.add(l);
        messageList.add(a);
        messageList.add(b);
        messageList.add(t);
        messageList.add(d);
        SystemLog system = new SystemLog(messageList);
        system.removeMessages("people");
        System.out.println(messageList.getMachineId + messageList.getDescriptionId);
    }
}
