package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rrv implements rox {
    public boolean a = false;
    public Activity b;
    private final xbw c;

    public rrv(xbw xbwVar, tst tstVar, Executor executor) {
        this.c = xbwVar;
        executor.execute(new rmz(this, tstVar, 2));
    }

    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object, xbw] */
    @Override // defpackage.rox
    public final synchronized void b(Activity activity) {
        rsc rscVar;
        int i;
        zax zaxVar;
        if (this.a) {
            rsa rsaVar = (rsa) this.c.b();
            rsk rskVarA = rsk.a(activity);
            trk trkVar = trk.a;
            rse rseVar = new rse(rskVarA, trkVar, trkVar, trkVar, trkVar);
            if (rsaVar.e.d()) {
                ArrayMap arrayMap = rsaVar.c;
                synchronized (arrayMap) {
                    rscVar = (rsc) arrayMap.remove(rseVar.a);
                    if (arrayMap.isEmpty()) {
                        rsaVar.b.j();
                    }
                }
                if (rscVar == null) {
                    ((tug) ((tug) rnb.a.e()).j("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "stopAsFuture", 226, "FrameMetricServiceImpl.java")).v("Measurement not found: %s", new rom(rseVar.a.a));
                    uhp uhpVar = uhl.a;
                } else {
                    rsh rshVar = rsaVar.g;
                    String strB = rseVar.a.b();
                    int i2 = 0;
                    int i3 = 1;
                    if (Build.VERSION.SDK_INT >= 29 && Trace.isEnabled()) {
                        Trace.endAsyncSection(String.format("J<%s>", strB), 352691800);
                        for (rsl rslVar : ((rsm) rshVar.a.b()).c) {
                            int iAP = a.aP(rslVar.b);
                            if (iAP == 0) {
                                iAP = i3;
                            }
                            switch (iAP - 1) {
                                case 1:
                                    i = 0;
                                    break;
                                case 2:
                                    i = rscVar.f;
                                    break;
                                case 3:
                                    i = rscVar.h;
                                    break;
                                case 4:
                                    i = rscVar.i;
                                    break;
                                case 5:
                                    i = rscVar.j;
                                    break;
                                case 6:
                                    i = rscVar.k;
                                    break;
                                case 7:
                                    i = rscVar.m;
                                    break;
                                default:
                                    ((tug) ((tug) rnb.a.b()).j("com/google/android/libraries/performance/primes/metrics/jank/JankPerfettoTrigger", "endTraceSectionAndEmitCounters", 180, "JankPerfettoTrigger.java")).v("UNKNOWN COUNTER with %s as the name", rslVar.c);
                                    i3 = i3;
                                    continue;
                            }
                            Trace.setCounter(rslVar.c.replace("%EVENT_NAME%", strB), i);
                        }
                    }
                    if (rscVar.h == 0) {
                        uhp uhpVar2 = uhl.a;
                    } else {
                        yfo yfoVar = rshVar.a;
                        if (((rsm) yfoVar.b()).d) {
                            long millis = TimeUnit.SECONDS.toMillis(9L);
                            Long.valueOf(millis).getClass();
                            if (rscVar.m <= millis && rscVar.f != 0) {
                                rqk rqkVar = (rqk) rshVar.b.b();
                                String strReplace = ((rsm) yfoVar.b()).b.replace("%PACKAGE_NAME%", ((Context) rshVar.d).getPackageName());
                                strReplace.getClass();
                                rqkVar.a(strReplace);
                            }
                        }
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - rscVar.c;
                        vty vtyVar = (vty) zat.a.m();
                        if (!vtyVar.b.A()) {
                            vtyVar.u();
                        }
                        zat zatVar = (zat) vtyVar.b;
                        zatVar.b |= 16;
                        zatVar.g = ((int) jElapsedRealtime) + 1;
                        int i4 = rscVar.f;
                        if (!vtyVar.b.A()) {
                            vtyVar.u();
                        }
                        zat zatVar2 = (zat) vtyVar.b;
                        zatVar2.b |= 1;
                        zatVar2.c = i4;
                        int i5 = rscVar.h;
                        if (!vtyVar.b.A()) {
                            vtyVar.u();
                        }
                        zat zatVar3 = (zat) vtyVar.b;
                        zatVar3.b |= 2;
                        zatVar3.d = i5;
                        int i6 = rscVar.i;
                        if (!vtyVar.b.A()) {
                            vtyVar.u();
                        }
                        zat zatVar4 = (zat) vtyVar.b;
                        zatVar4.b |= 4;
                        zatVar4.e = i6;
                        int i7 = rscVar.k;
                        if (!vtyVar.b.A()) {
                            vtyVar.u();
                        }
                        zat zatVar5 = (zat) vtyVar.b;
                        zatVar5.b |= 32;
                        zatVar5.h = i7;
                        int i8 = rscVar.m;
                        if (!vtyVar.b.A()) {
                            vtyVar.u();
                        }
                        zat zatVar6 = (zat) vtyVar.b;
                        zatVar6.b |= 64;
                        zatVar6.i = i8;
                        int i9 = rscVar.j;
                        if (!vtyVar.b.A()) {
                            vtyVar.u();
                        }
                        zat zatVar7 = (zat) vtyVar.b;
                        zatVar7.b |= 8;
                        zatVar7.f = i9;
                        if (rscVar.o) {
                            vvd vvdVar = yzh.f;
                            vtw vtwVarM = yzh.a.m();
                            List list = rscVar.p;
                            list.getClass();
                            if (!vtwVarM.b.A()) {
                                vtwVarM.u();
                            }
                            yzh yzhVar = (yzh) vtwVarM.b;
                            yzhVar.c();
                            vsf.h(list, yzhVar.c);
                            List list2 = rscVar.q;
                            list2.getClass();
                            if (!vtwVarM.b.A()) {
                                vtwVarM.u();
                            }
                            yzh yzhVar2 = (yzh) vtwVarM.b;
                            yzhVar2.i();
                            vsf.h(list2, yzhVar2.d);
                            long j = rscVar.r;
                            if (!vtwVarM.b.A()) {
                                vtwVarM.u();
                            }
                            yzh yzhVar3 = (yzh) vtwVarM.b;
                            yzhVar3.b |= 1;
                            yzhVar3.e = j;
                            vtyVar.bL(vvdVar, (yzh) vtwVarM.r());
                        }
                        int i10 = rscVar.n;
                        if (i10 != Integer.MIN_VALUE) {
                            int[] iArr = rscVar.e;
                            int[] iArr2 = rsc.b;
                            vtw vtwVarM2 = zax.a.m();
                            int i11 = 0;
                            while (true) {
                                if (i11 >= 52) {
                                    if (iArr[51] > 0) {
                                        vtwVarM2.bq(i10 + 1);
                                        vtwVarM2.br(0);
                                    }
                                    zaxVar = (zax) vtwVarM2.r();
                                } else if (iArr2[i11] > i10) {
                                    vtwVarM2.br(0);
                                    vtwVarM2.bq(i10 + 1);
                                    zaxVar = (zax) vtwVarM2.r();
                                } else {
                                    int i12 = iArr[i11];
                                    if (i12 > 0 || (i11 > 0 && iArr[i11 - 1] > 0)) {
                                        vtwVarM2.br(i12);
                                        vtwVarM2.bq(iArr2[i11]);
                                    }
                                    i11++;
                                }
                            }
                            if (!vtyVar.b.A()) {
                                vtyVar.u();
                            }
                            zat zatVar8 = (zat) vtyVar.b;
                            zaxVar.getClass();
                            zatVar8.p = zaxVar;
                            zatVar8.b |= RecyclerView.ItemAnimator.FLAG_MOVED;
                            int i13 = rscVar.g;
                            if (!vtyVar.b.A()) {
                                vtyVar.u();
                            }
                            zat zatVar9 = (zat) vtyVar.b;
                            zatVar9.b |= 512;
                            zatVar9.n = i13;
                            int i14 = rscVar.l;
                            if (!vtyVar.b.A()) {
                                vtyVar.u();
                            }
                            zat zatVar10 = (zat) vtyVar.b;
                            zatVar10.b |= 1024;
                            zatVar10.o = i14;
                        }
                        while (i2 < 29) {
                            int i15 = i2 + 1;
                            int[] iArr3 = rscVar.d;
                            if (iArr3[i2] > 0) {
                                vtw vtwVarM3 = zas.a.m();
                                int i16 = iArr3[i2];
                                if (!vtwVarM3.b.A()) {
                                    vtwVarM3.u();
                                }
                                vuc vucVar = vtwVarM3.b;
                                zas zasVar = (zas) vucVar;
                                zasVar.b |= 1;
                                zasVar.c = i16;
                                int[] iArr4 = rsc.a;
                                int i17 = iArr4[i2];
                                if (!vucVar.A()) {
                                    vtwVarM3.u();
                                }
                                vuc vucVar2 = vtwVarM3.b;
                                zas zasVar2 = (zas) vucVar2;
                                zasVar2.b |= 2;
                                zasVar2.d = i17;
                                if (i15 < 29) {
                                    int i18 = iArr4[i15] - 1;
                                    if (!vucVar2.A()) {
                                        vtwVarM3.u();
                                    }
                                    zas zasVar3 = (zas) vtwVarM3.b;
                                    zasVar3.b |= 4;
                                    zasVar3.e = i18;
                                }
                                if (!vtyVar.b.A()) {
                                    vtyVar.u();
                                }
                                zat zatVar11 = (zat) vtyVar.b;
                                zas zasVar4 = (zas) vtwVarM3.r();
                                zasVar4.getClass();
                                vun vunVar = zatVar11.k;
                                if (!vunVar.c()) {
                                    zatVar11.k = vuc.s(vunVar);
                                }
                                zatVar11.k.add(zasVar4);
                            }
                            i2 = i15;
                        }
                        zat zatVar12 = (zat) vtyVar.r();
                        vtw vtwVar = (vtw) zatVar12.a(5, null);
                        vtwVar.x(zatVar12);
                        vty vtyVar2 = (vty) vtwVar;
                        tst tstVarL = rrx.l(rsaVar.a);
                        if (tstVarL.g()) {
                            int iIntValue = ((Float) tstVarL.c()).intValue();
                            if (!vtyVar2.b.A()) {
                                vtyVar2.u();
                            }
                            zat zatVar13 = (zat) vtyVar2.b;
                            zatVar13.b |= 256;
                            zatVar13.m = iIntValue;
                        }
                        if (vtyVar2.bJ(yzh.f)) {
                            ufn.j(sfy.F(new grz(rsaVar, vtyVar2, 13, null), rsaVar.d), new pap(rsaVar, rseVar, 10, null), ugk.a);
                        } else {
                            rsaVar.e.b(rsa.a((zat) vtyVar2.r(), rseVar));
                        }
                    }
                }
            } else {
                uhp uhpVar3 = uhl.a;
            }
        } else if (!activity.equals(this.b)) {
            ((tug) ((tug) rnb.a.b()).j("com/google/android/libraries/performance/primes/metrics/jank/ActivityLevelJankMonitor", "onActivityPaused", 86, "ActivityLevelJankMonitor.java")).B("Activity mismatch (currentActivity=%s, activity=%s)", this.b, activity);
        }
        this.b = null;
    }

    @Override // defpackage.rox
    public final synchronized void c(Activity activity) {
        if (!this.a) {
            this.b = activity;
            return;
        }
        rsa rsaVar = (rsa) this.c.b();
        rsk rskVarA = rsk.a(activity);
        if (rsaVar.e.c(rskVarA.b())) {
            ArrayMap arrayMap = rsaVar.c;
            synchronized (arrayMap) {
                if (arrayMap.size() >= 25) {
                    ((tug) ((tug) rnb.a.g()).j("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "start", 167, "FrameMetricServiceImpl.java")).v("Too many concurrent measurements, ignoring %s", rskVarA);
                    return;
                }
                rsc rscVarB = ((rsd) rsaVar.f).b();
                rsc rscVar = (rsc) arrayMap.put(rskVarA, rscVarB);
                if (rscVar != null) {
                    arrayMap.put(rskVarA, rscVar);
                    ((tug) ((tug) rnb.a.g()).j("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "start", 181, "FrameMetricServiceImpl.java")).v("measurement already started: %s", rskVarA);
                    return;
                }
                tst tstVar = rsaVar.h;
                if (tstVar.g() && ((rry) tstVar.c()).a() && !rscVarB.o) {
                    rscVarB.p = new ArrayList();
                    rscVarB.q = new ArrayList();
                    rscVarB.o = true;
                }
                if (arrayMap.size() == 1) {
                    rsaVar.b.g();
                }
                rsh rshVar = rsaVar.g;
                String strB = rskVarA.b();
                if (Build.VERSION.SDK_INT >= 29 && Trace.isEnabled()) {
                    Trace.beginAsyncSection(String.format("J<%s>", strB), 352691800);
                }
            }
        }
    }

    @Override // defpackage.rox
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.rox
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.rox
    public final /* synthetic */ void a(Activity activity) {
    }

    @Override // defpackage.rox
    public final /* synthetic */ void d(Activity activity) {
    }

    @Override // defpackage.rox
    public final /* synthetic */ void e(Activity activity) {
    }

    @Override // defpackage.rox
    public final /* synthetic */ void f(int i) {
    }
}
