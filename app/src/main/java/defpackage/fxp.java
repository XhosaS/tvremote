package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxp extends BroadcastReceiver {
    final /* synthetic */ fxq a;

    public fxp(fxq fxqVar) {
        this.a = fxqVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent != null ? intent.getStringExtra("com.google.android.katniss.ProcessId") : null;
        fxq fxqVar = this.a;
        if (agvy.c(stringExtra, fxqVar.b.j.a)) {
            return;
        }
        String stringExtra2 = intent != null ? intent.getStringExtra("FIELD_PATH") : null;
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        fxqVar.c(new fxr(stringExtra2));
    }
}
