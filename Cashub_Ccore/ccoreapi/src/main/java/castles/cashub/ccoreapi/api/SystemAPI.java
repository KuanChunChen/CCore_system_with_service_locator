package castles.cashub.ccoreapi.api;


import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import castles.cashub.ccore.Interface.IVendorSystem;
import castles.cashub.ccore.model.AppUsageStats;
import castles.cashub.ccore.model.ResultInfo;
import castles.cashub.ccoreapi.commonLib.ServiceLocator;
import castles.cashub.ccoreapi.constants.CommonConstant;


public class SystemAPI {

    IVendorSystem iVendorSystem;

    SystemAPI() {

        iVendorSystem = (IVendorSystem) ServiceLocator.getService(CommonConstant.ServiceName.SERVICE_SYSTEM);

    }

    /*** System.*******************************************************/

    public boolean isDefaultApp(String packageName){

        boolean result = iVendorSystem.isDefaultApp(packageName);
        return result;
    }
    public void launchDefaultApp(){

        iVendorSystem.launchDefaultApp();
    }

    public String getVendorName(){

        String result = iVendorSystem.getVendorName();
        return result;
    }

    public String getSerialNumber(){

        String result = iVendorSystem.getSerialNumber();
        return result;
    }

    public String getModelName(){

        String result = iVendorSystem.getModelName();
        return result;
    }

    public String getFirmwareVersion(){

        String result = iVendorSystem.getFirmwareVersion();
        return result;
    }

    public boolean isForeground(String packageName){

        boolean result = iVendorSystem.isForeground(packageName);
        return result;
    }

    public void startReboot(){

        iVendorSystem.startReboot();
    }

    public void startRecovery(){

        iVendorSystem.startRecovery();
    }

    public List<String> getUndeletableAppList(){

        List<String> result = iVendorSystem.getUndeletableAppList();
        return result;
    }

    public boolean changeAppStatus(String packageName, boolean status){

        boolean result = iVendorSystem.changeAppStatus(packageName, status);
        return result;
    }

    public boolean isDebug(){

        boolean result = iVendorSystem.isDebug();
        return result;
    }

    public boolean setAutoRebootTime(int hour, int minutes){

        boolean result = iVendorSystem.setAutoRebootTime(hour, minutes);
        return result;
    }

    public boolean setSystemTime(int year, int month, int day, int hour, int minutes, int second){

        boolean result = iVendorSystem.setSystemTime(year, month, day, hour, minutes, second);
        return result;
    }

    public boolean setSystemTime(Date date){

        boolean result = iVendorSystem.setSystemTime(date);
        return result;
    }

    public boolean setTimeZone(String timeZone){

        boolean result = iVendorSystem.setTimeZone(timeZone);
        return result;
    }

    public int getScreenBrightness(){

        int result = iVendorSystem.getScreenBrightness();
        return result;
    }

    public boolean setScreenBrightness(int screenBrightness){

        boolean result = iVendorSystem.setScreenBrightness(screenBrightness);
        return result;
    }

    public boolean setSleepTime(int timestamp){

        boolean result = iVendorSystem.setSleepTime(timestamp);
        return result;
    }

    public boolean setLanguage(String language){

        boolean result = iVendorSystem.setLanguage(language);
        return result;
    }

    public boolean changeLockScreenStatus(String password, boolean enable){

        boolean result = iVendorSystem.changeLockScreenStatus(password, enable);
        return result;
    }

    public boolean changeLockScreenPassword(String oldPassword, String newPassword){

        boolean result = iVendorSystem.changeLockScreenPassword(oldPassword, newPassword);
        return result;
    }

    public String getLogcatFilePath(){

        String result = iVendorSystem.getLogcatFilePath();
        return result;
    }

    public byte[] readInstallKey(){

        byte[] result = iVendorSystem.readInstallKey();
        return result;
    }

    public ResultInfo writeInstallKey(byte[] data){

        ResultInfo result = iVendorSystem.writeInstallKey(data);
        return result;
    }

    public ResultInfo setLauncherApp(String packageName){

        ResultInfo result = iVendorSystem.setLauncherApp(packageName);
        return result;
    }

    public Map<String, BigDecimal> getBatteryUsage(){

        Map<String, BigDecimal> result = iVendorSystem.getBatteryUsage();
        return result;
    }

    public BigDecimal getBatteryUsage(String packageName){

        BigDecimal result = iVendorSystem.getBatteryUsage(packageName);
        return result;
    }

    public List<AppUsageStats> queryAppUsageReport(int intervalType, long beginTime, long endTime){

        List<AppUsageStats> result = iVendorSystem.queryAppUsageReport(intervalType, beginTime, endTime);
        return result;
    }

    public boolean changeGpsStatus(boolean enable){

        boolean result = iVendorSystem.changeGpsStatus(enable);
        return result;
    }

    public boolean changeMobileNetworkStatus(boolean enable){

        boolean result = iVendorSystem.changeMobileNetworkStatus(enable);
        return result;
    }

    public boolean isTerminalBlock(){

        boolean result = iVendorSystem.isTerminalBlock();
        return result;
    }

    public boolean blockTerminal(){

        boolean result = iVendorSystem.blockTerminal();
        return result;
    }

    public boolean unblockTerminal(){


        boolean result = iVendorSystem.unblockTerminal();
        return result;
    }


}
