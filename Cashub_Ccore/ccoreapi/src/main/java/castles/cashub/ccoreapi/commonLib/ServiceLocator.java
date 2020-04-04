package castles.cashub.ccoreapi.commonLib;

import android.util.Log;

import castles.cashub.ccore.Interface.BasicIVendor;

public class ServiceLocator {

    private static CommonCache cache;

    static {
        cache = new CommonCache();
    }


    public static BasicIVendor getService(String serviceName) {

        BasicIVendor service = cache.getServices(serviceName);

        if (service != null) {
            Log.d("[Logs]", serviceName + " already exist!");
            return service;
        }

        InitialContext initialContext = new InitialContext();
        BasicIVendor newService = (BasicIVendor) initialContext.lookup(serviceName);
        cache.addService(serviceName, newService);
        return newService;
    }


}
