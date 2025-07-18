package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.BatteryManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class woa implements wnz {
    private final BatteryManager a;

    static {
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    public woa(Context context) {
        this.a = (BatteryManager) context.getSystemService("batterymanager");
    }

    @Override // defpackage.wnz
    public final boolean a() {
        return this.a.isCharging();
    }
}
