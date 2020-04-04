package castles.cashub.ccore.Interface;

import java.util.Map;
import castles.cashub.ccore.constants.Constants;

/**
 * Used to control terminal module and get terminal module information.<br>
 *
 * @author Willy_Chen
 */
public interface IVendorModule extends BasicIVendor{

    /**
     * Get the card usage count of reading cards.
     *
     * @param cardType  CARD_TYPE_MAGMETIC_STRIPE_CARD = 1 - Magnetic stripe card <p>
     * CARD_TYPE_IC_CARD =  2 - IC card  <p>
     * CARD_TYPE_PICC_CARD = 3 - PICC card<p>
     * @param isSuccess true: swipe card success  <p>
     *                  false: swipe card fail	<p>
     * @return the card usage count of reading cards.
     * @see Constants
     */
    long getCardUsageCount(int cardType, boolean isSuccess);

    /**
     * Get all terminal module support information.
     *
     * @return the terminal module support list<p>
     * MODULE_MAG = 1  <p>
     * MODULE_ICC = 2<p>
     * MODULE_PICC = 3<p>
     * MODULE_KEYBOARD = 4<p>
     * MODULE_PRINTER = 5<p>
     * MODULE_ETHERNET = 6<p>
     * MODULE_FINGERPRINT_READER = 7<p>
     * MODULE_G_SENSOR = 8<p>
     * MODULE_ID_CARD_READER = 9<p>
     * MODULE_SM = 10<p>
     * MODULE_MODEM = 11<p>
     * MODULE_BT = 12 <p>
     * MODULE_PED = 13 <p>
     * MODULE_HDMI = 14 <p>
     * MODULE_CASH_BOX = 15 <p>
     * MODULE_CUSTOMER_DISPLAY = 16 <p>
     * The map's value: <p>
     * VALUE_SUPPORT =  0 - support<p>
     * VALUE_NOT = 1 - not support<p>
     * VALUE_INVAILD = 2 - invaild<p>
     * VALUE_UNKNOWN = 3 - unknown<p>
     * And you can refer the file {@code Constant} below :
     * @see Constants
     */
    Map<Integer, Integer> getSupportModules();

    /**
     * Is terminal module enabled or disabled.
     *
     * @param  module module key<p>
     * MODULE_MAG = 1  <p>
     * MODULE_ICC = 2<p>
     * MODULE_PICC = 3<p>
     * MODULE_KEYBOARD = 4<p>
     * MODULE_PRINTER = 5<p>
     * MODULE_ETHERNET = 6<p>
     * MODULE_FINGERPRINT_READER = 7<p>
     * MODULE_G_SENSOR = 8<p>
     * MODULE_ID_CARD_READER = 9<p>
     * MODULE_SM = 10<p>
     * MODULE_MODEM = 11<p>
     * MODULE_BT = 12 <p>
     * MODULE_PED = 13 <p>
     * MODULE_HDMI = 14 <p>
     * MODULE_CASH_BOX = 15 <p>
     * MODULE_CUSTOMER_DISPLAY = 16 <p>
     * @return true : success<p>
     *  false: failure<p>
     *  @see Constants
     */
    boolean isModuleEnabled(int module);

    /**
     * Change terminal module enable or disable.
     *
     * @param module module key<p>
     * MODULE_MAG = 1  <p>
     * MODULE_ICC = 2<p>
     * MODULE_PICC = 3<p>
     * MODULE_KEYBOARD = 4<p>
     * MODULE_PRINTER = 5<p>
     * MODULE_ETHERNET = 6<p>
     * MODULE_FINGERPRINT_READER = 7<p>
     * MODULE_G_SENSOR = 8<p>
     * MODULE_ID_CARD_READER = 9<p>
     * MODULE_SM = 10<p>
     * MODULE_MODEM = 11<p>
     * MODULE_BT = 12 <p>
     * MODULE_PED = 13 <p>
     * MODULE_HDMI = 14 <p>
     * MODULE_CASH_BOX = 15 <p>
     * MODULE_CUSTOMER_DISPLAY = 16 <p>
     *  And you can refer the file {@code Constant}  :
     * @param enable true is enable<p>
     *  false is disable.<p>
     * @return true : success<p>
     *  false: failure<p>
     * @see Constants
     */
    boolean changeModuleStatus(int module, boolean enable);
}
