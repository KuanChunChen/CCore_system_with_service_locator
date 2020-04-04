package castles.cashub.ccoreapi.api;

import android.graphics.Bitmap;

import castles.cashub.ccore.Interface.IVendorPrint;
import castles.cashub.ccore.model.PrintStatus;
import castles.cashub.ccore.model.ResultInfo;
import castles.cashub.ccoreapi.commonLib.ServiceLocator;
import castles.cashub.ccoreapi.constants.CommonConstant;

class PrintAPI {

    IVendorPrint iVendorPrint;

    PrintAPI(){

        iVendorPrint = (IVendorPrint) ServiceLocator.getService(CommonConstant.ServiceName.SERVICE_PRINT);

    }


    /*** Print.*******************************************************/
    public void print(){

        iVendorPrint.Print();
    }

    public ResultInfo openPrinter(){

        return iVendorPrint.open();
    }

    public void drawTextByPrinter(String content, boolean isBold, int size){

        iVendorPrint.drawText(content, isBold, size);
    }

    public void drawTextLeftAndRightByPrinter(String contentLeft, String contentRight, boolean isBold, int size) {

        iVendorPrint.drawTextLeftAndRight(contentLeft, contentRight, isBold, size);
    }

    public void  drawBitmapByPrinter(Bitmap bitmap, int alignment) {

        iVendorPrint.drawBitmap(bitmap, alignment);
    }

    public PrintStatus getPrinterStatus() {

        return iVendorPrint.getStatus();
    }

    /*********************************************************/

}
