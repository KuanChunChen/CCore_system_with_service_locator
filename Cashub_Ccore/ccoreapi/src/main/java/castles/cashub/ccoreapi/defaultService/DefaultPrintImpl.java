package castles.cashub.ccoreapi.defaultService;

import android.graphics.Bitmap;
import android.util.Log;

import castles.cashub.ccore.Interface.IVendorPrint;
import castles.cashub.ccore.model.PrintStatus;
import castles.cashub.ccore.model.ResultInfo;

public class DefaultPrintImpl implements IVendorPrint {
    @Override
    public ResultInfo open() {
        Log.d("[Default][PrintImpl]", "[open]");
        return null;
    }

    @Override
    public void drawText(String s, boolean b, int i) {
        Log.d("[DefaultPrintImpl]", "[drawText]");
    }

    @Override
    public void drawTextLeftAndRight(String s, String s1, boolean b, int i) {
        Log.d("[Default][PrintImpl]", "[drawTextLeftAndRight]");
    }

    @Override
    public void drawBitmap(Bitmap bitmap, int i) {
        Log.d("[Default][PrintImpl]", "[drawBitmap]");
    }

    @Override
    public void Print() {
        Log.d("[Default][PrintImpl]", "[Print]");
    }

    @Override
    public PrintStatus getStatus() {
        Log.d("[Default][PrintImpl]", "[getStatus]");
        return null;
    }
}
