package mcib3d.utils.Logger;

/**
 * Created by thomasb on 6/12/16.
 */
public class TextLog extends AbstractLog {
    String log = "";
    boolean concat = true;

    @Override
    public void log(String S) {

        if(concat) log = log.concat(S); else log=S;
    }

    public String getLog() {
        return log;
    }

    public boolean isConcat() {
        return concat;
    }

    public void setConcat(boolean concat) {
        this.concat = concat;
    }
}
