package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsj extends BroadcastReceiver {
    public static final IntentFilter a;
    private static final List b;
    private final yjk c;

    static {
        List listS = yfm.s("android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED", "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED");
        b = listS;
        IntentFilter intentFilter = new IntentFilter();
        Iterator it = listS.iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        a = intentFilter;
    }

    public dsj(yjk yjkVar) {
        this.c = yjkVar;
    }

    public final void a(Context context) {
        Object systemService = context.getSystemService("power");
        systemService.getClass();
        PowerManager powerManager = (PowerManager) systemService;
        boolean zIsDeviceIdleMode = powerManager.isDeviceIdleMode();
        if (Build.VERSION.SDK_INT >= 33) {
            zIsDeviceIdleMode = zIsDeviceIdleMode || powerManager.isLowPowerStandbyEnabled() || powerManager.isDeviceLightIdleMode();
        }
        if (zIsDeviceIdleMode) {
            this.c.a();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (yfm.as(b, intent.getAction())) {
            a(context);
        }
    }
}
