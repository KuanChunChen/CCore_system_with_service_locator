package castles.cashub.ccoreapi.defaultService;

import android.util.Log;

import castles.cashub.ccore.Interface.IVendorPackage;
import castles.cashub.ccore.callbacks.InstallCallback;
import castles.cashub.ccore.callbacks.UnInstallCallback;
import castles.cashub.ccore.model.PackageInfo;

public class DefaultPackageImpl implements IVendorPackage {
    @Override
    public PackageInfo startInstallation(String s, InstallCallback installCallback) {
        Log.d("[Default][PackageImpl]", "[startInstallation]");
        return null;
    }

    @Override
    public void startUninstallation(String s, UnInstallCallback unInstallCallback) {
        Log.d("[Default][PackageImpl]", "[startUninstallation]");
    }

    @Override
    public PackageInfo startUpdateFirmware(String s, InstallCallback installCallback) {
        Log.d("[Default][PackageImpl]", "[startUpdateFirmware]");
        return null;
    }

    @Override
    public PackageInfo getInfo(String s) {
        Log.d("[Default][PackageImpl]", "[getInfo]");
        return null;
    }
}
