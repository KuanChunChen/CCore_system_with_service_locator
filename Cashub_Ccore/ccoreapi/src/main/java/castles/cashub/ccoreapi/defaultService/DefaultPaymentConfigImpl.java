package castles.cashub.ccoreapi.defaultService;

import android.util.Log;

import castles.cashub.ccore.Interface.IVendorPaymentConfig;

public class DefaultPaymentConfigImpl implements IVendorPaymentConfig {
    @Override
    public boolean saveFile(String s) {
        Log.d("[Default][PayConfig]", "[saveFile]");
        return false;
    }

    @Override
    public boolean deleteFile() {
        Log.d("[Default][PayConfig]", "[deleteFile]");
        return false;
    }

    @Override
    public boolean isSupport() {
        Log.d("[Default][PayConfig]", "[isSupport]");
        return false;
    }
}
