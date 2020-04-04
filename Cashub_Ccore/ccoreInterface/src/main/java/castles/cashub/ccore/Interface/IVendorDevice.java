package castles.cashub.ccore.Interface;


/**
 * To manage the device.<br>
 *
 * @author Willy_Chen
 */
public interface IVendorDevice extends BasicIVendor{


    /**
     * Open cash box.
     *
     * @return true : success<p>
     *  false: failure<p>
     */
    boolean openCashBox();

    /**
     *  Check whether specified cash box open.
     *
     * @return
     * true: is open<p>
     * false: not open <p>
     */
    boolean isCashBoxOpen();

    /**
     * Send text to custom display.
     *
     * @param contentText the content of text
     * @return true : success<p>
     *  false: failure<p>
     */
    boolean sendTextToCustomDisplay(String contentText);


}
