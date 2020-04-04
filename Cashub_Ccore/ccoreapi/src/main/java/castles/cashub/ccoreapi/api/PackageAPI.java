package castles.cashub.ccoreapi.api;

import castles.cashub.ccore.Interface.IVendorPackage;
import castles.cashub.ccore.callbacks.InstallCallback;
import castles.cashub.ccore.callbacks.UnInstallCallback;
import castles.cashub.ccore.model.PackageInfo;
import castles.cashub.ccoreapi.commonLib.ServiceLocator;
import castles.cashub.ccoreapi.constants.CommonConstant;


class PackageAPI {


    IVendorPackage iVendorPackage;

    PackageAPI() {

        iVendorPackage = (IVendorPackage) ServiceLocator.getService(CommonConstant.ServiceName.SERVICE_PACKAGE);

    }

    /*** Package.*******************************************************/

    public PackageInfo startInstallation(String path, InstallCallback installCallback){

        PackageInfo packageInfo = iVendorPackage.startInstallation(path, installCallback);
        return packageInfo;
    }


    public void startUninstallation(String packageName, UnInstallCallback unInstallCallback){

        iVendorPackage.startUninstallation(packageName, unInstallCallback);
    }

    public PackageInfo startUpdateFirmware(String path, InstallCallback installCallback){

        PackageInfo packageInfo = iVendorPackage.startUpdateFirmware(path, installCallback);
        return packageInfo;
    }

    public PackageInfo getInfo(String path){

        PackageInfo packageInfo = iVendorPackage.getInfo(path);
        return packageInfo;
    }
    /*********************************************************/

}
