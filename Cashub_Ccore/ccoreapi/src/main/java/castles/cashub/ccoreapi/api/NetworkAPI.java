package castles.cashub.ccoreapi.api;

import java.util.List;
import java.util.Map;

import castles.cashub.ccore.Interface.IVendorNetworks;
import castles.cashub.ccore.model.APNConfig;
import castles.cashub.ccoreapi.commonLib.ServiceLocator;
import castles.cashub.ccoreapi.constants.CommonConstant;


class NetworkAPI {

    IVendorNetworks iVendorNetworks;

    NetworkAPI(){

        iVendorNetworks = (IVendorNetworks) ServiceLocator.getService(CommonConstant.ServiceName.SERVICE_NETWORK);

    }

    /*** Networks.*******************************************************/

    public long getDataTraffic(int netType, long startTimestamp, long endTimestamp){

        long result = iVendorNetworks.getDataTraffic(netType, startTimestamp, endTimestamp);
        return result;
    }
    public Map<String, Long> getAppDataTraffic(int netType, long startTimestamp, long endTimestamp){

        Map<String, Long> result = iVendorNetworks.getAppDataTraffic(netType, startTimestamp, endTimestamp);
        return result;
    }

    public long getAppDataTraffic(String packageName, int netType, long startTimestamp, long endTimestamp){

        long result = iVendorNetworks.getAppDataTraffic(packageName, netType, startTimestamp, endTimestamp);
        return result;
    }

    public boolean setIPSecurityPolicy(int policyType){

        boolean result = iVendorNetworks.setIPSecurityPolicy(policyType);
        return result;
    }

    public boolean addDenyIP(String IP){

        boolean result = iVendorNetworks.addDenyIP(IP);
        return result;
    }

    public boolean removeDenyIP(String IP){

        boolean result = iVendorNetworks.removeDenyIP(IP);
        return result;
    }
    public List<String> getDenyIPList(){

        List<String> result = iVendorNetworks.getDenyIPList();
        return result;
    }
    public boolean clearDenyIPList(){

        boolean result = iVendorNetworks.clearDenyIPList();
        return result;
    }
    public boolean addAllowIP(String IP){

        boolean result = iVendorNetworks.addAllowIP(IP);
        return result;
    }
    public boolean removeAllowIP(String IP){

        boolean result = iVendorNetworks.removeAllowIP(IP);
        return result;
    }

    public List<String> getAllowIPList(){

        List<String> result = iVendorNetworks.getAllowIPList();
        return result;
    }
    public boolean clearAllowIPList(){

        boolean result = iVendorNetworks.clearAllowIPList();
        return result;
    }
    public boolean changeHotspotStatus(boolean isEnable){

        boolean result = iVendorNetworks.changeHotspotStatus(isEnable);
        return result;
    }
    public int addAPN(APNConfig APNConfig){

        int result = iVendorNetworks.addAPN(APNConfig);
        return result;
    }
    public int updateAPN(APNConfig APNConfig){

        int result = iVendorNetworks.updateAPN(APNConfig);
        return result;
    }
    public boolean removeAPN(int APNId){

        boolean result = iVendorNetworks.removeAPN(APNId);
        return result;
    }

    public List<APNConfig> getAPNList(){

        List<APNConfig> result = iVendorNetworks.getAPNList();
        return result;
    }

    public boolean selectAPN(int APNId){

        boolean result = iVendorNetworks.selectAPN(APNId);
        return result;
    }

    public boolean clearDNSCache(){

        boolean result = iVendorNetworks.clearDNSCache();
        return result;
    }

    /*********************************************************/


}
