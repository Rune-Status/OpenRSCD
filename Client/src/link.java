import java.applet.Applet;
import java.net.Socket;

public class link {

    public static final void putjag(String s1, byte abyte0[]) {
        name[numfile] = s1;
        buf[numfile] = abyte0;
        numfile++;
    }

    public static final byte[] getjag(String s1) {
        for (int i = 0; i < numfile; i++)
            if (name[i].equals(s1))
                return buf[i];

        return null;
    }

    public static final Socket opensocket(int i) {
        for (socketport = i; socketport != 0; )
            try {
                Thread.sleep(100L);
            } catch (Exception _ex) {
            }

        return s;
    }

    public static final void startthread(Runnable runnable) {
        for (runme = runnable; runme != null; )
            try {
                Thread.sleep(100L);
            } catch (Exception _ex) {
            }

    }

    public static final String gethostname(String s1) {
        for (iplookup = s1; iplookup != null; )
            try {
                Thread.sleep(100L);
            } catch (Exception _ex) {
            }

        return host;
    }

    public link() {
    }

    public static Applet mainapp;
    public static int uid;
    static int socketport;
    static Socket s;
    static Runnable runme = null;
    static String iplookup = null;
    static String host;
    static int numfile;
    private static String name[] = new String[50];
    private static byte buf[][] = new byte[50][];

}
