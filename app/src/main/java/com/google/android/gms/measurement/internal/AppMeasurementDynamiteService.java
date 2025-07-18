package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import com.google.android.gms.measurement.api.internal.ScionActivityInfo;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.UploadBatchesCriteria;
import defpackage.kkk;
import defpackage.kme;
import defpackage.kmf;
import defpackage.kqy;
import defpackage.krc;
import defpackage.krf;
import defpackage.krh;
import defpackage.krj;
import defpackage.kst;
import defpackage.ksz;
import defpackage.kta;
import defpackage.ktb;
import defpackage.ktc;
import defpackage.ktd;
import defpackage.kte;
import defpackage.ktf;
import defpackage.ktg;
import defpackage.ktx;
import defpackage.kzz;
import defpackage.lab;
import defpackage.lbh;
import defpackage.lbk;
import defpackage.ldo;
import defpackage.ldq;
import defpackage.ldu;
import defpackage.ldw;
import defpackage.leb;
import defpackage.led;
import defpackage.lee;
import defpackage.lef;
import defpackage.leg;
import defpackage.len;
import defpackage.leo;
import defpackage.lew;
import defpackage.ley;
import defpackage.lez;
import defpackage.lfg;
import defpackage.lio;
import defpackage.we;
import j$.util.Objects;
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends kqy {
    public lbk a = null;
    private final Map b = new we();

    public static /* synthetic */ void $r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(AppMeasurementDynamiteService appMeasurementDynamiteService, krf krfVar) {
        try {
            krfVar.e();
        } catch (RemoteException e) {
            lbk lbkVar = appMeasurementDynamiteService.a;
            kkk.k(lbkVar);
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.f.b("Failed to call IDynamiteUploadBatchesCallback", e);
        }
    }

    private final void c() {
        if (this.a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void d(krc krcVar, String str) {
        c();
        lbk lbkVar = this.a;
        lio lioVar = lbkVar.i;
        lbkVar.m(lioVar);
        lioVar.U(krcVar, str);
    }

    @Override // defpackage.kqz
    public void beginAdUnitExposure(String str, long j) {
        c();
        lbk lbkVar = this.a;
        kst kstVar = lbkVar.m;
        lbkVar.l(kstVar);
        kstVar.a(str, j);
    }

    @Override // defpackage.kqz
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        c();
        lbk lbkVar = this.a;
        leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        lbk lbkVar2 = leoVar.y;
        leoVar.M(str, str2, bundle);
    }

    @Override // defpackage.kqz
    public void clearMeasurementEnabled(long j) {
        c();
        lbk lbkVar = this.a;
        leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        leoVar.D(null);
    }

    @Override // defpackage.kqz
    public void endAdUnitExposure(String str, long j) {
        c();
        lbk lbkVar = this.a;
        kst kstVar = lbkVar.m;
        lbkVar.l(kstVar);
        kstVar.b(str, j);
    }

    @Override // defpackage.kqz
    public void generateEventId(krc krcVar) {
        c();
        lbk lbkVar = this.a;
        lio lioVar = lbkVar.i;
        lbkVar.m(lioVar);
        long jV = lioVar.v();
        c();
        lbk lbkVar2 = this.a;
        lio lioVar2 = lbkVar2.i;
        lbkVar2.m(lioVar2);
        lioVar2.T(krcVar, jV);
    }

    @Override // defpackage.kqz
    public void getAppInstanceId(krc krcVar) {
        c();
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.h(new ksz(this, krcVar));
    }

    @Override // defpackage.kqz
    public void getCachedAppInstanceId(krc krcVar) {
        c();
        lbk lbkVar = this.a;
        leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        d(krcVar, leoVar.j());
    }

    @Override // defpackage.kqz
    public void getConditionalUserProperties(String str, String str2, krc krcVar) {
        c();
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.h(new ktd(this, krcVar, str, str2));
    }

    @Override // defpackage.kqz
    public void getCurrentScreenClass(krc krcVar) {
        c();
        lbk lbkVar = this.a;
        leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        d(krcVar, leoVar.k());
    }

    @Override // defpackage.kqz
    public void getCurrentScreenName(krc krcVar) {
        c();
        lbk lbkVar = this.a;
        leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        d(krcVar, leoVar.l());
    }

    @Override // defpackage.kqz
    public void getGmpAppId(krc krcVar) {
        String strB;
        c();
        lbk lbkVar = this.a;
        leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        try {
            strB = ley.b(leoVar.y.a, leoVar.y.o);
        } catch (IllegalStateException e) {
            lbk lbkVar2 = leoVar.y;
            lab labVar = lbkVar2.f;
            lbkVar2.o(labVar);
            labVar.c.b("getGoogleAppId failed with exception", e);
            strB = null;
        }
        d(krcVar, strB);
    }

    @Override // defpackage.kqz
    public void getMaxUserProperties(String str, krc krcVar) {
        c();
        lbk lbkVar = this.a;
        leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        kkk.h(str);
        ktx ktxVar = leoVar.y.d;
        c();
        lbk lbkVar2 = this.a;
        lio lioVar = lbkVar2.i;
        lbkVar2.m(lioVar);
        lioVar.S(krcVar, 25);
    }

    @Override // defpackage.kqz
    public void getSessionId(krc krcVar) {
        c();
        lbk lbkVar = this.a;
        leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        lbk lbkVar2 = leoVar.y;
        lbh lbhVar = lbkVar2.g;
        lbkVar2.o(lbhVar);
        lbhVar.h(new leb(leoVar, krcVar));
    }

    @Override // defpackage.kqz
    public void getTestFlag(krc krcVar, int i) {
        c();
        if (i == 0) {
            lbk lbkVar = this.a;
            lio lioVar = lbkVar.i;
            lbkVar.m(lioVar);
            lbk lbkVar2 = this.a;
            leo leoVar = lbkVar2.l;
            lbkVar2.n(leoVar);
            AtomicReference atomicReference = new AtomicReference();
            lbk lbkVar3 = leoVar.y;
            lbh lbhVar = lbkVar3.g;
            lbkVar3.o(lbhVar);
            lioVar.U(krcVar, (String) lbhVar.b(atomicReference, 15000L, "String test flag value", new led(leoVar, atomicReference)));
            return;
        }
        if (i == 1) {
            lbk lbkVar4 = this.a;
            lio lioVar2 = lbkVar4.i;
            lbkVar4.m(lioVar2);
            lbk lbkVar5 = this.a;
            leo leoVar2 = lbkVar5.l;
            lbkVar5.n(leoVar2);
            AtomicReference atomicReference2 = new AtomicReference();
            lbk lbkVar6 = leoVar2.y;
            lbh lbhVar2 = lbkVar6.g;
            lbkVar6.o(lbhVar2);
            lioVar2.T(krcVar, ((Long) lbhVar2.b(atomicReference2, 15000L, "long test flag value", new lee(leoVar2, atomicReference2))).longValue());
            return;
        }
        if (i == 2) {
            lbk lbkVar7 = this.a;
            lio lioVar3 = lbkVar7.i;
            lbkVar7.m(lioVar3);
            lbk lbkVar8 = this.a;
            leo leoVar3 = lbkVar8.l;
            lbkVar8.n(leoVar3);
            AtomicReference atomicReference3 = new AtomicReference();
            lbk lbkVar9 = leoVar3.y;
            lbh lbhVar3 = lbkVar9.g;
            lbkVar9.o(lbhVar3);
            double dDoubleValue = ((Double) lbhVar3.b(atomicReference3, 15000L, "double test flag value", new leg(leoVar3, atomicReference3))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                krcVar.f(bundle);
                return;
            } catch (RemoteException e) {
                lbk lbkVar10 = lioVar3.y;
                lab labVar = lbkVar10.f;
                lbkVar10.o(labVar);
                labVar.f.b("Error returning double value to wrapper", e);
                return;
            }
        }
        if (i == 3) {
            lbk lbkVar11 = this.a;
            lio lioVar4 = lbkVar11.i;
            lbkVar11.m(lioVar4);
            lbk lbkVar12 = this.a;
            leo leoVar4 = lbkVar12.l;
            lbkVar12.n(leoVar4);
            AtomicReference atomicReference4 = new AtomicReference();
            lbk lbkVar13 = leoVar4.y;
            lbh lbhVar4 = lbkVar13.g;
            lbkVar13.o(lbhVar4);
            lioVar4.S(krcVar, ((Integer) lbhVar4.b(atomicReference4, 15000L, "int test flag value", new lef(leoVar4, atomicReference4))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        lbk lbkVar14 = this.a;
        lio lioVar5 = lbkVar14.i;
        lbkVar14.m(lioVar5);
        lbk lbkVar15 = this.a;
        leo leoVar5 = lbkVar15.l;
        lbkVar15.n(leoVar5);
        AtomicReference atomicReference5 = new AtomicReference();
        lbk lbkVar16 = leoVar5.y;
        lbh lbhVar5 = lbkVar16.g;
        lbkVar16.o(lbhVar5);
        lioVar5.O(krcVar, ((Boolean) lbhVar5.b(atomicReference5, 15000L, "boolean test flag value", new ldu(leoVar5, atomicReference5))).booleanValue());
    }

    @Override // defpackage.kqz
    public void getUserProperties(String str, String str2, boolean z, krc krcVar) {
        c();
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.h(new ktb(this, krcVar, str, str2, z));
    }

    @Override // defpackage.kqz
    public void initForTests(Map map) {
        c();
    }

    @Override // defpackage.kqz
    public void initialize(kme kmeVar, InitializationParams initializationParams, long j) {
        lbk lbkVar = this.a;
        if (lbkVar == null) {
            Context context = (Context) kmf.c(kmeVar);
            kkk.k(context);
            this.a = lbk.i(context, initializationParams, Long.valueOf(j));
        } else {
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.f.a("Attempting to initialize multiple times");
        }
    }

    @Override // defpackage.kqz
    public void isDataCollectionEnabled(krc krcVar) {
        c();
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.h(new kte(this, krcVar));
    }

    @Override // defpackage.kqz
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        c();
        lbk lbkVar = this.a;
        leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        leoVar.s(str, str2, bundle, z, z2, j);
    }

    @Override // defpackage.kqz
    public void logEventAndBundle(String str, String str2, Bundle bundle, krc krcVar, long j) {
        c();
        kkk.h(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        EventParcel eventParcel = new EventParcel(str2, new EventParams(bundle), "app", j);
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.h(new kta(this, krcVar, eventParcel, str));
    }

    @Override // defpackage.kqz
    public void logHealthData(int i, String str, kme kmeVar, kme kmeVar2, kme kmeVar3) {
        c();
        Object objC = kmeVar == null ? null : kmf.c(kmeVar);
        Object objC2 = kmeVar2 == null ? null : kmf.c(kmeVar2);
        Object objC3 = kmeVar3 != null ? kmf.c(kmeVar3) : null;
        lbk lbkVar = this.a;
        lab labVar = lbkVar.f;
        lbkVar.o(labVar);
        labVar.h(i, true, false, str, objC, objC2, objC3);
    }

    @Override // defpackage.kqz
    public void onActivityCreated(kme kmeVar, Bundle bundle, long j) {
        c();
        Activity activity = (Activity) kmf.c(kmeVar);
        kkk.k(activity);
        onActivityCreatedByScionActivityInfo(ScionActivityInfo.a(activity), bundle, j);
    }

    @Override // defpackage.kqz
    public void onActivityCreatedByScionActivityInfo(ScionActivityInfo scionActivityInfo, Bundle bundle, long j) {
        c();
        lbk lbkVar = this.a;
        leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        len lenVar = leoVar.a;
        if (lenVar != null) {
            lbk lbkVar2 = this.a;
            leo leoVar2 = lbkVar2.l;
            lbkVar2.n(leoVar2);
            leoVar2.o();
            lenVar.a(scionActivityInfo, bundle);
        }
    }

    @Override // defpackage.kqz
    public void onActivityDestroyed(kme kmeVar, long j) {
        c();
        Activity activity = (Activity) kmf.c(kmeVar);
        kkk.k(activity);
        onActivityDestroyedByScionActivityInfo(ScionActivityInfo.a(activity), j);
    }

    @Override // defpackage.kqz
    public void onActivityDestroyedByScionActivityInfo(ScionActivityInfo scionActivityInfo, long j) {
        c();
        lbk lbkVar = this.a;
        leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        len lenVar = leoVar.a;
        if (lenVar != null) {
            lbk lbkVar2 = this.a;
            leo leoVar2 = lbkVar2.l;
            lbkVar2.n(leoVar2);
            leoVar2.o();
            lenVar.b(scionActivityInfo);
        }
    }

    @Override // defpackage.kqz
    public void onActivityPaused(kme kmeVar, long j) {
        c();
        Activity activity = (Activity) kmf.c(kmeVar);
        kkk.k(activity);
        onActivityPausedByScionActivityInfo(ScionActivityInfo.a(activity), j);
    }

    @Override // defpackage.kqz
    public void onActivityPausedByScionActivityInfo(ScionActivityInfo scionActivityInfo, long j) {
        c();
        lbk lbkVar = this.a;
        leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        len lenVar = leoVar.a;
        if (lenVar != null) {
            lbk lbkVar2 = this.a;
            leo leoVar2 = lbkVar2.l;
            lbkVar2.n(leoVar2);
            leoVar2.o();
            lenVar.c(scionActivityInfo);
        }
    }

    @Override // defpackage.kqz
    public void onActivityResumed(kme kmeVar, long j) {
        c();
        Activity activity = (Activity) kmf.c(kmeVar);
        kkk.k(activity);
        onActivityResumedByScionActivityInfo(ScionActivityInfo.a(activity), j);
    }

    @Override // defpackage.kqz
    public void onActivityResumedByScionActivityInfo(ScionActivityInfo scionActivityInfo, long j) {
        c();
        lbk lbkVar = this.a;
        leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        len lenVar = leoVar.a;
        if (lenVar != null) {
            lbk lbkVar2 = this.a;
            leo leoVar2 = lbkVar2.l;
            lbkVar2.n(leoVar2);
            leoVar2.o();
            lenVar.d(scionActivityInfo);
        }
    }

    @Override // defpackage.kqz
    public void onActivitySaveInstanceState(kme kmeVar, krc krcVar, long j) {
        c();
        Activity activity = (Activity) kmf.c(kmeVar);
        kkk.k(activity);
        onActivitySaveInstanceStateByScionActivityInfo(ScionActivityInfo.a(activity), krcVar, j);
    }

    @Override // defpackage.kqz
    public void onActivitySaveInstanceStateByScionActivityInfo(ScionActivityInfo scionActivityInfo, krc krcVar, long j) {
        c();
        lbk lbkVar = this.a;
        leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        len lenVar = leoVar.a;
        Bundle bundle = new Bundle();
        if (lenVar != null) {
            lbk lbkVar2 = this.a;
            leo leoVar2 = lbkVar2.l;
            lbkVar2.n(leoVar2);
            leoVar2.o();
            lenVar.e(scionActivityInfo, bundle);
        }
        try {
            krcVar.f(bundle);
        } catch (RemoteException e) {
            lbk lbkVar3 = this.a;
            lab labVar = lbkVar3.f;
            lbkVar3.o(labVar);
            labVar.f.b("Error returning bundle value to wrapper", e);
        }
    }

    @Override // defpackage.kqz
    public void onActivityStarted(kme kmeVar, long j) {
        c();
        Activity activity = (Activity) kmf.c(kmeVar);
        kkk.k(activity);
        onActivityStartedByScionActivityInfo(ScionActivityInfo.a(activity), j);
    }

    @Override // defpackage.kqz
    public void onActivityStartedByScionActivityInfo(ScionActivityInfo scionActivityInfo, long j) {
        c();
        lbk lbkVar = this.a;
        leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        if (leoVar.a != null) {
            lbk lbkVar2 = this.a;
            leo leoVar2 = lbkVar2.l;
            lbkVar2.n(leoVar2);
            leoVar2.o();
        }
    }

    @Override // defpackage.kqz
    public void onActivityStopped(kme kmeVar, long j) {
        c();
        Activity activity = (Activity) kmf.c(kmeVar);
        kkk.k(activity);
        onActivityStoppedByScionActivityInfo(ScionActivityInfo.a(activity), j);
    }

    @Override // defpackage.kqz
    public void onActivityStoppedByScionActivityInfo(ScionActivityInfo scionActivityInfo, long j) {
        c();
        lbk lbkVar = this.a;
        leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        if (leoVar.a != null) {
            lbk lbkVar2 = this.a;
            leo leoVar2 = lbkVar2.l;
            lbkVar2.n(leoVar2);
            leoVar2.o();
        }
    }

    @Override // defpackage.kqz
    public void performAction(Bundle bundle, krc krcVar, long j) {
        c();
        krcVar.f(null);
    }

    @Override // defpackage.kqz
    public void registerOnMeasurementEventListener(krh krhVar) {
        ktg ktgVar;
        c();
        Map map = this.b;
        synchronized (map) {
            ktgVar = (ktg) map.get(Integer.valueOf(krhVar.e()));
            if (ktgVar == null) {
                ktgVar = new ktg(this, krhVar);
                map.put(Integer.valueOf(krhVar.e()), ktgVar);
            }
        }
        lbk lbkVar = this.a;
        leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        lbk lbkVar2 = leoVar.y;
        leoVar.a();
        if (leoVar.b.add(ktgVar)) {
            return;
        }
        lbk lbkVar3 = leoVar.y;
        lab labVar = lbkVar3.f;
        lbkVar3.o(labVar);
        labVar.f.a("OnEventListener already registered");
    }

    @Override // defpackage.kqz
    public void resetAnalyticsData(long j) {
        c();
        lbk lbkVar = this.a;
        leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        leoVar.c.set(null);
        lbk lbkVar2 = leoVar.y;
        lbh lbhVar = lbkVar2.g;
        lbkVar2.o(lbhVar);
        lbhVar.h(new ldw(leoVar, j));
    }

    @Override // defpackage.kqz
    public void retrieveAndUploadBatches(final krf krfVar) throws MalformedURLException {
        c();
        lbk lbkVar = this.a;
        final leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        Runnable runnable = new Runnable() { // from class: ksy
            @Override // java.lang.Runnable
            public final void run() {
                AppMeasurementDynamiteService.$r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(this.a, krfVar);
            }
        };
        lbk lbkVar2 = leoVar.y;
        leoVar.a();
        lbk lbkVar3 = leoVar.y;
        lbh lbhVar = lbkVar3.g;
        lbkVar3.o(lbhVar);
        if (lbhVar.k()) {
            lab labVar = lbkVar3.f;
            lbkVar3.o(labVar);
            labVar.c.a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        lbkVar3.o(lbhVar);
        if (Thread.currentThread() == lbhVar.c) {
            lab labVar2 = lbkVar3.f;
            lbkVar3.o(labVar2);
            labVar2.c.a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        if (lbkVar3.c.a()) {
            lab labVar3 = lbkVar3.f;
            lbkVar3.o(labVar3);
            labVar3.c.a("Cannot retrieve and upload batches from main thread");
            return;
        }
        lab labVar4 = lbkVar3.f;
        lbkVar3.o(labVar4);
        kzz kzzVar = labVar4.k;
        kzzVar.a("[sgtm] Started client-side batch upload work.");
        boolean z = false;
        int size = 0;
        int i = 0;
        while (!z) {
            lbkVar3.o(labVar4);
            kzzVar.a("[sgtm] Getting upload batches from service (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            lbkVar3.o(lbhVar);
            lbhVar.b(atomicReference, 10000L, "[sgtm] Getting upload batches", new Runnable() { // from class: lde
                @Override // java.lang.Runnable
                public final void run() {
                    final lgp lgpVarK = leoVar.y.k();
                    final UploadBatchesCriteria uploadBatchesCriteriaA = UploadBatchesCriteria.a(lex.SGTM_CLIENT);
                    lgpVarK.g();
                    lgpVarK.a();
                    final AppMetadata appMetadataI = lgpVarK.i(false);
                    final AtomicReference atomicReference2 = atomicReference;
                    lgpVarK.p(new Runnable() { // from class: lfl
                        @Override // java.lang.Runnable
                        public final void run() {
                            kzj kzjVar;
                            lgp lgpVar = lgpVarK;
                            AppMetadata appMetadata = appMetadataI;
                            AtomicReference atomicReference3 = atomicReference2;
                            UploadBatchesCriteria uploadBatchesCriteria = uploadBatchesCriteriaA;
                            synchronized (atomicReference3) {
                                try {
                                    kzjVar = lgpVar.b;
                                } catch (RemoteException e) {
                                    lbk lbkVar4 = lgpVar.y;
                                    lab labVar5 = lbkVar4.f;
                                    lbkVar4.o(labVar5);
                                    labVar5.c.b("[sgtm] Failed to get upload batches; remote exception", e);
                                    atomicReference3.notifyAll();
                                }
                                if (kzjVar != null) {
                                    kzjVar.o(appMetadata, uploadBatchesCriteria, new lfo(lgpVar, atomicReference3));
                                    lgpVar.o();
                                } else {
                                    lbk lbkVar5 = lgpVar.y;
                                    lab labVar6 = lbkVar5.f;
                                    lbkVar5.o(labVar6);
                                    labVar6.c.a("[sgtm] Failed to get upload batches; not connected to service");
                                }
                            }
                        }
                    });
                }
            });
            UploadBatchesParcel uploadBatchesParcel = (UploadBatchesParcel) atomicReference.get();
            if (uploadBatchesParcel == null) {
                break;
            }
            List list = uploadBatchesParcel.a;
            if (!list.isEmpty()) {
                lbkVar3.o(labVar4);
                kzzVar.b("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
                size += list.size();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    lew lewVarI = leoVar.i((UploadBatchParcel) it.next());
                    if (lewVarI == lew.SUCCESS) {
                        i++;
                    } else if (lewVarI == lew.BACKOFF) {
                        z = true;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        lbkVar3.o(labVar4);
        kzzVar.c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(size), Integer.valueOf(i));
        runnable.run();
    }

    @Override // defpackage.kqz
    public void setConditionalUserProperty(Bundle bundle, long j) {
        c();
        if (bundle == null) {
            lbk lbkVar = this.a;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.a("Conditional user property must not be null");
            return;
        }
        lbk lbkVar2 = this.a;
        leo leoVar = lbkVar2.l;
        lbkVar2.n(leoVar);
        leoVar.A(bundle, j);
    }

    @Override // defpackage.kqz
    public void setConsentThirdParty(Bundle bundle, long j) {
        c();
        lbk lbkVar = this.a;
        leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        leoVar.B(bundle, -20, j);
    }

    @Override // defpackage.kqz
    public void setCurrentScreen(kme kmeVar, String str, String str2, long j) {
        c();
        Activity activity = (Activity) kmf.c(kmeVar);
        kkk.k(activity);
        setCurrentScreenByScionActivityInfo(ScionActivityInfo.a(activity), str, str2, j);
    }

    @Override // defpackage.kqz
    public void setCurrentScreenByScionActivityInfo(ScionActivityInfo scionActivityInfo, String str, String str2, long j) {
        c();
        lbk lbkVar = this.a;
        lfg lfgVar = lbkVar.k;
        lbkVar.n(lfgVar);
        lbk lbkVar2 = lfgVar.y;
        ktx ktxVar = lbkVar2.d;
        if (!ktxVar.v()) {
            lab labVar = lbkVar2.f;
            lbkVar2.o(labVar);
            labVar.h.a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        lez lezVar = lfgVar.a;
        if (lezVar == null) {
            lab labVar2 = lbkVar2.f;
            lbkVar2.o(labVar2);
            labVar2.h.a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        Map map = lfgVar.d;
        Integer numValueOf = Integer.valueOf(scionActivityInfo.a);
        if (map.get(numValueOf) == null) {
            lab labVar3 = lbkVar2.f;
            lbkVar2.o(labVar3);
            labVar3.h.a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = lfgVar.o(scionActivityInfo.b);
        }
        String str3 = lezVar.b;
        String str4 = lezVar.a;
        boolean zEquals = Objects.equals(str3, str2);
        boolean zEquals2 = Objects.equals(str4, str);
        if (zEquals && zEquals2) {
            lab labVar4 = lbkVar2.f;
            lbkVar2.o(labVar4);
            labVar4.h.a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > ktxVar.c(null, false))) {
            lab labVar5 = lbkVar2.f;
            lbkVar2.o(labVar5);
            labVar5.h.b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > ktxVar.c(null, false))) {
            lab labVar6 = lbkVar2.f;
            lbkVar2.o(labVar6);
            labVar6.h.b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        lab labVar7 = lbkVar2.f;
        lbkVar2.o(labVar7);
        labVar7.k.c("Setting current screen to name, class", str == null ? "null" : str, str2);
        lio lioVar = lbkVar2.i;
        lbkVar2.m(lioVar);
        lez lezVar2 = new lez(str, str2, lioVar.v());
        map.put(numValueOf, lezVar2);
        lfgVar.k(scionActivityInfo.b, lezVar2, true);
    }

    @Override // defpackage.kqz
    public void setDataCollectionEnabled(boolean z) {
        c();
        lbk lbkVar = this.a;
        leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        leoVar.a();
        lbk lbkVar2 = leoVar.y;
        lbk lbkVar3 = leoVar.y;
        lbh lbhVar = lbkVar3.g;
        lbkVar3.o(lbhVar);
        lbhVar.h(new ldo(leoVar, z));
    }

    @Override // defpackage.kqz
    public void setDefaultEventParameters(Bundle bundle) {
        c();
        lbk lbkVar = this.a;
        final leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        lbk lbkVar2 = leoVar.y;
        lbh lbhVar = lbkVar2.g;
        lbkVar2.o(lbhVar);
        lbhVar.h(new Runnable() { // from class: ldd
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                Bundle bundle3;
                int i;
                leo leoVar2 = leoVar;
                Bundle bundle4 = bundle2;
                if (bundle4.isEmpty()) {
                    bundle3 = bundle4;
                } else {
                    lbk lbkVar3 = leoVar2.y;
                    lao laoVar = lbkVar3.e;
                    lbkVar3.m(laoVar);
                    bundle3 = new Bundle(laoVar.x.a());
                    Iterator<String> it = bundle4.keySet().iterator();
                    while (true) {
                        i = 0;
                        if (!it.hasNext()) {
                            break;
                        }
                        String next = it.next();
                        Object obj = bundle4.get(next);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            lio lioVar = lbkVar3.i;
                            lbkVar3.m(lioVar);
                            if (lioVar.aj(obj)) {
                                lbkVar3.m(lioVar);
                                lioVar.M(leoVar2.n, null, 27, null, null, 0);
                            }
                            lab labVar = lbkVar3.f;
                            lbkVar3.o(labVar);
                            labVar.h.c("Invalid default event parameter type. Name, value", next, obj);
                        } else if (lio.am(next)) {
                            lab labVar2 = lbkVar3.f;
                            lbkVar3.o(labVar2);
                            labVar2.h.b("Invalid default event parameter name. Name", next);
                        } else if (obj == null) {
                            bundle3.remove(next);
                        } else {
                            lio lioVar2 = lbkVar3.i;
                            lbkVar3.m(lioVar2);
                            if (lioVar2.ad("param", next, lbkVar3.d.c(null, false), obj)) {
                                lbkVar3.m(lioVar2);
                                lioVar2.N(bundle3, next, obj);
                            }
                        }
                    }
                    lio lioVar3 = lbkVar3.i;
                    lbkVar3.m(lioVar3);
                    int iE = lbkVar3.d.e();
                    if (bundle3.size() > iE) {
                        for (String str : new TreeSet(bundle3.keySet())) {
                            i++;
                            if (i > iE) {
                                bundle3.remove(str);
                            }
                        }
                        lbkVar3.m(lioVar3);
                        lioVar3.M(leoVar2.n, null, 26, null, null, 0);
                        lab labVar3 = lbkVar3.f;
                        lbkVar3.o(labVar3);
                        labVar3.h.a("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                }
                lbk lbkVar4 = leoVar2.y;
                lao laoVar2 = lbkVar4.e;
                lbkVar4.m(laoVar2);
                laoVar2.x.b(bundle3);
                if (!bundle4.isEmpty() || lbkVar4.d.t(null, kzg.aW)) {
                    leoVar2.y.k().t(bundle3);
                }
            }
        });
    }

    @Override // defpackage.kqz
    public void setEventInterceptor(krh krhVar) {
        c();
        ktf ktfVar = new ktf(this, krhVar);
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        if (lbhVar.k()) {
            lbk lbkVar2 = this.a;
            leo leoVar = lbkVar2.l;
            lbkVar2.n(leoVar);
            leoVar.K(ktfVar);
            return;
        }
        lbk lbkVar3 = this.a;
        lbh lbhVar2 = lbkVar3.g;
        lbkVar3.o(lbhVar2);
        lbhVar2.h(new ktc(this, ktfVar));
    }

    @Override // defpackage.kqz
    public void setInstanceIdProvider(krj krjVar) {
        c();
    }

    @Override // defpackage.kqz
    public void setMeasurementEnabled(boolean z, long j) {
        c();
        lbk lbkVar = this.a;
        leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        leoVar.D(Boolean.valueOf(z));
    }

    @Override // defpackage.kqz
    public void setMinimumSessionDuration(long j) {
        c();
    }

    @Override // defpackage.kqz
    public void setSessionTimeoutDuration(long j) {
        c();
        lbk lbkVar = this.a;
        leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        lbk lbkVar2 = leoVar.y;
        lbk lbkVar3 = leoVar.y;
        lbh lbhVar = lbkVar3.g;
        lbkVar3.o(lbhVar);
        lbhVar.h(new ldq(leoVar, j));
    }

    @Override // defpackage.kqz
    public void setSgtmDebugInfo(Intent intent) {
        c();
        lbk lbkVar = this.a;
        leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        Uri data = intent.getData();
        if (data == null) {
            lbk lbkVar2 = leoVar.y;
            lab labVar = lbkVar2.f;
            lbkVar2.o(labVar);
            labVar.i.a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            lbk lbkVar3 = leoVar.y;
            lab labVar2 = lbkVar3.f;
            lbkVar3.o(labVar2);
            labVar2.i.a("[sgtm] Preview Mode was not enabled.");
            lbkVar3.d.a = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        lbk lbkVar4 = leoVar.y;
        lab labVar3 = lbkVar4.f;
        lbkVar4.o(labVar3);
        labVar3.i.b("[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
        lbkVar4.d.a = queryParameter2;
    }

    @Override // defpackage.kqz
    public void setUserId(final String str, long j) {
        c();
        lbk lbkVar = this.a;
        final leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        if (str != null && TextUtils.isEmpty(str)) {
            lbk lbkVar2 = leoVar.y;
            lab labVar = lbkVar2.f;
            lbkVar2.o(labVar);
            labVar.f.a("User ID must be non-empty or null");
            return;
        }
        lbk lbkVar3 = leoVar.y;
        lbh lbhVar = lbkVar3.g;
        lbkVar3.o(lbhVar);
        lbhVar.h(new Runnable() { // from class: ldi
            @Override // java.lang.Runnable
            public final void run() {
                lbk lbkVar4 = leoVar.y;
                kzq kzqVarE = lbkVar4.e();
                String str2 = kzqVarE.f;
                String str3 = str;
                boolean z = false;
                if (str2 != null && !str2.equals(str3)) {
                    z = true;
                }
                kzqVarE.f = str3;
                if (z) {
                    lbkVar4.e().k();
                }
            }
        });
        leoVar.H(null, "_id", str, true, j);
    }

    @Override // defpackage.kqz
    public void setUserProperty(String str, String str2, kme kmeVar, boolean z, long j) {
        c();
        Object objC = kmf.c(kmeVar);
        lbk lbkVar = this.a;
        leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        leoVar.H(str, str2, objC, z, j);
    }

    @Override // defpackage.kqz
    public void unregisterOnMeasurementEventListener(krh krhVar) {
        ktg ktgVar;
        c();
        Map map = this.b;
        synchronized (map) {
            ktgVar = (ktg) map.remove(Integer.valueOf(krhVar.e()));
        }
        if (ktgVar == null) {
            ktgVar = new ktg(this, krhVar);
        }
        lbk lbkVar = this.a;
        leo leoVar = lbkVar.l;
        lbkVar.n(leoVar);
        lbk lbkVar2 = leoVar.y;
        leoVar.a();
        if (leoVar.b.remove(ktgVar)) {
            return;
        }
        lbk lbkVar3 = leoVar.y;
        lab labVar = lbkVar3.f;
        lbkVar3.o(labVar);
        labVar.f.a("OnEventListener had not been registered");
    }

    @Override // defpackage.kqz
    public void setConsent(Bundle bundle, long j) {
    }
}
