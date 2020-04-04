package castles.cashub.ccoreapi.commonLib;

import java.util.HashMap;
import java.util.Map;

import castles.cashub.ccore.Interface.BasicIVendor;


public class CommonCache {


    private Map<String, BasicIVendor> cacheServices;

    public CommonCache() {

        cacheServices = new HashMap<>();
    }



    public synchronized BasicIVendor getServices(String serviceName) {

        for (String cacheServiceName : cacheServices.keySet()) {
            if (cacheServiceName.equalsIgnoreCase(serviceName)) {
                System.out.println("Returning vendor cached " + cacheServiceName + ".");

                return cacheServices.get(cacheServiceName);
            }
        }
        return null;
    }

    public synchronized void addService(String serviceName, BasicIVendor newVendorService) {

        boolean exists = false;
        for (String cacheServiceName : cacheServices.keySet()) {
            if (cacheServiceName.equalsIgnoreCase(serviceName)) {
                exists = true;
            }
        }
        if (!exists) {
            cacheServices.put(serviceName, newVendorService);
        }
    }
}
