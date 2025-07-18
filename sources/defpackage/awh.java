package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awh extends awn implements asm, auh {
    private final Context a;
    private final asv b;
    private final awx c;
    private final awb d;
    private final awg e;
    private final ArrayMap f;
    private final Executor g;
    private final aue h;
    private final crv i;
    private final awq j;
    private final byg k;
    private final crv l;

    /* JADX WARN: Type inference failed for: r4v1, types: [crv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [cov, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [crv, java.lang.Object] */
    public awh(auf aufVar, Context context, asv asvVar, cov covVar, awb awbVar, crv crvVar, crv crvVar2, Executor executor, awy awyVar, crv crvVar3, awo awoVar, awq awqVar, byg bygVar, crv crvVar4) {
        ArrayMap arrayMap = new ArrayMap();
        this.f = arrayMap;
        bdq.j(true);
        this.g = executor;
        this.h = aufVar.a(executor, covVar, crvVar2);
        this.a = context;
        this.b = asvVar;
        this.i = crvVar;
        this.d = awbVar;
        awg awgVar = new awg(context, arrayMap, crvVar3);
        this.e = awgVar;
        ?? A = awyVar.a.a();
        A.getClass();
        cjd cjdVar = (cjd) awyVar.b.a();
        cjdVar.getClass();
        this.c = new awx(A, cjdVar, awgVar);
        this.j = awqVar;
        this.k = Build.VERSION.SDK_INT < 31 ? bxw.a : bygVar;
        this.l = crvVar4;
    }

    public static /* synthetic */ cyf c(awh awhVar, cye cyeVar) {
        crv crvVar = awhVar.l;
        int iIntValue = ((Long) crvVar.a()).intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            cyeVar.X(cwv.d);
            return (cyf) cyeVar.i();
        }
        if (iIntValue != 2) {
            if (iIntValue == 3) {
                return (cyf) cyeVar.i();
            }
            ((cbs) ((cbs) aqn.a.g().G(TimeUnit.HOURS)).j("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "stopAsFuture", 267, "FrameMetricServiceImpl.java")).t("Unsupported experimental jank collection configuration: %s", new asg(((Long) crvVar.a()).longValue()));
            cyeVar.X(cwv.d);
            return (cyf) cyeVar.i();
        }
        cmt cmtVar = cwv.d;
        clr clrVar = (clr) cyeVar.b;
        clrVar.i(cmtVar);
        Object objK = clrVar.d.k((cls) cmtVar.d);
        if (objK == null) {
            objK = cmtVar.b;
        } else {
            cmtVar.b(objK);
        }
        cwv cwvVar = (cwv) objK;
        if (cwvVar.b.size() != cwvVar.c.size()) {
            ((cbs) ((cbs) aqn.a.g().G(TimeUnit.HOURS)).j("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "filterJankyFrames", 288, "FrameMetricServiceImpl.java")).z("Experimental jank data is invalid, clearing extension. Deadline count %s != Total Duration count %s.", new asg(cwvVar.b.size()), new asg(cwvVar.c.size()));
            cyeVar.X(cmtVar);
            return (cyf) cyeVar.i();
        }
        clo cloVarO = cwv.a.o();
        for (int i = 0; i < cwvVar.b.size(); i++) {
            long jA = cwvVar.b.a(i);
            long jA2 = cwvVar.c.a(i);
            if (jA2 >= jA) {
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cwv cwvVar2 = (cwv) cloVarO.b;
                cwvVar2.h();
                cwvVar2.b.f(jA);
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cwv cwvVar3 = (cwv) cloVarO.b;
                cwvVar3.i();
                cwvVar3.c.f(jA2);
            }
        }
        cyeVar.Y(cmtVar, (cwv) cloVarO.i());
        return (cyf) cyeVar.i();
    }

    private static aub m(cyf cyfVar, awl awlVar) {
        aua auaVarA = aub.a();
        clo cloVarO = cym.a.o();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        cym cymVar = (cym) cloVarO.b;
        cyfVar.getClass();
        cymVar.k = cyfVar;
        cymVar.b |= 1024;
        auaVarA.f((cym) cloVarO.i());
        auaVarA.b = null;
        awt awtVar = awlVar.a;
        auaVarA.c = "Activity";
        auaVarA.a = awtVar.b();
        auaVarA.c(true);
        return auaVarA.a();
    }

    /* JADX WARN: Type inference failed for: r3v52, types: [cov, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v60, types: [cov, java.lang.Object] */
    public cja b(Activity activity) {
        awj awjVar;
        cyj cyjVar;
        int i;
        awt awtVarA = awt.a(activity);
        bxw bxwVar = bxw.a;
        awl awlVar = new awl(awtVarA, bxwVar, bxwVar);
        azf azfVar = this.h.c;
        boolean z = azfVar.b;
        azj azjVar = azfVar.a;
        if (!z || !azjVar.d()) {
            return ciw.a;
        }
        ArrayMap arrayMap = this.f;
        synchronized (arrayMap) {
            awjVar = (awj) arrayMap.remove(awlVar.a);
            if (arrayMap.isEmpty()) {
                this.c.j();
            }
        }
        if (awjVar == null) {
            ((cbs) aqn.a.e().j("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "stopAsFuture", 226, "FrameMetricServiceImpl.java")).t("Measurement not found: %s", new asi(awlVar.a.a));
            return ciw.a;
        }
        awq awqVar = this.j;
        String strB = awlVar.a.b();
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 29 && Trace.isEnabled()) {
            Trace.endAsyncSection(String.format("J<%s>", strB), 352691800);
            for (awu awuVar : ((aww) awqVar.a.a()).c) {
                int iAa = ii.aa(awuVar.b);
                if (iAa == 0) {
                    iAa = 1;
                }
                switch (iAa - 1) {
                    case 1:
                        i = 0;
                        break;
                    case 2:
                        i = awjVar.f;
                        break;
                    case 3:
                        i = awjVar.h;
                        break;
                    case 4:
                        i = awjVar.i;
                        break;
                    case 5:
                        i = awjVar.j;
                        break;
                    case 6:
                        i = awjVar.k;
                        break;
                    case 7:
                        i = awjVar.m;
                        break;
                    default:
                        ((cbs) aqn.a.b().j("com/google/android/libraries/performance/primes/metrics/jank/JankPerfettoTrigger", "endTraceSectionAndEmitCounters", 153, "JankPerfettoTrigger.java")).t("UNKNOWN COUNTER with %s as the name", awuVar.c);
                        continue;
                }
                Trace.setCounter(awuVar.c.replace("%EVENT_NAME%", strB), i);
            }
        }
        if (awjVar.h == 0) {
            return ciw.a;
        }
        crv crvVar = awqVar.a;
        if (((aww) crvVar.a()).d) {
            long millis = TimeUnit.SECONDS.toMillis(9L);
            Long.valueOf(millis).getClass();
            if (awjVar.m <= millis && awjVar.f != 0) {
                aun aunVar = (aun) awqVar.b.a();
                String strReplace = ((aww) crvVar.a()).b.replace("%PACKAGE_NAME%", ((Context) awqVar.d).getPackageName());
                strReplace.getClass();
                aunVar.a(strReplace);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - awjVar.c;
        cye cyeVar = (cye) cyf.a.o();
        if (!cyeVar.b.A()) {
            cyeVar.l();
        }
        cyf cyfVar = (cyf) cyeVar.b;
        cyfVar.b |= 16;
        cyfVar.h = ((int) jElapsedRealtime) + 1;
        int i3 = awjVar.f;
        if (!cyeVar.b.A()) {
            cyeVar.l();
        }
        cyf cyfVar2 = (cyf) cyeVar.b;
        cyfVar2.b |= 1;
        cyfVar2.c = i3;
        int i4 = awjVar.h;
        if (!cyeVar.b.A()) {
            cyeVar.l();
        }
        cyf cyfVar3 = (cyf) cyeVar.b;
        cyfVar3.b |= 2;
        cyfVar3.e = i4;
        int i5 = awjVar.i;
        if (!cyeVar.b.A()) {
            cyeVar.l();
        }
        cyf cyfVar4 = (cyf) cyeVar.b;
        cyfVar4.b |= 4;
        cyfVar4.f = i5;
        int i6 = awjVar.k;
        if (!cyeVar.b.A()) {
            cyeVar.l();
        }
        cyf cyfVar5 = (cyf) cyeVar.b;
        cyfVar5.b |= 32;
        cyfVar5.i = i6;
        int i7 = awjVar.m;
        if (!cyeVar.b.A()) {
            cyeVar.l();
        }
        cyf cyfVar6 = (cyf) cyeVar.b;
        cyfVar6.b |= 64;
        cyfVar6.j = i7;
        int i8 = awjVar.j;
        if (!cyeVar.b.A()) {
            cyeVar.l();
        }
        cyf cyfVar7 = (cyf) cyeVar.b;
        cyfVar7.b |= 8;
        cyfVar7.g = i8;
        if (awjVar.o) {
            cmt cmtVar = cwv.d;
            clo cloVarO = cwv.a.o();
            List list = awjVar.p;
            list.getClass();
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwv cwvVar = (cwv) cloVarO.b;
            cwvVar.h();
            ckd.d(list, cwvVar.b);
            List list2 = awjVar.q;
            list2.getClass();
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwv cwvVar2 = (cwv) cloVarO.b;
            cwvVar2.i();
            ckd.d(list2, cwvVar2.c);
            cyeVar.Y(cmtVar, (cwv) cloVarO.i());
        }
        int i9 = awjVar.n;
        if (i9 != Integer.MIN_VALUE) {
            int[] iArr = awjVar.e;
            int[] iArr2 = awj.b;
            clo cloVarO2 = cyj.a.o();
            int i10 = 0;
            while (true) {
                if (i10 >= 52) {
                    if (iArr[51] > 0) {
                        cloVarO2.Q(i9 + 1);
                        cloVarO2.R(0);
                    }
                    cyjVar = (cyj) cloVarO2.i();
                } else if (iArr2[i10] > i9) {
                    cloVarO2.R(0);
                    cloVarO2.Q(i9 + 1);
                    cyjVar = (cyj) cloVarO2.i();
                } else {
                    int i11 = iArr[i10];
                    if (i11 > 0 || (i10 > 0 && iArr[i10 - 1] > 0)) {
                        cloVarO2.R(i11);
                        cloVarO2.Q(iArr2[i10]);
                    }
                    i10++;
                }
            }
            if (!cyeVar.b.A()) {
                cyeVar.l();
            }
            cyf cyfVar8 = (cyf) cyeVar.b;
            cyjVar.getClass();
            cyfVar8.p = cyjVar;
            cyfVar8.b |= 2048;
            int i12 = awjVar.g;
            if (!cyeVar.b.A()) {
                cyeVar.l();
            }
            cyf cyfVar9 = (cyf) cyeVar.b;
            cyfVar9.b |= 512;
            cyfVar9.n = i12;
            int i13 = awjVar.l;
            if (!cyeVar.b.A()) {
                cyeVar.l();
            }
            cyf cyfVar10 = (cyf) cyeVar.b;
            cyfVar10.b |= 1024;
            cyfVar10.o = i13;
        }
        int i14 = 0;
        while (i14 < 29) {
            int i15 = i14 + 1;
            int[] iArr3 = awjVar.d;
            if (iArr3[i14] > 0) {
                clo cloVarO3 = cyd.a.o();
                int i16 = iArr3[i14];
                if (!cloVarO3.b.A()) {
                    cloVarO3.l();
                }
                clt cltVar = cloVarO3.b;
                cyd cydVar = (cyd) cltVar;
                cydVar.b |= 1;
                cydVar.c = i16;
                int[] iArr4 = awj.a;
                int i17 = iArr4[i14];
                if (!cltVar.A()) {
                    cloVarO3.l();
                }
                clt cltVar2 = cloVarO3.b;
                cyd cydVar2 = (cyd) cltVar2;
                cydVar2.b |= 2;
                cydVar2.d = i17;
                if (i15 < 29) {
                    int i18 = iArr4[i15] - 1;
                    if (!cltVar2.A()) {
                        cloVarO3.l();
                    }
                    cyd cydVar3 = (cyd) cloVarO3.b;
                    cydVar3.b |= 4;
                    cydVar3.e = i18;
                }
                if (!cyeVar.b.A()) {
                    cyeVar.l();
                }
                cyf cyfVar11 = (cyf) cyeVar.b;
                cyd cydVar4 = (cyd) cloVarO3.i();
                cydVar4.getClass();
                cme cmeVar = cyfVar11.l;
                if (!cmeVar.c()) {
                    cyfVar11.l = clt.t(cmeVar);
                }
                cyfVar11.l.add(cydVar4);
            }
            i14 = i15;
        }
        cyf cyfVar12 = (cyf) cyeVar.i();
        clo cloVar = (clo) cyfVar12.a(5, null);
        cloVar.n(cyfVar12);
        cye cyeVar2 = (cye) cloVar;
        byg bygVarA = awc.a(this.a);
        if (bygVarA.f()) {
            int iIntValue = ((Float) bygVarA.b()).intValue();
            if (!cyeVar2.b.A()) {
                cyeVar2.l();
            }
            cyf cyfVar13 = (cyf) cyeVar2.b;
            cyfVar13.b |= 256;
            cyfVar13.m = iIntValue;
        }
        cmt cmtVar2 = cwv.d;
        clr clrVar = (clr) cyeVar2.b;
        clrVar.i(cmtVar2);
        return !clrVar.d.m((cls) cmtVar2.d) ? this.h.a(m((cyf) cyeVar2.i(), awlVar)) : chk.i(qm.N(new awe(this, cyeVar2, i2), this.g), new awf(this, awlVar, i2), chz.a);
    }

    public void d(Activity activity) {
        awt awtVarA = awt.a(activity);
        if (this.h.b(awtVarA.b())) {
            ArrayMap arrayMap = this.f;
            synchronized (arrayMap) {
                if (arrayMap.size() >= 25) {
                    ((cbs) aqn.a.g().j("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "start", 167, "FrameMetricServiceImpl.java")).t("Too many concurrent measurements, ignoring %s", awtVarA);
                    return;
                }
                awj awjVarA = ((awk) this.i).a();
                awj awjVar = (awj) arrayMap.put(awtVarA, awjVarA);
                if (awjVar != null) {
                    arrayMap.put(awtVarA, awjVar);
                    ((cbs) aqn.a.g().j("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "start", 181, "FrameMetricServiceImpl.java")).t("measurement already started: %s", awtVarA);
                    return;
                }
                byg bygVar = this.k;
                if (bygVar.f() && ((awd) bygVar.b()).a() && !awjVarA.o) {
                    awjVarA.p = new ArrayList();
                    awjVarA.q = new ArrayList();
                    awjVarA.o = true;
                }
                if (arrayMap.size() == 1) {
                    this.c.i();
                }
                String strB = awtVarA.b();
                if (Build.VERSION.SDK_INT >= 29 && Trace.isEnabled()) {
                    Trace.beginAsyncSection(String.format("J<%s>", strB), 352691800);
                }
            }
        }
    }

    @Override // defpackage.asm
    public void i(aqe aqeVar) {
        ArrayMap arrayMap = this.f;
        synchronized (arrayMap) {
            arrayMap.clear();
        }
    }

    @Override // defpackage.auh
    public void t() {
        asv asvVar = this.b;
        asvVar.a(this.c);
        asvVar.a(this.d);
    }

    @Override // defpackage.asm
    public /* synthetic */ void j(aqe aqeVar) {
    }
}
