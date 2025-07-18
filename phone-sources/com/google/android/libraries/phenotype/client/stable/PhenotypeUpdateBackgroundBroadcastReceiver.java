package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.a;
import defpackage.oyy;
import defpackage.pgc;
import defpackage.rwv;
import defpackage.ryw;
import defpackage.ryy;
import defpackage.ufn;
import defpackage.uhi;
import defpackage.uis;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PhenotypeUpdateBackgroundBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ryw rywVar;
        final String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            if (stringExtra.contains("../") || stringExtra.contains("/..")) {
                Log.w("PhenotypeBackgroundRecv", a.cg(stringExtra, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
                return;
            }
            rwv rwvVarA = rwv.a(context);
            if (rwvVarA == null) {
                rwv.d();
                a.ab(false);
                return;
            }
            Map mapA = ryw.a(context);
            if (mapA.isEmpty() || (rywVar = (ryw) mapA.get(stringExtra)) == null || !rywVar.b.equals(uis.FILE)) {
                return;
            }
            final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            final uhi uhiVarW = ((uhi) ufn.j(uhi.v(ufn.i(uhi.v(ryy.b(rwvVarA).a()), new pgc(stringExtra, 14), rwvVarA.b())), new oyy(rywVar, stringExtra, rwvVarA, 6, (char[]) null), rwvVarA.b())).w(25L, TimeUnit.SECONDS, rwvVarA.b());
            uhiVarW.c(new Runnable() { // from class: rzb
                @Override // java.lang.Runnable
                public final void run() {
                    uhi uhiVar = uhiVarW;
                    String str = stringExtra;
                    BroadcastReceiver.PendingResult pendingResult = pendingResultGoAsync;
                    try {
                        try {
                            sfy.J(uhiVar);
                        } catch (ExecutionException e) {
                            Log.w("PhenotypeBackgroundRecv", a.cr(str, "Failed to update local snapshot for "), e);
                        }
                    } finally {
                        pendingResult.finish();
                    }
                }
            }, rwvVarA.b());
        }
    }
}
