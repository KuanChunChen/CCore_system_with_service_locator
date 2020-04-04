package castles.cashub.ccoreapi.defaultService;

import android.util.Log;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import castles.cashub.ccore.Interface.IVendorSystem;
import castles.cashub.ccore.model.AppUsageStats;
import castles.cashub.ccore.model.ResultInfo;

public class DefaultSystemImpl implements IVendorSystem {
    @Override
    public boolean isDefaultApp(String s) {
        Log.d("[Default][ScannerImpl]", "[isDefaultApp]");
        return false;
    }

    @Override
    public void launchDefaultApp() {

        Log.d("[Default][ScannerImpl]", "[launchDefaultApp]");
    }

    @Override
    public String getVendorName() {
        Log.d("[Default][ScannerImpl]", "[getVendorName]");
        return null;
    }

    @Override
    public String getSerialNumber() {
        Log.d("[Default][ScannerImpl]", "[getSerialNumber]");
        return null;
    }

    @Override
    public String getModelName() {
        Log.d("[Default][ScannerImpl]", "[getModelName]");
        return null;
    }

    @Override
    public String getFirmwareVersion() {
        Log.d("[Default][ScannerImpl]", "[getFirmwareVersion]");
        return null;
    }

    @Override
    public boolean isForeground(String s) {
        Log.d("[Default][ScannerImpl]", "[isForeground]");
        return false;
    }

    @Override
    public void startReboot() {
        Log.d("[Default][ScannerImpl]", "[startReboot]");
    }

    @Override
    public void startRecovery() {
        Log.d("[Default][ScannerImpl]", "[startRecovery]");
    }

    @Override
    public List<String> getUndeletableAppList() {
        Log.d("[Default][ScannerImpl]", "[getUndeletableAppList]");
        return null;
    }

    @Override
    public boolean changeAppStatus(String s, boolean b) {
        Log.d("[Default][ScannerImpl]", "[changeAppStatus]");
        return false;
    }

    @Override
    public boolean isDebug() {
        Log.d("[Default][ScannerImpl]", "[isDebug]");
        return false;
    }

    @Override
    public boolean setAutoRebootTime(int i, int i1) {
        Log.d("[Default][ScannerImpl]", "[setAutoRebootTime]");
        return false;
    }

    @Override
    public boolean setSystemTime(int i, int i1, int i2, int i3, int i4, int i5) {
        Log.d("[Default][ScannerImpl]", "[setSystemTime]");
        return false;
    }

    @Override
    public boolean setSystemTime(Date date) {
        Log.d("[Default][ScannerImpl]", "[setSystemTime]");
        return false;
    }

    @Override
    public boolean setTimeZone(String s) {
        Log.d("[Default][ScannerImpl]", "[setTimeZone]");
        return false;
    }

    @Override
    public int getScreenBrightness() {
        Log.d("[Default][ScannerImpl]", "[getScreenBrightness]");
        return 0;
    }

    @Override
    public boolean setScreenBrightness(int i) {
        Log.d("[Default][ScannerImpl]", "[setScreenBrightness]");
        return false;
    }

    @Override
    public boolean setSleepTime(int i) {
        Log.d("[Default][ScannerImpl]", "[setSleepTime]");
        return false;
    }

    @Override
    public boolean setLanguage(String s) {
        Log.d("[Default][ScannerImpl]", "[setLanguage]");
        return false;
    }

    @Override
    public boolean changeLockScreenStatus(String s, boolean b) {
        Log.d("[Default][ScannerImpl]", "[changeLockScreenStatus]");
        return false;
    }

    @Override
    public boolean changeLockScreenPassword(String s, String s1) {
        Log.d("[Default][ScannerImpl]", "[changeLockScreenPassword]");
        return false;
    }

    @Override
    public String getLogcatFilePath() {
        Log.d("[Default][ScannerImpl]", "[getLogcatFilePath]");
        return null;
    }

    @Override
    public byte[] readInstallKey() {
        Log.d("[Default][ScannerImpl]", "[readInstallKey]");
        return new byte[0];
    }

    @Override
    public ResultInfo writeInstallKey(byte[] bytes) {
        Log.d("[Default][ScannerImpl]", "[writeInstallKey]");
        return null;
    }

    @Override
    public ResultInfo setLauncherApp(String s) {
        Log.d("[Default][ScannerImpl]", "[setLauncherApp]");
        return null;
    }

    @Override
    public Map<String, BigDecimal> getBatteryUsage() {
        Log.d("[Default][ScannerImpl]", "[getBatteryUsage]");
        return null;
    }

    @Override
    public BigDecimal getBatteryUsage(String s) {
        Log.d("[Default][ScannerImpl]", "[getBatteryUsage]");
        return null;
    }

    @Override
    public List<AppUsageStats> queryAppUsageReport(int i, long l, long l1) {
        Log.d("[Default][ScannerImpl]", "[queryAppUsageReport]");
        return null;
    }

    @Override
    public boolean changeGpsStatus(boolean b) {
        Log.d("[Default][ScannerImpl]", "[changeGpsStatus]");
        return false;
    }

    @Override
    public boolean changeMobileNetworkStatus(boolean b) {
        Log.d("[Default][ScannerImpl]", "[changeMobileNetworkStatus]");
        return false;
    }

    @Override
    public boolean isTerminalBlock() {
        Log.d("[Default][ScannerImpl]", "[isTerminalBlock]");
        return false;
    }

    @Override
    public boolean blockTerminal() {
        Log.d("[Default][ScannerImpl]", "[blockTerminal]");
        return false;
    }

    @Override
    public boolean unblockTerminal() {
        Log.d("[Default][ScannerImpl]", "[unblockTerminal]");
        return false;
    }
}
