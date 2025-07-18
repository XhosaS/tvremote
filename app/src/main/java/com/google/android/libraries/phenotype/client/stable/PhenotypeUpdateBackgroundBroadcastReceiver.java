package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.a;
import defpackage.aags;
import defpackage.abxv;
import defpackage.rfr;
import defpackage.rld;
import defpackage.rlo;
import defpackage.yqi;
import defpackage.yqw;
import defpackage.zuz;
import defpackage.zvi;
import defpackage.zwx;
import defpackage.zxn;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PhenotypeUpdateBackgroundBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws abxv {
        final String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            if (stringExtra.contains("../") || stringExtra.contains("/..")) {
                Log.w("PhenotypeBackgroundRecv", a.e(stringExtra, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
                return;
            }
            final rfr rfrVarA = rfr.a(context);
            if (rfrVarA == null) {
                rfr.g();
                yqw.L(false);
                return;
            }
            Map mapA = rld.a(context);
            if (mapA.isEmpty()) {
                return;
            }
            final rld rldVar = (rld) mapA.get(stringExtra);
            if (rldVar == null || !rldVar.b.equals(aags.FILE)) {
                Log.i("PhenotypeBackgroundRecv", a.e(stringExtra, "Skipping ", " which doesn't use ProcessStable flags."));
                return;
            }
            final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            final zwx zwxVar = (zwx) zxn.n(zuz.h(zwx.u(zuz.g(zwx.u(rlo.a(rfrVarA).c()), new yqi() { // from class: rlm
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    rkm rkmVar = rlo.a;
                    riq riqVar = riq.a;
                    abyl abylVar = ((riw) obj).b;
                    String str = stringExtra;
                    if (abylVar.containsKey(str)) {
                        riqVar = (riq) abylVar.get(str);
                    }
                    return riqVar.c;
                }
            }, rfrVarA.e())), new zvi() { // from class: rmf
                @Override // defpackage.zvi
                public final zyd a(Object obj) {
                    String string;
                    List listO = (List) obj;
                    final rld rldVar2 = rldVar;
                    if (!rldVar2.e) {
                        listO = yyk.o("");
                    }
                    int i = yyk.e;
                    yyf yyfVar = new yyf(4);
                    Iterator it = listO.iterator();
                    while (true) {
                        final rfr rfrVar = rfrVarA;
                        if (!it.hasNext()) {
                            return zxn.a(yyfVar.f()).a(new Callable() { // from class: rme
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return null;
                                }
                            }, rfrVar.e());
                        }
                        String str = stringExtra;
                        final String str2 = (String) it.next();
                        rkl rklVar = rmi.b;
                        if (rklVar == null || !rklVar.a.b(str, str2)) {
                            final rmw rmwVar = new rmw(rfrVar, str, str2, rldVar2.c);
                            if (rldVar2.d) {
                                Context context2 = rfrVar.d;
                                string = rmb.a(context2).getString(rldVar2.a, "");
                            } else {
                                string = str2;
                            }
                            final zyd zydVarC = rmwVar.c(string);
                            yyfVar.g(zuz.h(zuz.h(zwx.u(zydVarC), new zvi() { // from class: rmc
                                @Override // defpackage.zvi
                                public final zyd a(Object obj2) {
                                    return rmwVar.d((rmy) obj2);
                                }
                            }, rfrVar.e()), new zvi() { // from class: rmd
                                @Override // defpackage.zvi
                                public final zyd a(Object obj2) {
                                    final rmy rmyVar = (rmy) zxn.o(zydVarC);
                                    if (rmyVar.c.isEmpty()) {
                                        return zxy.a;
                                    }
                                    final String str3 = str2;
                                    final rld rldVar3 = rldVar2;
                                    final rfr rfrVar2 = rfrVar;
                                    zwx zwxVarU = zwx.u(rlo.a(rfrVar2).c());
                                    final String str4 = rldVar3.a;
                                    return zuz.h(zwx.u(zuz.g(zwxVarU, new yqi() { // from class: rln
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // defpackage.yqi
                                        public final Object apply(Object obj3) {
                                            rkm rkmVar = rlo.a;
                                            String str5 = str4;
                                            riq riqVar = riq.a;
                                            str5.getClass();
                                            abyl abylVar = ((riw) obj3).b;
                                            if (abylVar.containsKey(str5)) {
                                                riqVar = (riq) abylVar.get(str5);
                                            }
                                            return riqVar.d;
                                        }
                                    }, rfrVar2.e())), new zvi() { // from class: rmh
                                        @Override // defpackage.zvi
                                        public final zyd a(Object obj3) {
                                            String str5 = str3;
                                            if (!((String) obj3).equals(str5)) {
                                                return zxy.a;
                                            }
                                            rkl rklVar2 = rmi.b;
                                            if (rklVar2 != null) {
                                                if (rklVar2.a.b(rldVar3.a, str5)) {
                                                    return zxy.a;
                                                }
                                            }
                                            return rfrVar2.b().a(rmyVar.c);
                                        }
                                    }, rfrVar2.e());
                                }
                            }, rfrVar.e()));
                        }
                    }
                }
            }, rfrVarA.e()), 25L, TimeUnit.SECONDS, rfrVarA.e());
            zwxVar.d(new Runnable() { // from class: rmg
                @Override // java.lang.Runnable
                public final void run() {
                    zwx zwxVar2 = zwxVar;
                    String str = stringExtra;
                    BroadcastReceiver.PendingResult pendingResult = pendingResultGoAsync;
                    try {
                        try {
                            zxn.o(zwxVar2);
                            Log.i("PhenotypeBackgroundRecv", a.j(str, "Successfully updated snapshot for "));
                        } catch (ExecutionException e) {
                            Log.w("PhenotypeBackgroundRecv", a.j(str, "Failed to update local snapshot for "), e);
                        }
                    } finally {
                        pendingResult.finish();
                    }
                }
            }, rfrVarA.e());
        }
    }
}
