package castles.cashub.ccore.callbacks;

/**
 * The callback function for install feature.<br>
 *
 * @author Willy_Chen
 */
public interface InstallCallback {

    /**
     * When install success will call this function.
     */
    void installSuccess();

    /**
     * When install failure will call this function.
     */
    void installFailure();
}
