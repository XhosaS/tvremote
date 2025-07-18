package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.aaha;
import defpackage.aahf;
import defpackage.aahs;
import defpackage.aahv;
import defpackage.aaie;
import defpackage.aaif;
import defpackage.aaih;
import defpackage.aaik;
import defpackage.aaiw;
import defpackage.aaji;
import defpackage.aajj;
import defpackage.aall;
import defpackage.aaln;
import defpackage.aarn;
import defpackage.kkk;
import defpackage.ksp;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static /* synthetic */ aahs lambda$getComponents$0(aaih aaihVar) {
        aahf aahfVar = (aahf) aaihVar.e(aahf.class);
        Context context = (Context) aaihVar.e(Context.class);
        aaln aalnVar = (aaln) aaihVar.e(aaln.class);
        kkk.k(aahfVar);
        kkk.k(context);
        kkk.k(aalnVar);
        kkk.k(context.getApplicationContext());
        if (aahv.a == null) {
            synchronized (aahv.class) {
                if (aahv.a == null) {
                    Bundle bundle = new Bundle(1);
                    if (aahfVar.g()) {
                        aalnVar.b(aaha.class, new Executor() { // from class: aaht
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new aall() { // from class: aahu
                            @Override // defpackage.aall
                            public final void a() {
                                throw null;
                            }
                        });
                        bundle.putBoolean("dataCollectionDefaultEnabled", aahfVar.f());
                    }
                    aahv.a = new aahv(ksp.a(context, bundle).c);
                }
            }
        }
        return aahv.a;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        aaie aaieVarB = aaif.b(aahs.class);
        aaieVarB.b(new aaiw(new aajj(aaji.class, aahf.class), 1, 0));
        aaieVarB.b(new aaiw(new aajj(aaji.class, Context.class), 1, 0));
        aaieVarB.b(new aaiw(new aajj(aaji.class, aaln.class), 1, 0));
        aaieVarB.c = new aaik() { // from class: aahw
            @Override // defpackage.aaik
            public final Object a(aaih aaihVar) {
                return AnalyticsConnectorRegistrar.lambda$getComponents$0(aaihVar);
            }
        };
        aaieVarB.c(2);
        return Arrays.asList(aaieVarB.a(), aarn.a("fire-analytics", "22.5.0"));
    }
}
