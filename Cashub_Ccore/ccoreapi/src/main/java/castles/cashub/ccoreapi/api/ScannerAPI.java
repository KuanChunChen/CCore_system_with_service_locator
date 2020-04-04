package castles.cashub.ccoreapi.api;

import castles.cashub.ccore.Interface.IVendorScanner;
import castles.cashub.ccore.callbacks.ScannerCallback;
import castles.cashub.ccore.model.ResultInfo;
import castles.cashub.ccoreapi.commonLib.ServiceLocator;
import castles.cashub.ccoreapi.constants.CommonConstant;


class ScannerAPI {

    IVendorScanner iVendorScanner;

    ScannerAPI(){

        iVendorScanner = (IVendorScanner) ServiceLocator.getService(CommonConstant.ServiceName.SERVICE_SCANNER);

    }

    /*** Scanner.*******************************************************/

    public ResultInfo openScanner() {

        ResultInfo resultInfo = iVendorScanner.open();
        return resultInfo;
    }

    public void setScannerParameter(int key, int value){

        iVendorScanner.setParameter(key, value);
    }

    public void setScannerTimeout(int timeout){

        iVendorScanner.setTimeout(timeout);
    }

    public ResultInfo startScanner(ScannerCallback scannerCallback){

        ResultInfo resultInfo = iVendorScanner.start(scannerCallback);
        return resultInfo;
    }


    public ResultInfo stopScanner(){

        ResultInfo resultInfo = iVendorScanner.stop();
        return resultInfo;
    }

    public ResultInfo closeScanner(){

        ResultInfo resultInfo = iVendorScanner.close();
        return resultInfo;
    }

    /*********************************************************/

}
