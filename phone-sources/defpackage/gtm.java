package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gtm extends gtp {
    public gtm(Context context, isy isyVar) {
        super(context, isyVar);
    }

    @Override // defpackage.gtp
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // defpackage.gtr
    public final /* bridge */ /* synthetic */ Object b() {
        Intent intentRegisterReceiver = this.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra("status", -1) == 1 || ((float) intentRegisterReceiver.getIntExtra("level", -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        gpn.b();
        Log.e(gtn.a, "getInitialState - null intent received");
        return false;
    }

    @Override // defpackage.gtp
    public final void c(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        gpn.b();
        String str = gtn.a;
        intent.getAction();
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -1980154005) {
                if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    f(true);
                }
            } else if (iHashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                f(false);
            }
        }
    }
}
