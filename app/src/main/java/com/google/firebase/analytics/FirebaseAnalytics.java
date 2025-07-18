package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.api.internal.ScionActivityInfo;
import defpackage.aahf;
import defpackage.aahr;
import defpackage.aanf;
import defpackage.kkk;
import defpackage.krq;
import defpackage.ksp;
import defpackage.lep;
import defpackage.lvq;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics a;
    private final ksp b;

    public FirebaseAnalytics(ksp kspVar) {
        kkk.k(kspVar);
        this.b = kspVar;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (a == null) {
            synchronized (FirebaseAnalytics.class) {
                if (a == null) {
                    a = new FirebaseAnalytics(ksp.a(context, null));
                }
            }
        }
        return a;
    }

    public static lep getScionFrontendApiImplementation(Context context, Bundle bundle) {
        ksp kspVarA = ksp.a(context, bundle);
        if (kspVarA == null) {
            return null;
        }
        return new aahr(kspVarA);
    }

    public String getFirebaseInstanceId() {
        try {
            Object obj = aanf.a;
            return (String) lvq.e(aanf.b(aahf.a()).a(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        ScionActivityInfo scionActivityInfoA = ScionActivityInfo.a(activity);
        ksp kspVar = this.b;
        kspVar.c(new krq(kspVar, scionActivityInfoA, str, str2));
    }
}
