package castles.cashub.ccore.callbacks;

/**
 * The callback function of scanner.<br>
 *
 * @author Willy_Chen
 */
public interface ScannerCallback {

    /**
     * On complete.
     *
     * @param result    The result value :<p>
     * 0:success<p>
     * 1:timeout<p>
     * 2:cancel<p>
     * @param symbology Value of symbology.
     * @param data      Value of data.
     */
    void onComplete(int result, int symbology, String data);
}
