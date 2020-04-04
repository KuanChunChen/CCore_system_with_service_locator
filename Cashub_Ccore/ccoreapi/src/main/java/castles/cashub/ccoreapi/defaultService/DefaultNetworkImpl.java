package castles.cashub.ccoreapi.defaultService;

import android.util.Log;

import java.util.List;
import java.util.Map;

import castles.cashub.ccore.Interface.IVendorNetworks;
import castles.cashub.ccore.model.APNConfig;

public class DefaultNetworkImpl implements IVendorNetworks {
    @Override
    public long getDataTraffic(int i, long l, long l1) {
        Log.d("[Default][tNetworkImpl]", "[getDataTraffic]");
        return 0;
    }

    @Override
    public Map<String, Long> getAppDataTraffic(int i, long l, long l1) {
        Log.d("[Default][NetworkImpl]", "[getAppDataTraffic]");
        return null;
    }

    @Override
    public long getAppDataTraffic(String s, int i, long l, long l1) {
        Log.d("[Default][NetworkImpl]", "[getAppDataTraffic]");
        return 0;
    }

    @Override
    public boolean setIPSecurityPolicy(int i) {
        Log.d("[Default][NetworkImpl]", "[setIPSecurityPolicy]");
        return false;
    }

    @Override
    public boolean addDenyIP(String s) {
        Log.d("[Default][NetworkImpl]", "[addDenyIP]");
        return false;
    }

    @Override
    public boolean removeDenyIP(String s) {
        Log.d("[Default][NetworkImpl]", "[removeDenyIP]");
        return false;
    }

    @Override
    public List<String> getDenyIPList() {
        Log.d("[Default][NetworkImpl]", "[getDenyIPList]");
        return null;
    }

    @Override
    public boolean clearDenyIPList() {
        Log.d("[Default][tNetworkImpl]", "[clearDenyIPList]");
        return false;
    }

    @Override
    public boolean addAllowIP(String s) {
        Log.d("[Default][NetworkImpl]", "[addAllowIP]");
        return false;
    }

    @Override
    public boolean removeAllowIP(String s) {
        Log.d("[Default][NetworkImpl]", "[removeAllowIP]");
        return false;
    }

    @Override
    public List<String> getAllowIPList() {
        Log.d("[Default][NetworkImpl]", "[getAllowIPList]");
        return null;
    }

    @Override
    public boolean clearAllowIPList() {
        Log.d("[Default][NetworkImpl]", "[clearAllowIPList]");
        return false;
    }

    @Override
    public boolean changeHotspotStatus(boolean b) {
        Log.d("[Default][NetworkImpl]", "[changeHotspotStatus]");
        return false;
    }

    @Override
    public int addAPN(APNConfig apnConfig) {
        Log.d("[Default][NetworkImpl]", "[addAPN]");
        return 0;
    }

    @Override
    public int updateAPN(APNConfig apnConfig) {
        Log.d("[Default][NetworkImpl]", "[updateAPN]");
        return 0;
    }

    @Override
    public boolean removeAPN(int i) {
        Log.d("[Default][NetworkImpl]", "[removeAPN]");
        return false;
    }

    @Override
    public List<APNConfig> getAPNList() {
        Log.d("[Default][NetworkImpl]", "[getAPNList]");
        return null;
    }

    @Override
    public boolean selectAPN(int i) {
        Log.d("[Default][NetworkImpl]", "[selectAPN]");
        return false;
    }

    @Override
    public boolean clearDNSCache() {
        Log.d("[Default][NetworkImpl]", "[clearDNSCache]");
        return false;
    }
}
