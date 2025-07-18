package defpackage;

import android.location.Location;
import com.google.android.gms.location.LocationRequest;
import j$.time.Duration;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzo implements gyi {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/platform/location/LocationTask");
    public static final Duration b;
    private static final Duration i;
    private static final LocationRequest j;
    public final ahbt c;
    public final agow d;
    public final agow e;
    public final agow f;
    public Location g;
    public String h;
    private final Executor k;
    private final agow l;
    private final gyx m;
    private final Set n;
    private final Set o;

    static {
        Duration durationOfMinutes = Duration.ofMinutes(30L);
        durationOfMinutes.getClass();
        i = durationOfMinutes;
        b = ztz.a();
        kpe kpeVar = new kpe(durationOfMinutes.toMillis(), null);
        kpeVar.c(100.0f);
        j = kpeVar.a();
    }

    public gzo(ahbt ahbtVar, Executor executor, agow agowVar, agow agowVar2, agow agowVar3, agow agowVar4) {
        ahbtVar.getClass();
        executor.getClass();
        agowVar.getClass();
        agowVar2.getClass();
        agowVar3.getClass();
        agowVar4.getClass();
        this.c = ahbtVar;
        this.k = executor;
        this.l = agowVar;
        this.d = agowVar2;
        this.e = agowVar3;
        this.f = agowVar4;
        this.m = gyx.x;
        Set setSingleton = Collections.singleton(hag.d);
        setSingleton.getClass();
        this.n = setSingleton;
        Set setSingleton2 = Collections.singleton(gyx.j);
        setSingleton2.getClass();
        this.o = setSingleton2;
        this.h = "";
    }

    @Override // defpackage.gzc
    public final int a() {
        return -1073741824;
    }

    @Override // defpackage.gzc
    public final gyx b() {
        return this.m;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.gyi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.agsw r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.gzn
            if (r0 == 0) goto L13
            r0 = r5
            gzn r0 = (defpackage.gzn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gzn r0 = new gzn
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.agpl.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.agpl.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.g(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            zdy r5 = defpackage.gzo.a
            zeo r5 = r5.b()
            r0 = 96
            java.lang.String r1 = "LocationTask.kt"
            java.lang.String r2 = "com/google/android/apps/tvsearch/platform/location/LocationTask"
            java.lang.String r3 = "requestLocationUpdates"
            zeo r5 = r5.q(r2, r3, r0, r1)
            zdv r5 = (defpackage.zdv) r5
            com.google.android.gms.location.LocationRequest r0 = defpackage.gzo.j
            java.lang.String r1 = "Requesting %s"
            r5.x(r1, r0)
            agow r5 = r4.l
            java.lang.Object r5 = r5.a()
            kox r5 = (defpackage.kox) r5
            java.util.concurrent.Executor r1 = r4.k
            gzk r2 = new gzk
            r2.<init>()
            r5.a(r0, r1, r2)
            agpu r5 = defpackage.agpu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gzo.c(agsw):java.lang.Object");
    }

    @Override // defpackage.gyi
    public final Set d() {
        return this.o;
    }

    @Override // defpackage.gyi
    public final Set e() {
        return this.n;
    }

    @Override // defpackage.gyi
    public final int f() {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.agsw r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.gzm
            if (r0 == 0) goto L13
            r0 = r5
            gzm r0 = (defpackage.gzm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gzm r0 = new gzm
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.agpl.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.agpl.b(r5)
            agow r5 = r4.e
            java.lang.Object r5 = r5.a()
            fki r5 = (defpackage.fki) r5
            r0.c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 == r1) goto L87
        L42:
            fog r5 = (defpackage.fog) r5
            java.lang.String r0 = "readLastLocation"
            java.lang.String r1 = "com/google/android/apps/tvsearch/platform/location/LocationTask"
            java.lang.String r2 = "LocationTask.kt"
            if (r5 != 0) goto L60
            zdy r5 = defpackage.gzo.a
            zeo r5 = r5.b()
            r3 = 87
            zeo r5 = r5.q(r1, r0, r3, r2)
            zdv r5 = (defpackage.zdv) r5
            java.lang.String r0 = "No last known location"
            r5.u(r0)
            goto L84
        L60:
            android.location.Location r3 = defpackage.gzp.a(r5)
            r4.g = r3
            java.lang.String r5 = r5.d
            r5.getClass()
            r4.h = r5
            zdy r5 = defpackage.gzo.a
            zeo r5 = r5.b()
            r3 = 91
            zeo r5 = r5.q(r1, r0, r3, r2)
            zdv r5 = (defpackage.zdv) r5
            android.location.Location r0 = r4.g
            java.lang.String r1 = r4.h
            java.lang.String r2 = "Last known %s, countryCode=%s"
            r5.F(r2, r0, r1)
        L84:
            agpu r5 = defpackage.agpu.a
            return r5
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gzo.g(agsw):java.lang.Object");
    }
}
