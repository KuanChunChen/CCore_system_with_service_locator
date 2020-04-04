package castles.cashub.ccoreapi.api;

import castles.cashub.ccore.Interface.IVendorPaymentConfig;
import castles.cashub.ccoreapi.commonLib.ServiceLocator;
import castles.cashub.ccoreapi.constants.CommonConstant;


class PaymentConfigAPI {


    IVendorPaymentConfig iVendorPaymentConfig;

    PaymentConfigAPI() {

        iVendorPaymentConfig = (IVendorPaymentConfig) ServiceLocator.getService(CommonConstant.ServiceName.SERVICE_PAYMENT_CONFIG);

    }

    /*** PaymentConfig.*******************************************************/

    public boolean savePaymentConfig(String filePath){

        boolean result = iVendorPaymentConfig.saveFile(filePath);
        return result;
    }

    public boolean deletePaymentConfig(){

        boolean result = iVendorPaymentConfig.deleteFile();
        return result;
    }

    public boolean isPaymentConfigSupport(){

        boolean result = iVendorPaymentConfig.isSupport();
        return result;
    }

    /*********************************************************/

}
