package castles.cashub.ccore.Interface;


import castles.cashub.ccore.callbacks.InstallCallback;
import castles.cashub.ccore.callbacks.UnInstallCallback;
import castles.cashub.ccore.model.PackageInfo;

/**
 * Used to install and uninstall APP,all firmware . <br>
 *
 * @author Willy_Chen
 */
public interface IVendorPackage extends BasicIVendor{


    /**
     * Execute the install function to install the APP.
     *
     * @param path  Specify file path to install the file.
     * @param installCallback The callback function for install.
     * @return The package info contain the value package name, version code, package type and developer.
     * @see InstallCallback
     */
    PackageInfo startInstallation(String path, InstallCallback installCallback);

    /**
     * Execute the uninstall function to uninstall the APP.
     *
     * @param packageName      Specify file path to uninstall the file.
     * @param unInstallCallback  The callback function for uninstall.
     * @see UnInstallCallback
     */
    void startUninstallation(String packageName, UnInstallCallback unInstallCallback);

    /**
     * Start update firmware.
     *
     * @param path  Specify file path to update the firmware.
     * @param installCallback The callback function for update.
     * @return The package info contain the value package name, version code, package type and developer.
     * @see InstallCallback
     */
    PackageInfo startUpdateFirmware(String path, InstallCallback installCallback);

    /**
     * Get package info by assign path.
     *
     * @param path Specify path to get the package info.
     * @return The package info contain the value package name, version code, package type and developer.
     */
    PackageInfo getInfo(String path);

}
