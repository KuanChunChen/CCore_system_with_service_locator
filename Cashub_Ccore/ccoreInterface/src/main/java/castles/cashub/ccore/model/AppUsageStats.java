package castles.cashub.ccore.model;

/**
 * A model of app usage status.<br>
 *
 * @author Willy_Chen
 */
public class AppUsageStats {

    /**
     * The Package name.
     */
    public String packageName;
    /**
     * The Begin time stamp.
     */
    public long beginTimeStamp;
    /**
     * The End time stamp.
     */
    public long endTimeStamp;
    /**
     * The Last time stamp.
     */
    public long lastTimeStamp;
    /**
     * The Total time in foreground.
     */
    public long totalTimeInForeground;
    /**
     * The Launch count.
     */
    public int launchCount;

}
