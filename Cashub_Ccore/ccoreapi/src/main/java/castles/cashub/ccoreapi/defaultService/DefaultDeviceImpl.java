package castles.cashub.ccoreapi.defaultService;

import android.util.Log;

import castles.cashub.ccore.Interface.IVendorDevice;

public class DefaultDeviceImpl implements IVendorDevice {
    @Override
    public boolean openCashBox() {
        Log.d("[Default][DeviceImpl]", "[openCashBox]");

        return false;
    }

    @Override
    public boolean isCashBoxOpen() {
        Log.d("[Default][DeviceImpl]", "[isCashBoxOpen]");

        return false;
    }

    @Override
    public boolean sendTextToCustomDisplay(String s) {
        Log.d("[Default][DeviceImpl]", "[sendTextToCustomDisplay]");

        return false;
    }
}
