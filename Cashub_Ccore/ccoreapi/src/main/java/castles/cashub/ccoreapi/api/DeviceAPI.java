package castles.cashub.ccoreapi.api;

import castles.cashub.ccore.Interface.IVendorDevice;
import castles.cashub.ccoreapi.commonLib.ServiceLocator;
import castles.cashub.ccoreapi.constants.CommonConstant;


public class DeviceAPI {

    IVendorDevice iVendorDevice;


    DeviceAPI(){

        iVendorDevice = (IVendorDevice) ServiceLocator.getService(CommonConstant.ServiceName.SERVICE_DEVICE);
    }

    /*** Device.*******************************************************/

    public boolean openCashBox(){

        boolean result = iVendorDevice.openCashBox();
        return result;
    }

    public boolean isCashBoxOpen(){

        boolean result = iVendorDevice.isCashBoxOpen();
        return result;
    }

    public boolean sendTextToCustomDisplay(String contentText){

        boolean result = iVendorDevice.sendTextToCustomDisplay(contentText);
        return result;
    }

    /*********************************************************/

}
