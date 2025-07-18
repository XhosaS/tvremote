package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdn implements fda {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/cast/info/CastServiceInfoImpl");
    public static final Duration b;
    public final fdq c;
    public final ghp d;
    public final List e;
    public boolean f;
    private final ahbt g;
    private final agte h;
    private fcy i;
    private final agpc j;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(1L);
        durationOfSeconds.getClass();
        b = durationOfSeconds;
    }

    public fdn(final Context context, ahbt ahbtVar, agte agteVar, fdq fdqVar, final hag hagVar, ghp ghpVar) {
        context.getClass();
        ahbtVar.getClass();
        agteVar.getClass();
        hagVar.getClass();
        ghpVar.getClass();
        this.g = ahbtVar;
        this.h = agteVar;
        this.c = fdqVar;
        this.d = ghpVar;
        this.e = new ArrayList();
        this.j = new agpn(new agum() { // from class: fde
            @Override // defpackage.agum
            public final Object a() {
                zdy zdyVar = fdn.a;
                return context.getSharedPreferences(hagVar == hag.g ? "CastServiceInfo_PREFS" : "CastIdRetrievalTask_PREFS", 0);
            }
        });
    }

    private final SharedPreferences l() {
        Object objA = this.j.a();
        objA.getClass();
        return (SharedPreferences) objA;
    }

    @Override // defpackage.fda
    public final zyd a() {
        return ahkr.c(this.g, 0, new fdi(this, null), 3);
    }

    @Override // defpackage.fda
    public final synchronized zyd b() {
        zdy zdyVar = a;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/cast/info/CastServiceInfoImpl", "startLoadingCastInfo", 89, "CastServiceInfoImpl.kt")).u("startLoadingCastInfo");
        fcy fcyVar = this.i;
        if (fcyVar != null && fcyVar.a()) {
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/cast/info/CastServiceInfoImpl", "startLoadingCastInfo", 92, "CastServiceInfoImpl.kt")).u("Cast info is already loaded.");
            return zxn.h(fcyVar);
        }
        zyu zyuVar = new zyu();
        this.e.add(zyuVar);
        if (this.f) {
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/cast/info/CastServiceInfoImpl", "startLoadingCastInfo", 99, "CastServiceInfoImpl.kt")).u("Cast info is loading.");
            return zyuVar;
        }
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/cast/info/CastServiceInfoImpl", "startLoadingCastInfo", 103, "CastServiceInfoImpl.kt")).u("Start new task to load cast info.");
        this.f = true;
        ahal.e(this.g, null, 0, new fdm(this, null), 3);
        return zyuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fda
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.agsw r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.fdf
            if (r0 == 0) goto L13
            r0 = r5
            fdf r0 = (defpackage.fdf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fdf r0 = new fdf
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.agpl.b(r5)
            goto L3a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.agpl.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.e(r0)
            if (r5 == r1) goto L49
        L3a:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r5 = r5.length()
            if (r5 <= 0) goto L43
            goto L44
        L43:
            r3 = 0
        L44:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdn.c(agsw):java.lang.Object");
    }

    @Override // defpackage.fda
    public final Object d(agsw agswVar) {
        return ahal.a(this.h, new fdg(this, null), agswVar);
    }

    @Override // defpackage.fda
    public final Object e(agsw agswVar) {
        return ahal.a(this.h, new fdh(this, null), agswVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fda
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.agsw r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.fdj
            if (r0 == 0) goto L13
            r0 = r9
            fdj r0 = (defpackage.fdj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fdj r0 = new fdj
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            java.lang.String r4 = "com/google/android/apps/tvsearch/cast/info/CastServiceInfoImpl"
            java.lang.String r5 = "loadCastInfo"
            java.lang.String r6 = "CastServiceInfoImpl.kt"
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            defpackage.agpl.b(r9)
            goto L70
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            defpackage.agpl.b(r9)
            zdy r9 = defpackage.fdn.a
            zeo r2 = r9.b()
            r7 = 140(0x8c, float:1.96E-43)
            zeo r2 = r2.q(r4, r5, r7, r6)
            zdv r2 = (defpackage.zdv) r2
            r2.u(r5)
            fcy r2 = r8.i
            if (r2 == 0) goto L66
            boolean r7 = r2.a()
            if (r7 == r3) goto L54
            goto L66
        L54:
            zeo r9 = r9.b()
            r0 = 143(0x8f, float:2.0E-43)
            zeo r9 = r9.q(r4, r5, r0, r6)
            zdv r9 = (defpackage.zdv) r9
            java.lang.String r0 = "Cast info is already loaded. Returning loaded value."
            r9.u(r0)
            return r2
        L66:
            fdq r9 = r8.c
            r0.c = r3
            java.lang.Object r9 = r9.c(r0)
            if (r9 == r1) goto La7
        L70:
            fcy r9 = (defpackage.fcy) r9
            if (r9 == 0) goto L8b
            zdy r0 = defpackage.fdn.a
            zeo r0 = r0.b()
            r1 = 150(0x96, float:2.1E-43)
            zeo r0 = r0.q(r4, r5, r1, r6)
            zdv r0 = (defpackage.zdv) r0
            java.lang.String r1 = "Cast info was successfully loaded. Updating persistent cast info."
            r0.u(r1)
            r8.k(r9)
            return r9
        L8b:
            zdy r0 = defpackage.fdn.a
            zeo r0 = r0.d()
            r1 = 153(0x99, float:2.14E-43)
            zeo r0 = r0.q(r4, r5, r1, r6)
            zdv r0 = (defpackage.zdv) r0
            java.lang.String r1 = "Cast info failed to be loaded. Persisting empty cast info."
            r0.u(r1)
            fcy r0 = new fcy
            r0.<init>()
            r8.k(r0)
            return r9
        La7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdn.f(agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fda
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.agsw r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.fdk
            if (r0 == 0) goto L13
            r0 = r9
            fdk r0 = (defpackage.fdk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fdk r0 = new fdk
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            fcy r0 = r0.d
            defpackage.agpl.b(r9)
            goto L5f
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L34:
            fcy r2 = r0.d
            defpackage.agpl.b(r9)
            goto L4e
        L3a:
            defpackage.agpl.b(r9)
            fcy r9 = r8.i
            fdq r2 = r8.c
            r0.d = r9
            r0.c = r4
            java.lang.Object r2 = r2.b(r0)
            if (r2 == r1) goto Ld2
            r7 = r2
            r2 = r9
            r9 = r7
        L4e:
            fcy r9 = (defpackage.fcy) r9
            if (r9 != 0) goto L62
            fdq r9 = r8.c
            r0.d = r2
            r0.c = r3
            java.lang.Object r9 = r9.a(r0)
            if (r9 == r1) goto Ld2
            r0 = r2
        L5f:
            fcy r9 = (defpackage.fcy) r9
            r2 = r0
        L62:
            java.lang.String r0 = "loadLatestCastInfo"
            java.lang.String r1 = "com/google/android/apps/tvsearch/cast/info/CastServiceInfoImpl"
            java.lang.String r3 = "CastServiceInfoImpl.kt"
            if (r9 == 0) goto L9b
            boolean r4 = defpackage.agvy.c(r9, r2)
            if (r4 != 0) goto L87
            zdy r2 = defpackage.fdn.a
            zeo r2 = r2.b()
            r4 = 170(0xaa, float:2.38E-43)
            zeo r0 = r2.q(r1, r0, r4, r3)
            zdv r0 = (defpackage.zdv) r0
            java.lang.String r1 = "Latest cast info was successfully loaded. Updating persistent cast info."
            r0.u(r1)
            r8.k(r9)
            return r9
        L87:
            zdy r9 = defpackage.fdn.a
            zeo r9 = r9.b()
            r4 = 174(0xae, float:2.44E-43)
            zeo r9 = r9.q(r1, r0, r4, r3)
            zdv r9 = (defpackage.zdv) r9
            java.lang.String r0 = "No new cast info loaded. Returning saved cast info."
            r9.u(r0)
            return r2
        L9b:
            zdy r9 = defpackage.fdn.a
            zeo r5 = r9.b()
            r6 = 177(0xb1, float:2.48E-43)
            zeo r5 = r5.q(r1, r0, r6, r3)
            zdv r5 = (defpackage.zdv) r5
            java.lang.String r6 = "Failed to load latest cast info."
            r5.u(r6)
            if (r2 == 0) goto Lb7
            boolean r5 = r2.a()
            if (r5 != r4) goto Lb7
            return r2
        Lb7:
            zeo r9 = r9.b()
            r2 = 181(0xb5, float:2.54E-43)
            zeo r9 = r9.q(r1, r0, r2, r3)
            zdv r9 = (defpackage.zdv) r9
            java.lang.String r0 = "Cast info failed to be loaded. Persisting empty cast info."
            r9.u(r0)
            fcy r9 = new fcy
            r9.<init>()
            r8.k(r9)
            r9 = 0
            return r9
        Ld2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdn.g(agsw):java.lang.Object");
    }

    @Override // defpackage.fda
    public final void h(agvb agvbVar) {
        ahal.e(this.g, null, 0, new fdl(agvbVar, this, null), 3);
    }

    public final synchronized String i() {
        fcy fcyVar = this.i;
        if (fcyVar != null) {
            return fcyVar.b;
        }
        return l().getString("CastServiceInfo/certificate", null);
    }

    public final synchronized String j() {
        fcy fcyVar = this.i;
        if (fcyVar != null) {
            return fcyVar.a;
        }
        return l().getString("CastServiceInfo/cloud_device_id", null);
    }

    public final synchronized void k(fcy fcyVar) {
        this.i = fcyVar;
        l().edit().putString("CastServiceInfo/cloud_device_id", fcyVar.a).putString("CastServiceInfo/certificate", fcyVar.b).apply();
    }
}
