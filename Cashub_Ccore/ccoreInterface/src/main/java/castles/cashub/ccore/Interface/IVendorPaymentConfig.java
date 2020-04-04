package castles.cashub.ccore.Interface;

/**
 * Used to operate payment config..<br>
 *
 * @author Willy_Chen
 */
public interface IVendorPaymentConfig extends BasicIVendor{

    /**
     * Save payment configuration file.
     *
     * @param filePath payment configuration file path.
     * @return true : success<p>
     *  false: failure<p>
     */
    boolean saveFile(String filePath);

    /**
     * Delete payment configuration file.
     *
     * @return true : success<p>
     *  false: failure<p>
     */
    boolean deleteFile();

    /**
     * Check whether support of current payment configuration.
     *
     * @return the boolean :
     * true: is support<p>
     * false: is not support<p>
     */
    boolean isSupport();

}
