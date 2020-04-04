package castles.cashub.ccoreapi.api;

import java.util.Map;

import castles.cashub.ccore.Interface.IVendorModule;
import castles.cashub.ccoreapi.commonLib.ServiceLocator;
import castles.cashub.ccoreapi.constants.CommonConstant;


class ModuleAPI {

    IVendorModule iVendorModule;


    ModuleAPI(){

        iVendorModule = (IVendorModule) ServiceLocator.getService(CommonConstant.ServiceName.SERVICE_MODULE);


    }

    /*** Module.*******************************************************/

    public long getCardUsageCount(int cardType, boolean isSuccess){

        long result = iVendorModule.getCardUsageCount(cardType, isSuccess);
        return result;
    }

    public Map<Integer, Integer> getSupportModules(){

        Map<Integer, Integer> result = iVendorModule.getSupportModules();
        return result;
    }

    public boolean changeModuleStatus(int module, boolean enable){

        boolean result = iVendorModule.changeModuleStatus(module, enable);
        return result;
    }

    /*********************************************************/

}
