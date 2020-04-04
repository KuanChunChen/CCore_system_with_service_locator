package castles.cashub.ccoreapi.api;


import castles.cashub.ccore.Interface.IVendorDevice;
import castles.cashub.ccore.Interface.IVendorModule;
import castles.cashub.ccore.Interface.IVendorNetworks;
import castles.cashub.ccore.Interface.IVendorPackage;
import castles.cashub.ccore.Interface.IVendorPaymentConfig;
import castles.cashub.ccore.Interface.IVendorPrint;
import castles.cashub.ccore.Interface.IVendorScanner;
import castles.cashub.ccore.Interface.IVendorSystem;



/**
 * <br>
 *
 * @author Willy_Chen
 */
public class CCoreAPI {

    public IVendorPrint iVendorPrint;
    public IVendorPackage iVendorPackage;
    public IVendorModule iVendorModule;
    public IVendorSystem iVendorSystem;
    public IVendorDevice iVendorDevice;
    public IVendorNetworks iVendorNetworks;
    public IVendorPaymentConfig iVendorPaymentConfig;
    public IVendorScanner iVendorScanner;


    /**
     * Instantiates a ccore api.
     */
    public CCoreAPI() {

        iVendorPrint = new PrintAPI().iVendorPrint;
        iVendorPackage = new PackageAPI().iVendorPackage;
        iVendorModule = new ModuleAPI().iVendorModule;
        iVendorSystem = new SystemAPI().iVendorSystem;
        iVendorDevice = new DeviceAPI().iVendorDevice;
        iVendorNetworks = new NetworkAPI().iVendorNetworks;
        iVendorPaymentConfig = new PaymentConfigAPI().iVendorPaymentConfig;
        iVendorScanner = new ScannerAPI().iVendorScanner;

    }

}
