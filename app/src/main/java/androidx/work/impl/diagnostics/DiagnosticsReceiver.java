package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.cbx;
import defpackage.cbz;
import defpackage.cca;
import defpackage.cfq;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    private static final String a = cbx.d("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        cbx.c().a(a, "Requesting diagnostics");
        try {
            context.getClass();
            cfq.j(context).d((cca) new cbz(DiagnosticsWorker.class).b());
        } catch (IllegalStateException e) {
            cbx.c();
            Log.e(a, "WorkManager is not initialized", e);
        }
    }
}
