package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import j$.time.Duration;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grt implements grl {
    public static final grp a = new grp();
    public static final zdy b = zdy.h("com/google/android/apps/tvsearch/performers/OpenProviderPerformerImpl");
    public static final Duration c;
    private final List A;
    private final eyx B;
    public final fby d;
    public final agow e;
    public final agow f;
    public final agow g;
    public final gfr h;
    public final gzu i;
    public final exl j;
    public final gtu k;
    public final gmd l;
    public final gof m;
    public final PackageManager n;
    public final agow o;
    public final agow p;
    public final fex q;
    public final jnr r;
    private final agow s;
    private final fiu t;
    private final ahbt u;
    private final gph v;
    private final glq w;
    private final agow x;
    private final ztw y;
    private final ghr z;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(30L);
        durationOfSeconds.getClass();
        c = durationOfSeconds;
    }

    public grt(agow agowVar, fby fbyVar, fiu fiuVar, ahbt ahbtVar, agow agowVar2, agow agowVar3, agow agowVar4, gfr gfrVar, gph gphVar, gzu gzuVar, exl exlVar, eyx eyxVar, gtu gtuVar, glq glqVar, gmd gmdVar, agow agowVar5, gof gofVar, PackageManager packageManager, agow agowVar6, agow agowVar7, fex fexVar, jnr jnrVar, ztw ztwVar, ghr ghrVar) {
        agowVar.getClass();
        fbyVar.getClass();
        fiuVar.getClass();
        ahbtVar.getClass();
        agowVar3.getClass();
        gfrVar.getClass();
        gzuVar.getClass();
        eyxVar.getClass();
        gtuVar.getClass();
        gmdVar.getClass();
        agowVar5.getClass();
        gofVar.getClass();
        agowVar6.getClass();
        agowVar7.getClass();
        fexVar.getClass();
        jnrVar.getClass();
        ztwVar.getClass();
        ghrVar.getClass();
        this.s = agowVar;
        this.d = fbyVar;
        this.t = fiuVar;
        this.u = ahbtVar;
        this.e = agowVar2;
        this.f = agowVar3;
        this.g = agowVar4;
        this.h = gfrVar;
        this.v = gphVar;
        this.i = gzuVar;
        this.j = exlVar;
        this.B = eyxVar;
        this.k = gtuVar;
        this.w = glqVar;
        this.l = gmdVar;
        this.x = agowVar5;
        this.m = gofVar;
        this.n = packageManager;
        this.o = agowVar6;
        this.p = agowVar7;
        this.q = fexVar;
        this.r = jnrVar;
        this.y = ztwVar;
        this.z = ghrVar;
        this.A = new ArrayList();
    }

    private final zyd k(final String str) {
        return xt.a(new xq() { // from class: grm
            @Override // defpackage.xq
            public final Object a(final xo xoVar) {
                ((zdv) grt.b.b().q("com/google/android/apps/tvsearch/performers/OpenProviderPerformerImpl", "resultFutureWaitingForInAppQueryRoutingToken$lambda$14", 834, "OpenProviderPerformerImpl.kt")).u("Waiting for in-app query routing token.");
                final grt grtVar = this.a;
                Runnable runnable = new Runnable() { // from class: grn
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((zdv) grt.b.c().q("com/google/android/apps/tvsearch/performers/OpenProviderPerformerImpl", "resultFutureWaitingForInAppQueryRoutingToken$lambda$14$lambda$11", 836, "OpenProviderPerformerImpl.kt")).u("Timing out. No in-app query routing token from target app.");
                        grtVar.d.z(null);
                        xhe xheVar = xhe.a;
                        xhb xhbVar = new xhb();
                        xjv xjvVar = xjv.a;
                        xjs xjsVar = new xjs();
                        xnw.b(xju.NOT_FOUND, xjsVar);
                        xjv xjvVarA = xnw.a(xjsVar);
                        if ((xhbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            xhbVar.y();
                        }
                        xo xoVar2 = xoVar;
                        xhe xheVar2 = (xhe) xhbVar.b;
                        xheVar2.c = xjvVarA;
                        xheVar2.b |= 1;
                        xoVar2.b(xkn.a(xhbVar));
                    }
                };
                Handler handler = new Handler(Looper.getMainLooper());
                feq.e(handler, grt.c, runnable);
                grtVar.d.z(new gro(handler, runnable, grtVar, str, xoVar));
                return "Processing resultFutureWaitingForInAppQueryRoutingToken";
            }
        });
    }

    @Override // defpackage.grl
    public final void a(String str) {
        try {
            Intent intent = Intent.parseUri(a.e(str, "https://www.youtube.com/tv?voice={\"youtubeAssistantRequest\":{\"query\":\"", "\",\"isPrefetchQuery\":true}}"), 0).setPackage("com.google.android.youtube.tv");
            intent.getClass();
            this.j.a(intent, new grs());
        } catch (URISyntaxException unused) {
            ((zdv) b.d().q("com/google/android/apps/tvsearch/performers/OpenProviderPerformerImpl", "performYoutubePrefetch", 494, "OpenProviderPerformerImpl.kt")).u("Unable to perform YouTube prefetch: prefetch query is malformed.");
        }
    }

    @Override // defpackage.grl
    public final void b(ito itoVar) {
        itoVar.getClass();
        this.A.add(itoVar);
    }

    @Override // defpackage.grl
    public final void c(ito itoVar) {
        itoVar.getClass();
        this.A.remove(itoVar);
    }

    @Override // defpackage.grl
    public final zyd d(xnr xnrVar, gez gezVar) {
        return ahkr.c(this.u, 0, new grr(gezVar, this, xnrVar, null), 3);
    }

    public final xhe e(String str, xju xjuVar, String str2) {
        gph gphVar = this.v;
        if (gphVar == gph.a && agvy.c(str, "com.google.android.apps.tv.launcherx")) {
            this.l.r(gmc.z, rbl.ERROR);
        }
        if ((gphVar == gph.b || gphVar == gph.c) && agvy.c(str, "com.google.android.tvlauncher")) {
            this.l.r(gmc.P, rbl.ERROR);
        }
        int i = xjuVar == xju.NOT_FOUND ? 4 : 5;
        gfr gfrVar = this.h;
        gfrVar.f(rpm.ej(), i);
        gmd gmdVar = this.l;
        gmc gmcVar = gmc.u;
        rbl rblVar = rbl.ERROR;
        gmdVar.r(gmcVar, rblVar);
        gmdVar.r(gmc.y, rblVar);
        if (((Boolean) this.x.a()).booleanValue()) {
            ((gfn) this.g.a()).a(rpm.cp()).b().d(abqb.UNKNOWN);
        } else {
            gfq.b(gfrVar, rpm.cp(), abqb.UNKNOWN, null, 12);
        }
        return gqk.a(xjuVar, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(final java.lang.String r9, defpackage.agsw r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.grq
            if (r0 == 0) goto L13
            r0 = r10
            grq r0 = (defpackage.grq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            grq r0 = new grq
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L49
            if (r2 == r7) goto L43
            if (r2 == r6) goto L3f
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            defpackage.agpl.b(r10)
            return r10
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            java.lang.String r9 = r0.d
            defpackage.agpl.b(r10)
            goto L9a
        L3f:
            defpackage.agpl.b(r10)
            return r10
        L43:
            java.lang.String r9 = r0.d
            defpackage.agpl.b(r10)
            goto L63
        L49:
            defpackage.agpl.b(r10)
            gzu r10 = r8.i
            java.lang.String r10 = r10.a
            boolean r10 = defpackage.agvy.c(r9, r10)
            if (r10 == 0) goto L82
            fiu r10 = r8.t
            r0.d = r9
            r0.c = r7
            java.lang.Object r10 = r10.h(r9, r0)
            if (r10 != r1) goto L63
            goto La8
        L63:
            java.lang.String r10 = (java.lang.String) r10
            boolean r2 = defpackage.agyv.n(r10)
            if (r2 != 0) goto L72
            grp r9 = defpackage.grt.a
            xhe r9 = r9.a(r10)
            return r9
        L72:
            zyd r9 = r8.k(r9)
            r0.d = r3
            r0.c = r6
            java.lang.Object r9 = defpackage.ahkr.b(r9, r0)
            if (r9 != r1) goto L81
            goto La8
        L81:
            return r9
        L82:
            fiu r10 = r8.t
            r0.d = r9
            r0.c = r5
            fhy r2 = new fhy
            r2.<init>()
            fhi r10 = r10.e
            java.lang.Object r10 = r10.b(r2, r0)
            if (r10 == r1) goto L97
            agpu r10 = defpackage.agpu.a
        L97:
            if (r10 != r1) goto L9a
            goto La8
        L9a:
            zyd r9 = r8.k(r9)
            r0.d = r3
            r0.c = r4
            java.lang.Object r9 = defpackage.ahkr.b(r9, r0)
            if (r9 != r1) goto La9
        La8:
            return r1
        La9:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.grt.f(java.lang.String, agsw):java.lang.Object");
    }

    public final String g(Uri uri, String str) {
        if (uri == null || !((acfo) this.p.a()).b.contains(str)) {
            return null;
        }
        return this.q.b();
    }

    public final void h(String str, String str2, gez gezVar) {
        rqw rqwVarC;
        eza ezaVar;
        if (str != null && (ezaVar = this.B.a) != null) {
            ezaVar.c(str);
        }
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            itr itrVar = ((ito) it.next()).a;
            if (!agyv.n(str2)) {
                itrVar.c = str2;
            }
            itrVar.d.a(itrVar);
        }
        gph gphVar = this.v;
        if (gphVar == gph.a && agvy.c(str2, "com.google.android.apps.tv.launcherx")) {
            this.l.r(gmc.z, rbl.SUCCESS);
        }
        if ((gphVar == gph.b || gphVar == gph.c) && agvy.c(str2, "com.google.android.tvlauncher")) {
            this.l.r(gmc.P, rbl.SUCCESS);
        }
        gmd gmdVar = this.l;
        gmc gmcVar = gmc.u;
        rbl rblVar = rbl.SUCCESS;
        gmdVar.r(gmcVar, rblVar);
        this.z.af();
        gfr gfrVar = this.h;
        gfq.a(gfrVar, rpm.ej(), null, 14);
        gmdVar.r(gmc.y, rblVar);
        glq glqVar = this.w;
        glqVar.y(gma.a);
        if (gezVar != null && gezVar.d == 9) {
            glqVar.y(gma.f);
        }
        if (gezVar != null && gezVar.d == 3) {
            glqVar.y(gma.g);
        }
        if (((Boolean) this.x.a()).booleanValue()) {
            ((gfn) this.g.a()).a(rpm.cp()).b().d(abqb.OK);
        } else {
            gfq.b(gfrVar, rpm.cp(), null, null, 14);
        }
        if (gezVar != null) {
            agow agowVar = this.f;
            agow agowVar2 = this.e;
            gey geyVar = gez.a;
            if (geyVar.b(gezVar, agowVar, agowVar2)) {
                agow agowVar3 = this.g;
                geyVar.a(((gfn) agowVar3.a()).a(rpm.bQ()), gezVar).c();
                if (!geyVar.c(gezVar, agowVar) && (rqwVarC = gfb.c(gezVar, agowVar)) != null) {
                    geyVar.d(((gfn) agowVar3.a()).c(rqwVarC), gezVar, 0, 0).c(abqb.OK);
                }
            }
        }
        this.d.q();
    }

    public final boolean i(Intent intent) {
        fex fexVar = this.q;
        return this.j.c(intent, fexVar.f() ? fexVar.e() ? exj.a : exj.b : exj.c, exk.a, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02cf A[Catch: IOException -> 0x0334, TryCatch #4 {IOException -> 0x0334, blocks: (B:108:0x02c9, B:110:0x02cf, B:122:0x0312, B:113:0x02e0, B:114:0x02e9, B:115:0x02ea, B:117:0x02f0, B:119:0x0300, B:120:0x0308, B:121:0x0311), top: B:170:0x02c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ea A[Catch: IOException -> 0x0334, TryCatch #4 {IOException -> 0x0334, blocks: (B:108:0x02c9, B:110:0x02cf, B:122:0x0312, B:113:0x02e0, B:114:0x02e9, B:115:0x02ea, B:117:0x02f0, B:119:0x0300, B:120:0x0308, B:121:0x0311), top: B:170:0x02c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0369 A[Catch: IOException -> 0x03ce, TryCatch #6 {IOException -> 0x03ce, blocks: (B:134:0x0363, B:136:0x0369, B:148:0x03ac, B:139:0x037a, B:140:0x0383, B:141:0x0384, B:143:0x038a, B:145:0x039a, B:146:0x03a2, B:147:0x03ab), top: B:173:0x0363 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0384 A[Catch: IOException -> 0x03ce, TryCatch #6 {IOException -> 0x03ce, blocks: (B:134:0x0363, B:136:0x0369, B:148:0x03ac, B:139:0x037a, B:140:0x0383, B:141:0x0384, B:143:0x038a, B:145:0x039a, B:146:0x03a2, B:147:0x03ab), top: B:173:0x0363 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0221  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(android.content.Intent r21, java.lang.String r22, java.lang.String r23, defpackage.xnr r24) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.grt.j(android.content.Intent, java.lang.String, java.lang.String, xnr):void");
    }
}
