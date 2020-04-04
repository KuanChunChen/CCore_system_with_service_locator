package castles.cashub.ccoreapi.defaultService;

import android.util.Log;
import android.view.Surface;

import castles.cashub.ccore.Interface.IVendorScanner;
import castles.cashub.ccore.callbacks.ScannerCallback;
import castles.cashub.ccore.model.ResultInfo;

public class DefaultScannerImpl implements IVendorScanner {
    @Override
    public ResultInfo open() {
        Log.d("[Default][ScannerImpl]", "[open]");
        return null;
    }

    @Override
    public void setParameter(int i, int i1) {
        Log.d("[DefaultScannerImpl]", "[setParameter]");
    }

    @Override
    public void setPreviewSurface(Surface surface) {
        Log.d("[Default][ScannerImpl]", "[setPreviewSurface]");
    }

    @Override
    public void setTimeout(int i) {
        Log.d("[Default][ScannerImpl]", "[setTimeout]");
    }

    @Override
    public ResultInfo start(ScannerCallback scannerCallback) {
        Log.d("[Default][ScannerImpl]", "[start]");
        return null;
    }

    @Override
    public ResultInfo stop() {
        Log.d("[Default][ScannerImpl]", "[stop]");
        return null;
    }

    @Override
    public ResultInfo close() {
        Log.d("[Default][ScannerImpl]", "[close]");
        return null;
    }
}
