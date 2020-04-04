package castles.cashub.ccore.Interface;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import castles.cashub.ccore.model.AppUsageStats;
import castles.cashub.ccore.model.ResultInfo;
import castles.cashub.ccore.constants.Constants;
/**
 * Used to reboot terminal, launcher default app, get vendor information and so on.
 *
 * @author Willy_Chen
 */
public interface IVendorSystem extends BasicIVendor{


    /**
     * According the package name, to check if it is default application.
     *
     * @param packageName The package name of application would like to be check.
     * @return true:is default APP <p>
     * false: isn't default APP.<p>
     */
    boolean isDefaultApp(String packageName);

    /**
     * Launch default application immediately.
     */
    void launchDefaultApp();

    /**
     * Get vendor name from system.
     *
     * @return The vendor name from system.
     */
    String getVendorName();

    /**
     * Get the terminal serial number.
     *
     * @return The serial number from system.
     */
    String getSerialNumber();

    /**
     * Get terminal model name.
     *
     * @return Model name of terminal.
     */
    String getModelName();

    /**
     * Get the firmware version number.
     *
     * @return Firmware version of terminal.
     */
    String getFirmwareVersion();

    /**
     * Whether the application is currently foreground or background.
     *
     * @param packageName the package name
     * @return true : if the application is in front. <p>
     *  false: if the application is in background. <p>
     */
    boolean isForeground(String packageName);

    /**
     * Reboot terminal.
     */
    void startReboot();

    /**
     * Recovery the terminal.
     */
    void startRecovery();

    /**
     * Get undeletable app list.
     *
     * @return List of the app which can not be delete.
     */
    List<String> getUndeletableAppList();

    /**
     * Change application status.
     *
     * @param packageName the package name.
     * @param status  true is enable<p>
     *  false is disable.<p>
     * @return true : success<p>
     *  false: failure<p>
     */
    boolean changeAppStatus(String packageName, boolean status);

    /**
     * Whether the terminal is debug or release.
     *
     * @return true: debug terminal <p>
     * false: release terminal<p>
     */
    boolean isDebug();

    /**
     * Set auto reboot time.
     *
     * @param hour    hour : 0~23
     * @param minutes minute: 0~59 <p>
     * {@code Notice} : <p>
     *  hour  = -1 or minute  = -1 , close auto reboot
     * @return true : success<p>
     *  false: failure<p>
     */
    boolean setAutoRebootTime(int hour, int minutes);

    /**
     * Set system time.
     *
     * @param year    year of system time
     * @param month  month of system time
     * @param day     day  of system time
     * @param hour    hour of system time
     * @param minutes minute of system time
     * @param second  second of system time
     * @return true : success<p>
     *  false: failure<p>
     */
    boolean setSystemTime(int year, int month, int day, int hour, int minutes, int second);

    /**
     * Set system time by date.
     *
     * @param date date of system time.
     * @return true : success<p>
     *  false: failure<p>
     */
    boolean setSystemTime(Date date);

    /**
     * Set time zone.
     *
     * @param timeZone timezone of system time.
     * @return true : success<p>
     *  false: failure<p>
     */
    boolean setTimeZone(String timeZone);

    /**
     * Get screen brightness.
     *
     * @return Screen brightness.
     */
    int getScreenBrightness();

    /**
     * Set screen brightness.
     *
     * @param screenBrightness the screen brightness
     * @return true : success<p>
     *  false: failure<p>
     */
    boolean setScreenBrightness(int screenBrightness);

    /**
     * Set sleep time of device.
     *
     * @param timestamp sleep time in millisecond.
     * @return true : success<p>
     *  false: failure<p>
     */
    boolean setSleepTime(int timestamp);

    /**
     * Set system language.
     *
     * @param language the language
     * @return true : success<p>
     *  false: failure<p>
     */
    boolean setLanguage(String language);

    /**
     * Change lock screen status.
     *
     * @param password password of lock screen.
     * @param enable  true is enable<p>
     *  false is disable.<p>
     * @return true : success<p>
     *  false: failure<p>
     */
    boolean changeLockScreenStatus(String password, boolean enable);


    /**
     * Change lock screen password.
     *
     * @param oldPassword the old password of lock screen.
     * @param newPassword the new password of lock screen.
     * @return true : success<p>
     *  false: failure<p>
     */
    boolean changeLockScreenPassword(String oldPassword, String newPassword);

    /**
     * Get logcat file path.
     *
     * @return the logcat file path
     */
    String getLogcatFilePath();

    /**
     * Read install key.
     *
     * @return Install key data.
     */
    byte[] readInstallKey();

    /**
     * Write install key.
     *
     * @param data install key data.
     * @return result:<p>
     * int resultCode<p>
     * String message<p>
     */
    ResultInfo writeInstallKey(byte[] data);

    /**
     * Set launcher application.
     *
     * @param packageName the package name of application.
     * @return result:<p>
     * int resultCode<p>
     * String message<p>
     */
    ResultInfo setLauncherApp(String packageName);

    /**
     * Get each app battery usage.
     *
     * @return each application battery usage
     */
    Map<String, BigDecimal> getBatteryUsage();


    /**
     * Get specified app battery usage.
     *
     * @param packageName the package name of application.
     * @return the specified application battery usage.
     */
    BigDecimal getBatteryUsage(String packageName);


    /**
     * Query application usage report.
     *
     * @param intervalType intervalType: <p>
     * INTERVAL_DAILY = 0 <p>
     * INTERVAL_WEEKLY = 1 <p>
     * INTERVAL_MONTHLY = 2 <p>
     * INTERVAL_YEARLY = 3 <p>
     * INTERVAL_BEST = 4 <p>
     * @param beginTime    the begin time user want to query.
     * @param endTime     the end time user want to query.
     * @return the list of application usage status and contain following variable : <p>
     *  AppUsageStats :<p>
     * String packageName<p>
     * long beginTimeStamp<p>
     * long endTimeStamp<p>
     * long lastTimeStamp<p>
     * long totalTimeInForeground<p>
     * int launchCount<p>
     * @see Constants
     */
    List<AppUsageStats> queryAppUsageReport(int intervalType, long beginTime, long endTime);


    /**
     * Switch on/off GPS.
     *
     * @param enable   true is enable<p>
     *  false is disable.<p>
     * @return true : success<p>
     *  false: failure<p>
     */
    boolean changeGpsStatus(boolean enable);


    /**
     * Switch on/off mobile network.
     *
     * @param enable true is enable<p>
     *  false is disable.<p>
     * @return true : success<p>
     *  false: failure<p>
     */
    boolean changeMobileNetworkStatus(boolean enable);

    /**
     * Check whether terminal block.
     *
     * @return true: is terminal block<p>
     * false: isn't terminal block<p>
     */
    boolean isTerminalBlock();

    /**
     * Block the terminal.
     *
     * @return true : success<p>
     *  false: failure<p>
     */
    boolean blockTerminal();

    /**
     * Unblock the terminal.
     *
     * @return true : success<p>
     *  false: failure<p>
     */
    boolean unblockTerminal();



}
