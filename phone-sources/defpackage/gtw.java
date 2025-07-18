package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gtw extends gtp {
    public gtw(Context context, isy isyVar) {
        super(context, isyVar);
    }

    @Override // defpackage.gtp
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // defpackage.gtr
    public final /* bridge */ /* synthetic */ Object b() {
        Intent intentRegisterReceiver = this.a.registerReceiver(null, a());
        boolean z = true;
        if (intentRegisterReceiver != null && intentRegisterReceiver.getAction() != null) {
            String action = intentRegisterReceiver.getAction();
            if (action == null) {
                z = false;
            } else {
                int iHashCode = action.hashCode();
                if (iHashCode == -1181163412) {
                    action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.gtp
    public final void c(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        gpn.b();
        int i = gtx.a;
        intent.getAction();
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -1181163412) {
                if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    f(false);
                }
            } else if (iHashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                f(true);
            }
        }
    }
}
