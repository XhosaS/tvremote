package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.adz;
import defpackage.b;
import defpackage.bav;
import defpackage.bcu;
import defpackage.bcw;
import defpackage.bdq;
import defpackage.bfx;
import defpackage.cgx;
import defpackage.chk;
import defpackage.chz;
import defpackage.cit;
import defpackage.cja;
import defpackage.cjd;
import defpackage.cjn;
import defpackage.cjp;
import defpackage.cjv;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PhenotypeUpdateBackgroundBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            if (stringExtra.contains("../") || stringExtra.contains("/..")) {
                Log.w("PhenotypeBackgroundRecv", b.c(stringExtra, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
                return;
            }
            bav bavVarA = bav.a(context);
            if (bavVarA == null) {
                bav.c();
                bdq.j(false);
                return;
            }
            Map mapA = bcu.a(context);
            if (mapA.isEmpty()) {
                return;
            }
            bcu bcuVar = (bcu) mapA.get(stringExtra);
            if (bcuVar == null || !bcuVar.b.equals(cjv.FILE)) {
                Log.i("PhenotypeBackgroundRecv", b.c(stringExtra, "Skipping ", " which doesn't use ProcessStable flags."));
                return;
            }
            final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            cja cjaVarI = chk.i(cit.x(chk.h(cit.x(bcw.b(bavVarA).a()), new adz(stringExtra, 7), bavVarA.b())), new bfx(bcuVar, stringExtra, bavVarA, 1), bavVarA.b());
            TimeUnit timeUnit = TimeUnit.SECONDS;
            cjd cjdVarB = bavVarA.b();
            if (!cjaVarI.isDone()) {
                cjp cjpVar = new cjp(cjaVarI);
                cjn cjnVar = new cjn(cjpVar);
                cjpVar.b = cjdVarB.schedule(cjnVar, 25L, timeUnit);
                cjaVarI.m(cjnVar, chz.a);
                cjaVarI = cjpVar;
            }
            final cit citVar = (cit) cjaVarI;
            ((cgx) cjaVarI).m(new Runnable() { // from class: bdc
                @Override // java.lang.Runnable
                public final void run() {
                    cit citVar2 = citVar;
                    String str = stringExtra;
                    BroadcastReceiver.PendingResult pendingResult = pendingResultGoAsync;
                    try {
                        try {
                            qm.P(citVar2);
                            Log.i("PhenotypeBackgroundRecv", b.g(str, "Successfully updated snapshot for "));
                        } catch (ExecutionException e) {
                            Log.w("PhenotypeBackgroundRecv", b.g(str, "Failed to update local snapshot for "), e);
                        }
                    } finally {
                        pendingResult.finish();
                    }
                }
            }, bavVarA.b());
        }
    }
}
