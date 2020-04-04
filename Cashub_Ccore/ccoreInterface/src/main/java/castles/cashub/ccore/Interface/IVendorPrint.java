package castles.cashub.ccore.Interface;

import android.graphics.Bitmap;
import castles.cashub.ccore.model.PrintStatus;
import castles.cashub.ccore.model.ResultInfo;

/**
 * Used to control printer to print.<br>
 *
 * @author Willy_Chen

 */
public interface IVendorPrint extends BasicIVendor{


    /**
     * Open the printer.
     *
     * @return ResultInfo:<p>
     * int resultCode<p>
     * String message<p>
     */
    ResultInfo open();

    /**
     * Draw text by printer.
     *
     * @param content  data to br print.
     * @param isBold   if the text should display bold.<p>
     * @param size 1:SMALL  2:NORMAL  3:LARGE<p>
     */
    void drawText(String content, boolean isBold, int size);

    /**
     * Draw text left and right by printer.
     *
     * @param contentLeft    data to be printed on left side
     * @param contentRight  data to be printed on right side
     * @param isBold      if the text should display bold.
     * @param size    the text size. 1:SMALL  2:NoRMAL  3:LARGE
     */
    void drawTextLeftAndRight(String contentLeft, String contentRight, boolean isBold, int size);

    /**
     * Draw the bitmap by print.
     *
     * @param bitmap    The bitmap would be printed.
     * @param alignment Align bitmap to the left , right or center.<p> 1:LEFT 2:RIGHT 3:CENTER
     */

    void drawBitmap(Bitmap bitmap, int alignment);

    /**
     * Execute printer.
     */
    void Print();

    /**
     * Get printer status,
     * and for the {@code Enum} value is :<p>
     * BUSY<p>
     * ERROR<p>
     * OUT_OF_PAPER<p>
     * IDLE<p>
     * @see PrintStatus
     * @return  Enum value of Printer Status.
     */
    PrintStatus getStatus();

}
