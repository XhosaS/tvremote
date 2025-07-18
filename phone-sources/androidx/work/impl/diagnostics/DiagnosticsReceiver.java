package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.fki;
import defpackage.gpn;
import defpackage.gpo;
import defpackage.gpz;
import defpackage.grd;
import defpackage.grs;
import defpackage.yfm;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    private static final String a = gpn.a("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        gpn.b();
        try {
            gpz gpzVarAV = fki.aV(context);
            List listP = yfm.p(new gpo(DiagnosticsWorker.class).f());
            if (listP.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new grd((grs) gpzVarAV, null, 2, listP, null).be();
        } catch (IllegalStateException e) {
            gpn.b();
            Log.e(a, "WorkManager is not initialized", e);
        }
    }
}
