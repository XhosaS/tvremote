package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
class rec implements zxe {
    @Override // defpackage.zxe
    public final void a(Throwable th) {
        if (Log.isLoggable("ClearcutMetricXmitter", 4)) {
            Log.i("ClearcutMetricXmitter", "Transmission has failed: ".concat(String.valueOf(String.valueOf(th))));
        }
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Log.v("ClearcutMetricXmitter", "Transmission is done.");
    }
}
