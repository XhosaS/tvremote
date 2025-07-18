package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.ArrayMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qxr implements qsw {
    public boolean a = false;
    public Activity b;
    private final aehf c;

    public qxr(aehf aehfVar, Executor executor) {
        this.c = aehfVar;
        executor.execute(new Runnable() { // from class: qxq
            @Override // java.lang.Runnable
            public final void run() {
                qxr qxrVar = this.a;
                synchronized (qxrVar) {
                    qxrVar.a = true;
                    Activity activity = qxrVar.b;
                    if (activity != null) {
                        qxrVar.c(activity);
                    }
                    qxrVar.b = null;
                }
            }
        });
    }

    @Override // defpackage.qsw
    public final synchronized void b(Activity activity) {
        qyc qycVar;
        int i;
        ahvp ahvpVar;
        if (this.a) {
            final qyb qybVar = (qyb) this.c.a();
            qyj qyjVarC = qyj.c(activity);
            ypv ypvVar = ypv.a;
            final qxs qxsVar = new qxs(qyjVarC, ypvVar, ypvVar, ypvVar, ypvVar);
            if (qybVar.e.d()) {
                ArrayMap arrayMap = qybVar.c;
                synchronized (arrayMap) {
                    qycVar = (qyc) arrayMap.remove(qxsVar.a);
                    if (arrayMap.isEmpty()) {
                        qybVar.b.j();
                    }
                }
                if (qycVar == null) {
                    ((zdv) ((zdv) qps.a.b()).q("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "stopAsFuture", 226, "FrameMetricServiceImpl.java")).x("Measurement not found: %s", new qsk(((qxv) qxsVar.a).a));
                    zyd zydVar = zxy.a;
                } else {
                    qyh qyhVar = qybVar.g;
                    qyj qyjVar = qxsVar.a;
                    int i2 = 0;
                    if (Build.VERSION.SDK_INT >= 29 && Trace.isEnabled()) {
                        String str = ((qxv) qyjVar).a.a;
                        Trace.endAsyncSection(String.format("J<%s>", str), 352691800);
                        for (qym qymVar : ((qyp) qyhVar.b.a()).c) {
                            int iA = qyo.a(qymVar.b);
                            if (iA == 0) {
                                iA = 1;
                            }
                            switch (iA - 1) {
                                case 1:
                                    i = 0;
                                    break;
                                case 2:
                                    i = qycVar.f;
                                    break;
                                case 3:
                                    i = qycVar.h;
                                    break;
                                case 4:
                                    i = qycVar.i;
                                    break;
                                case 5:
                                    i = qycVar.j;
                                    break;
                                case 6:
                                    i = qycVar.k;
                                    break;
                                case 7:
                                    i = qycVar.m;
                                    break;
                                default:
                                    String str2 = qymVar.c;
                                    continue;
                            }
                            Trace.setCounter(qymVar.c.replace("%EVENT_NAME%", str), i);
                        }
                    }
                    if (qycVar.h == 0) {
                        zyd zydVar2 = zxy.a;
                    } else {
                        agow agowVar = qyhVar.b;
                        if (((qyp) agowVar.a()).d) {
                            ((qyf) qyhVar.c.a()).e();
                            long millis = TimeUnit.SECONDS.toMillis(9L);
                            Long.valueOf(millis).getClass();
                            if (qycVar.m <= millis && qycVar.f != 0) {
                                qvh qvhVar = (qvh) qyhVar.a.a();
                                String strReplace = ((qyp) agowVar.a()).b.replace("%PACKAGE_NAME%", qyhVar.d.getPackageName());
                                strReplace.getClass();
                                qvhVar.a(strReplace);
                            }
                        }
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - qycVar.c;
                        ahvh ahvhVar = ahvh.a;
                        ahvg ahvgVar = new ahvg();
                        if ((ahvgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            ahvgVar.y();
                        }
                        int i3 = ((int) jElapsedRealtime) + 1;
                        ahvh ahvhVar2 = (ahvh) ahvgVar.b;
                        ahvhVar2.b |= 16;
                        ahvhVar2.g = i3;
                        int i4 = qycVar.f;
                        if ((ahvgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            ahvgVar.y();
                        }
                        ahvh ahvhVar3 = (ahvh) ahvgVar.b;
                        ahvhVar3.b |= 1;
                        ahvhVar3.c = i4;
                        int i5 = qycVar.h;
                        if ((ahvgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            ahvgVar.y();
                        }
                        ahvh ahvhVar4 = (ahvh) ahvgVar.b;
                        ahvhVar4.b |= 2;
                        ahvhVar4.d = i5;
                        int i6 = qycVar.i;
                        if ((ahvgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            ahvgVar.y();
                        }
                        ahvh ahvhVar5 = (ahvh) ahvgVar.b;
                        ahvhVar5.b |= 4;
                        ahvhVar5.e = i6;
                        int i7 = qycVar.k;
                        if ((ahvgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            ahvgVar.y();
                        }
                        ahvh ahvhVar6 = (ahvh) ahvgVar.b;
                        ahvhVar6.b |= 32;
                        ahvhVar6.h = i7;
                        int i8 = qycVar.m;
                        if ((ahvgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            ahvgVar.y();
                        }
                        ahvh ahvhVar7 = (ahvh) ahvgVar.b;
                        ahvhVar7.b |= 64;
                        ahvhVar7.i = i8;
                        int i9 = qycVar.j;
                        if ((ahvgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            ahvgVar.y();
                        }
                        ahvh ahvhVar8 = (ahvh) ahvgVar.b;
                        ahvhVar8.b |= 8;
                        ahvhVar8.f = i9;
                        int i10 = qycVar.n;
                        if (i10 != Integer.MIN_VALUE) {
                            int[] iArr = qycVar.e;
                            int[] iArr2 = qyc.b;
                            ahvp ahvpVar2 = ahvp.a;
                            ahvo ahvoVar = new ahvo();
                            int i11 = 0;
                            while (true) {
                                if (i11 >= 52) {
                                    if (iArr[51] > 0) {
                                        ahvoVar.a(i10 + 1);
                                        ahvoVar.b(0);
                                    }
                                    ahvpVar = (ahvp) ahvoVar.v();
                                } else if (iArr2[i11] > i10) {
                                    ahvoVar.b(0);
                                    ahvoVar.a(i10 + 1);
                                    ahvpVar = (ahvp) ahvoVar.v();
                                } else {
                                    int i12 = iArr[i11];
                                    if (i12 > 0 || (i11 > 0 && iArr[i11 - 1] > 0)) {
                                        ahvoVar.b(i12);
                                        ahvoVar.a(iArr2[i11]);
                                    }
                                    i11++;
                                }
                            }
                            if ((ahvgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                ahvgVar.y();
                            }
                            ahvh ahvhVar9 = (ahvh) ahvgVar.b;
                            ahvpVar.getClass();
                            ahvhVar9.p = ahvpVar;
                            ahvhVar9.b |= 2048;
                            int i13 = qycVar.g;
                            if ((ahvgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                ahvgVar.y();
                            }
                            ahvh ahvhVar10 = (ahvh) ahvgVar.b;
                            ahvhVar10.b |= 512;
                            ahvhVar10.m = i13;
                            int i14 = qycVar.l;
                            if ((ahvgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                ahvgVar.y();
                            }
                            ahvh ahvhVar11 = (ahvh) ahvgVar.b;
                            ahvhVar11.b |= 1024;
                            ahvhVar11.o = i14;
                        }
                        while (i2 < 29) {
                            int i15 = i2 + 1;
                            int[] iArr3 = qycVar.d;
                            if (iArr3[i2] > 0) {
                                ahvf ahvfVar = ahvf.a;
                                ahve ahveVar = new ahve();
                                int i16 = iArr3[i2];
                                if ((ahveVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    ahveVar.y();
                                }
                                ahvf ahvfVar2 = (ahvf) ahveVar.b;
                                ahvfVar2.b |= 1;
                                ahvfVar2.c = i16;
                                int[] iArr4 = qyc.a;
                                int i17 = iArr4[i2];
                                if ((ahveVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    ahveVar.y();
                                }
                                ahvf ahvfVar3 = (ahvf) ahveVar.b;
                                ahvfVar3.b |= 2;
                                ahvfVar3.d = i17;
                                if (i15 < 29) {
                                    int i18 = iArr4[i15] - 1;
                                    if ((ahveVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        ahveVar.y();
                                    }
                                    ahvf ahvfVar4 = (ahvf) ahveVar.b;
                                    ahvfVar4.b |= 4;
                                    ahvfVar4.e = i18;
                                }
                                if ((ahvgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    ahvgVar.y();
                                }
                                ahvh ahvhVar12 = (ahvh) ahvgVar.b;
                                ahvf ahvfVar5 = (ahvf) ahveVar.v();
                                ahvfVar5.getClass();
                                abxs abxsVar = ahvhVar12.k;
                                if (!abxsVar.c()) {
                                    int size = abxsVar.size();
                                    ahvhVar12.k = abxsVar.d(size + size);
                                }
                                ahvhVar12.k.add(ahvfVar5);
                            }
                            i2 = i15;
                        }
                        ahvh ahvhVar13 = (ahvh) ahvgVar.v();
                        final ahvg ahvgVar2 = new ahvg();
                        ahvgVar2.B(ahvhVar13);
                        yqt yqtVarA = qxw.a(qybVar.a);
                        if (yqtVarA.g()) {
                            int iIntValue = ((Float) yqtVarA.c()).intValue();
                            if ((ahvgVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                ahvgVar2.y();
                            }
                            ahvh ahvhVar14 = (ahvh) ahvgVar2.b;
                            ahvhVar14.b |= 256;
                            ahvhVar14.l = iIntValue;
                        }
                        if (ahvgVar2.d(ahqo.b)) {
                            zuz.h(zxn.k(new Callable() { // from class: qxx
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    agow agowVar2 = qybVar.h;
                                    int iIntValue2 = ((Long) agowVar2.a()).intValue();
                                    ahvg ahvgVar3 = ahvgVar2;
                                    if (iIntValue2 == 0 || iIntValue2 == 1) {
                                        ahvgVar3.e(ahqo.b);
                                        return (ahvh) ahvgVar3.v();
                                    }
                                    if (iIntValue2 != 2) {
                                        if (iIntValue2 == 3) {
                                            return (ahvh) ahvgVar3.v();
                                        }
                                        ((zdv) ((zdv) ((zdv) qps.a.d()).n(1, TimeUnit.HOURS)).q("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "stopAsFuture", 267, "FrameMetricServiceImpl.java")).x("Unsupported experimental jank collection configuration: %s", new qsg(((Long) agowVar2.a()).longValue()));
                                        ahvgVar3.e(ahqo.b);
                                        return (ahvh) ahvgVar3.v();
                                    }
                                    abxc abxcVar = ahqo.b;
                                    abwz abwzVar = (abwz) ahvgVar3.b;
                                    if (abxcVar.a != ((abxd) abwzVar.cM(6, null))) {
                                        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                                    }
                                    Object objK = abwzVar.n.k(abxcVar.d);
                                    ahqo ahqoVar = (ahqo) (objK == null ? abxcVar.b : abxcVar.b(objK));
                                    if (ahqoVar.c.size() != ahqoVar.d.size()) {
                                        ((zdv) ((zdv) ((zdv) qps.a.d()).n(1, TimeUnit.HOURS)).q("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "filterJankyFrames", 288, "FrameMetricServiceImpl.java")).F("Experimental jank data is invalid, clearing extension. Deadline count %s != Total Duration count %s.", new qsg(ahqoVar.c.size()), new qsg(ahqoVar.d.size()));
                                        ahvgVar3.e(abxcVar);
                                        return (ahvh) ahvgVar3.v();
                                    }
                                    ahqn ahqnVar = new ahqn();
                                    ahqnVar.B(ahqoVar);
                                    if ((ahqnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        ahqnVar.y();
                                    }
                                    ahqo ahqoVar2 = (ahqo) ahqnVar.b;
                                    abyf abyfVar = abyf.a;
                                    ahqoVar2.c = abyfVar;
                                    if ((ahqnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        ahqnVar.y();
                                    }
                                    ((ahqo) ahqnVar.b).d = abyfVar;
                                    for (int i19 = 0; i19 < ahqoVar.c.size(); i19++) {
                                        long jA = ahqoVar.c.a(i19);
                                        long jA2 = ahqoVar.d.a(i19);
                                        if (jA2 >= jA) {
                                            if ((ahqnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                ahqnVar.y();
                                            }
                                            ahqo ahqoVar3 = (ahqo) ahqnVar.b;
                                            abxm abxmVar = ahqoVar3.c;
                                            if (!abxmVar.c()) {
                                                int size2 = abxmVar.size();
                                                ahqoVar3.c = abxmVar.d(size2 + size2);
                                            }
                                            ahqoVar3.c.f(jA);
                                            if ((ahqnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                ahqnVar.y();
                                            }
                                            ahqo ahqoVar4 = (ahqo) ahqnVar.b;
                                            abxm abxmVar2 = ahqoVar4.d;
                                            if (!abxmVar2.c()) {
                                                int size3 = abxmVar2.size();
                                                ahqoVar4.d = abxmVar2.d(size3 + size3);
                                            }
                                            ahqoVar4.d.f(jA2);
                                        }
                                    }
                                    ahvgVar3.f(abxcVar, (ahqo) ahqnVar.v());
                                    return (ahvh) ahvgVar3.v();
                                }
                            }, qybVar.d), new zvi() { // from class: qxy
                                @Override // defpackage.zvi
                                public final zyd a(Object obj) {
                                    return qybVar.e.b(qyb.a((ahvh) obj, qxsVar));
                                }
                            }, zwk.a);
                        } else {
                            qybVar.e.b(qyb.a((ahvh) ahvgVar2.v(), qxsVar));
                        }
                    }
                }
            } else {
                zyd zydVar3 = zxy.a;
            }
        } else {
            activity.equals(this.b);
        }
        this.b = null;
    }

    @Override // defpackage.qsw
    public final synchronized void c(Activity activity) {
        if (!this.a) {
            this.b = activity;
            return;
        }
        qyb qybVar = (qyb) this.c.a();
        qyj qyjVarC = qyj.c(activity);
        qux quxVar = qybVar.e;
        String str = ((qxv) qyjVarC).a.a;
        if (quxVar.c(str)) {
            ArrayMap arrayMap = qybVar.c;
            synchronized (arrayMap) {
                if (arrayMap.size() >= 25) {
                    ((zdv) ((zdv) qps.a.d()).q("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "start", 167, "FrameMetricServiceImpl.java")).x("Too many concurrent measurements, ignoring %s", qyjVarC);
                    return;
                }
                qyc qycVar = (qyc) arrayMap.put(qyjVarC, (qyc) qybVar.f.a());
                if (qycVar != null) {
                    arrayMap.put(qyjVarC, qycVar);
                    ((zdv) ((zdv) qps.a.d()).q("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "start", 181, "FrameMetricServiceImpl.java")).x("measurement already started: %s", qyjVarC);
                    return;
                }
                if (arrayMap.size() == 1) {
                    qybVar.b.g();
                }
                qyh qyhVar = qybVar.g;
                if (Build.VERSION.SDK_INT >= 29 && Trace.isEnabled()) {
                    Trace.beginAsyncSection(String.format("J<%s>", str), 352691800);
                }
            }
        }
    }

    @Override // defpackage.qsw
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.qsw
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.qsw
    public final /* synthetic */ void a(Activity activity) {
    }

    @Override // defpackage.qsw
    public final /* synthetic */ void d(Activity activity) {
    }

    @Override // defpackage.qsw
    public final /* synthetic */ void e(Activity activity) {
    }

    @Override // defpackage.qsw
    public final /* synthetic */ void f(int i) {
    }
}
