package castles.cashub.ccoreapi.commonLib;

import android.util.Log;

import castles.cashub.ccore.Interface.BasicIVendor;
import castles.cashub.ccoreapi.BuildConfig;
import castles.cashub.ccoreapi.constants.CommonConstant;
import castles.cashub.ccoreapi.defaultService.DefaultDeviceImpl;
import castles.cashub.ccoreapi.defaultService.DefaultModuleImpl;
import castles.cashub.ccoreapi.defaultService.DefaultNetworkImpl;
import castles.cashub.ccoreapi.defaultService.DefaultPackageImpl;
import castles.cashub.ccoreapi.defaultService.DefaultPaymentConfigImpl;
import castles.cashub.ccoreapi.defaultService.DefaultPrintImpl;
import castles.cashub.ccoreapi.defaultService.DefaultScannerImpl;
import castles.cashub.ccoreapi.defaultService.DefaultSystemImpl;

public class InitialContext {



    public Object lookup(String serviceName) {

        return getServiceImpl(serviceName);
    }

    private BasicIVendor getServiceImpl(String serviceName) {

        Log.d("[InitialContext]", "Looking up : " + serviceName);
        BasicIVendor basicIVendor;

        switch (serviceName) {

            case CommonConstant.ServiceName.SERVICE_PACKAGE:
                basicIVendor = getReflectClass(BuildConfig.packageImpl);
                if (basicIVendor == null) {
                    basicIVendor = new DefaultPackageImpl();
                }
                return basicIVendor;
            case CommonConstant.ServiceName.SERVICE_PRINT:
                basicIVendor = getReflectClass(BuildConfig.printImpl);
                if (basicIVendor == null) {
                    basicIVendor = new DefaultPrintImpl();
                }
                return basicIVendor;
            case CommonConstant.ServiceName.SERVICE_DEVICE:
                basicIVendor = getReflectClass(BuildConfig.deviceImpl);
                if (basicIVendor == null) {
                    basicIVendor = new DefaultDeviceImpl();
                }
                return basicIVendor;
            case CommonConstant.ServiceName.SERVICE_MODULE:
                basicIVendor = getReflectClass(BuildConfig.moduleImpl);
                if (basicIVendor == null) {
                    basicIVendor = new DefaultModuleImpl();
                }
                return basicIVendor;
            case CommonConstant.ServiceName.SERVICE_NETWORK:
                basicIVendor = getReflectClass(BuildConfig.networkImpl);
                if (basicIVendor == null) {
                    basicIVendor = new DefaultNetworkImpl();
                }
                return basicIVendor;
            case CommonConstant.ServiceName.SERVICE_PAYMENT_CONFIG:
                basicIVendor = getReflectClass(BuildConfig.paymentConfigImpl);
                if (basicIVendor == null) {
                    basicIVendor = new DefaultPaymentConfigImpl();
                }
                return basicIVendor;
            case CommonConstant.ServiceName.SERVICE_SCANNER:
                basicIVendor = getReflectClass(BuildConfig.scannerImpl);
                if (basicIVendor == null) {
                    basicIVendor = new DefaultScannerImpl();
                }
                return basicIVendor;
            case CommonConstant.ServiceName.SERVICE_SYSTEM:
                basicIVendor = getReflectClass(BuildConfig.systemImpl);
                if (basicIVendor == null) {
                    basicIVendor = new DefaultSystemImpl();
                }
                return basicIVendor;
            default:
                Log.d("[InitialContext]", "Create failed.");
                break;

        }

        return null;
    }

    private BasicIVendor getReflectClass(String implName) {

        try {
            Class<?> clazz = Class.forName(implName);
            return (BasicIVendor) clazz.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        return null;
    }

}
