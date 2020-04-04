package castles.cashub.ccore.Interface;

import android.view.Surface;

import castles.cashub.ccore.callbacks.ScannerCallback;
import castles.cashub.ccore.constants.BarcodeKey;
import castles.cashub.ccore.model.ResultInfo;

/**
 * Used to control other device, like barcode reader<br>
 *
 * @author Willy_Chen
 */
public interface IVendorScanner extends BasicIVendor{

    /**
     * Open the scanner.
     *
     * @return result:<p>
     * int resultCode<p>
     * String message<p>
     */
    ResultInfo open();

    /**
     * Set the parameter of scanner.
     *
     * @param key   The define key from {@code Barecode Key} table
     * @param value The value to set the enable or disable status.  <p>
     *  1:Enable<p>
     *  0:Disable<p>
     * @see BarcodeKey
     */
    void setParameter(int key, int value);

    /**
     * Set the preview surface.
     *
     * @param surface The preview surface.
     */
    void setPreviewSurface(Surface surface);

    /**
     * Set the timeout of the scanner.
     *
     * @param timeout The timeout of scanner, and it should be millisecond.
     */
    void setTimeout(int timeout);

    /**
     * Start scanner.
     *
     * @param scannerCallback Callback function of scanner.
     * @return result:<p>
     * int resultCode<p>
     * String message<p>
     */
    ResultInfo start(ScannerCallback scannerCallback);

    /**
     * Stop scanner.
     *
     * @return result:<p>
     * int resultCode<p>
     * String message<p>
     */
    ResultInfo stop();

    /**
     * Close scanner.
     *
     * @return result:<p>
     * int resultCode<p>
     * String message<p>
     */
    ResultInfo close();


}
