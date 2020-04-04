package castles.cashub.ccoreapi.defaultService;

import android.util.Log;

import java.util.Map;

import castles.cashub.ccore.Interface.IVendorModule;

public class DefaultModuleImpl implements IVendorModule {
    @Override
    public long getCardUsageCount(int i, boolean b) {
        Log.d("[Default][ModuleImpl]", "[getCardUsageCount]");
        return 0;
    }

    @Override
    public Map<Integer, Integer> getSupportModules() {
        Log.d("[Default][ModuleImpl]", "[getSupportModules]");
        return null;
    }

    @Override
    public boolean isModuleEnabled(int i) {
        Log.d("[Default][ModuleImpl]", "[isModuleEnabled]");
        return false;
    }

    @Override
    public boolean changeModuleStatus(int i, boolean b) {
        Log.d("[Default][ModuleImpl]", "[changeModuleStatus]");
        return false;
    }
}
