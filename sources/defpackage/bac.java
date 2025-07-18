package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bac implements cim {
    @Override // defpackage.cim
    public final void a(Throwable th) {
        if (Log.isLoggable("ClearcutMetricXmitter", 4)) {
            Log.i("ClearcutMetricXmitter", "Transmission has failed: ".concat(String.valueOf(String.valueOf(th))));
        }
    }

    @Override // defpackage.cim
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Log.v("ClearcutMetricXmitter", "Transmission is done.");
    }
}
