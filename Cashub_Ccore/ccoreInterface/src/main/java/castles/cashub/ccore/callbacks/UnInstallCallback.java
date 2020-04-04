package castles.cashub.ccore.callbacks;

/**
 *  * The callback function for uninstall feature.<br>
 *
 * @author Willy_Chen
 */
public interface UnInstallCallback {

    /**
     * When uninstall success will call this function.
     */
    void uninstallSuccess();

    /**
     * When uninstall failure will call this function.
     */
    void uninstallFailure();
}
