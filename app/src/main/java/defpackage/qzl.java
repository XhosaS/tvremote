package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.PowerManager;
import android.os.Process;
import android.os.StrictMode;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qzl extends qzg implements quz {
    public final zyh a;
    public final aehf b;
    public final qux c;
    public final qzr d;
    private final qpv e;
    private final qzf f;

    public qzl(quy quyVar, qzf qzfVar, zyh zyhVar, aehf aehfVar, qzr qzrVar, qpv qpvVar, agow agowVar, Executor executor) {
        new AtomicReference(qyy.a);
        new ConcurrentHashMap();
        this.f = qzfVar;
        this.e = qpvVar;
        this.c = quyVar.a(executor, aehfVar, agowVar);
        this.a = zyhVar;
        this.b = aehfVar;
        this.d = qzrVar;
        Boolean bool = false;
        bool.getClass();
    }

    @Override // defpackage.qzg
    public final void a() {
        qze qzeVar = new qze() { // from class: qzi
            @Override // defpackage.qze
            public final void a(int i, String str) {
                this.a.d(null, i, str);
            }
        };
        final qzf qzfVar = this.f;
        qzfVar.d = qzeVar;
        if (qzfVar.c.getAndSet(true)) {
            return;
        }
        zxn.l(new zvh() { // from class: qza
            @Override // defpackage.zvh
            public final zyd a() {
                ((qyx) qzfVar.a.a()).f();
                return zxy.a;
            }
        }, qzfVar.b);
    }

    @Override // defpackage.qzg
    public final void b(qpi qpiVar) {
        d(qpiVar.a, 1, null);
    }

    public final boolean c(int i) {
        return i != 1;
    }

    public final void d(final String str, final int i, final String str2) {
        if (this.e.a) {
            zxn.f();
        } else {
            zxn.l(new zvh() { // from class: qzh
                @Override // defpackage.zvh
                public final zyd a() {
                    final qzl qzlVar = this.a;
                    final qyx qyxVar = (qyx) qzlVar.b.a();
                    final String str3 = str;
                    final int i2 = i;
                    final long jA = qzlVar.c(i2) ? 1000L : qzlVar.c.a(str3);
                    if (jA == -1) {
                        return zxy.a;
                    }
                    final String str4 = str2;
                    qyxVar.h();
                    zyd zydVar = zxy.a;
                    qyxVar.d();
                    zwx zwxVarU = zwx.u(zydVar);
                    yqi yqiVar = new yqi() { // from class: qzj
                        @Override // defpackage.yqi
                        public final Object apply(Object obj) {
                            ((zdv) ((zdv) ((zdv) qps.a.d()).p((RuntimeException) obj)).q("com/google/android/libraries/performance/primes/metrics/memory/MemoryMetricServiceImpl", "record", 418, "MemoryMetricServiceImpl.java")).u("Metric extension provider failed.");
                            return null;
                        }
                    };
                    zyh zyhVar = qzlVar.a;
                    return zuz.h(zud.g(zwxVarU, RuntimeException.class, yqiVar, zyhVar), new zvi() { // from class: qzk
                        @Override // defpackage.zvi
                        public final zyd a(Object obj) {
                            ahqu ahquVar = (ahqu) obj;
                            qyxVar.i();
                            ahvw ahvwVar = ahvw.a;
                            ahvv ahvvVar = new ahvv();
                            int iMyPid = Process.myPid();
                            qzl qzlVar2 = qzlVar;
                            final qzr qzrVar = qzlVar2.d;
                            yrp yrpVarA = yru.a(new yrp() { // from class: qzp
                                @Override // defpackage.yrp
                                public final Object eV() {
                                    return qth.a(qzrVar.c, "getMemoryUsageMetric");
                                }
                            });
                            Object objA = qzrVar.b.a();
                            uea.b();
                            qyx qyxVar2 = (qyx) objA;
                            qyxVar2.g();
                            qyxVar2.j();
                            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                            Context context = qzrVar.c;
                            if (qth.a == null) {
                                synchronized (qth.class) {
                                    if (qth.a == null) {
                                        Object systemService = context.getSystemService("activity");
                                        systemService.getClass();
                                        qth.a = (ActivityManager) systemService;
                                    }
                                }
                            }
                            qth.a.getMemoryInfo(memoryInfo);
                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            qzq qzqVar = null;
                            try {
                                try {
                                    File file = ((Boolean) qzrVar.d.a()).booleanValue() ? new File(a.a(iMyPid, "/proc/", "/status")) : new File("/proc/self/status");
                                    Charset charsetDefaultCharset = Charset.defaultCharset();
                                    charsetDefaultCharset.getClass();
                                    String str5 = new String(zks.a(file), charsetDefaultCharset);
                                    if (str5.isEmpty()) {
                                        ((zdv) ((zdv) qps.a.d()).q("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "procStatusFromString", 252, "MemoryUsageCapture.java")).u("Null or empty proc status");
                                    } else {
                                        qzq qzqVar2 = new qzq();
                                        qzqVar2.f = qzr.b(qzq.a, str5);
                                        qzqVar2.g = qzr.b(qzq.b, str5);
                                        qzqVar2.h = qzr.b(qzq.c, str5);
                                        qzqVar2.i = qzr.b(qzq.d, str5);
                                        qzqVar2.j = qzr.b(qzq.e, str5);
                                        qzqVar = qzqVar2;
                                    }
                                } catch (IOException e) {
                                    ((zdv) ((zdv) ((zdv) qps.a.d()).p(e)).q("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "getProcStatus", 289, "MemoryUsageCapture.java")).u("Error reading proc status");
                                }
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                ahsf ahsfVar = ahsf.a;
                                ahsd ahsdVar = new ahsd();
                                ahsc ahscVar = ahsc.a;
                                ahsb ahsbVar = new ahsb();
                                ahry ahryVar = ahry.a;
                                ahrx ahrxVar = new ahrx();
                                long j = memoryInfo.availMem >> 10;
                                if ((ahrxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    ahrxVar.y();
                                }
                                ahry ahryVar2 = (ahry) ahrxVar.b;
                                ahryVar2.b |= 131072;
                                ahryVar2.c = (int) j;
                                long j2 = memoryInfo.totalMem >> 20;
                                if ((ahrxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    ahrxVar.y();
                                }
                                int i3 = (int) j2;
                                ahry ahryVar3 = (ahry) ahrxVar.b;
                                ahryVar3.b |= 262144;
                                ahryVar3.d = i3;
                                if (qzqVar != null) {
                                    Long l = qzqVar.f;
                                    if (l != null) {
                                        long jLongValue = l.longValue();
                                        if ((ahrxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                            ahrxVar.y();
                                        }
                                        ahry ahryVar4 = (ahry) ahrxVar.b;
                                        ahryVar4.b |= 524288;
                                        ahryVar4.e = jLongValue;
                                    }
                                    Long l2 = qzqVar.g;
                                    if (l2 != null) {
                                        long jLongValue2 = l2.longValue();
                                        if ((ahrxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                            ahrxVar.y();
                                        }
                                        ahry ahryVar5 = (ahry) ahrxVar.b;
                                        ahryVar5.b |= 1048576;
                                        ahryVar5.f = jLongValue2;
                                    }
                                    Long l3 = qzqVar.h;
                                    if (l3 != null) {
                                        long jLongValue3 = l3.longValue();
                                        if ((ahrxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                            ahrxVar.y();
                                        }
                                        ahry ahryVar6 = (ahry) ahrxVar.b;
                                        ahryVar6.b |= 2097152;
                                        ahryVar6.g = jLongValue3;
                                    }
                                    Long l4 = qzqVar.i;
                                    if (l4 != null) {
                                        long jLongValue4 = l4.longValue();
                                        if ((ahrxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                            ahrxVar.y();
                                        }
                                        ahry ahryVar7 = (ahry) ahrxVar.b;
                                        ahryVar7.b |= 4194304;
                                        ahryVar7.h = jLongValue4;
                                    }
                                    Long l5 = qzqVar.j;
                                    if (l5 != null) {
                                        long jLongValue5 = l5.longValue();
                                        if ((ahrxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                            ahrxVar.y();
                                        }
                                        ahry ahryVar8 = (ahry) ahrxVar.b;
                                        ahryVar8.b |= 8388608;
                                        ahryVar8.i = jLongValue5;
                                    }
                                }
                                ahry ahryVar9 = (ahry) ahrxVar.v();
                                if ((ahsbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    ahsbVar.y();
                                }
                                ahsc ahscVar2 = (ahsc) ahsbVar.b;
                                ahryVar9.getClass();
                                ahscVar2.c = ahryVar9;
                                ahscVar2.b |= 1;
                                if ((ahsdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    ahsdVar.y();
                                }
                                ahsf ahsfVar2 = (ahsf) ahsdVar.b;
                                ahsc ahscVar3 = (ahsc) ahsbVar.v();
                                ahscVar3.getClass();
                                ahsfVar2.c = ahscVar3;
                                ahsfVar2.b |= 1;
                                ahuc ahucVar = ahuc.a;
                                ahub ahubVar = new ahub();
                                qtj qtjVar = qzrVar.a;
                                ahua ahuaVarB = qtjVar.b(qtjVar.a.a(yrpVarA), (qtk) yrpVarA.eV());
                                if ((ahubVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    ahubVar.y();
                                }
                                ahuc ahucVar2 = (ahuc) ahubVar.b;
                                ahuaVarB.getClass();
                                ahucVar2.c = ahuaVarB;
                                ahucVar2.b |= 1;
                                if ((ahsdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    ahsdVar.y();
                                }
                                ahsf ahsfVar3 = (ahsf) ahsdVar.b;
                                ahuc ahucVar3 = (ahuc) ahubVar.v();
                                ahucVar3.getClass();
                                ahsfVar3.d = ahucVar3;
                                ahsfVar3.b |= 2;
                                ahsa ahsaVar = ahsa.a;
                                ahrz ahrzVar = new ahrz();
                                Object systemService2 = qzrVar.c.getSystemService("power");
                                systemService2.getClass();
                                boolean zIsInteractive = ((PowerManager) systemService2).isInteractive();
                                if ((ahrzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    ahrzVar.y();
                                }
                                ahsa ahsaVar2 = (ahsa) ahrzVar.b;
                                ahsaVar2.b |= 1;
                                ahsaVar2.c = zIsInteractive;
                                if ((ahsdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    ahsdVar.y();
                                }
                                ahsf ahsfVar4 = (ahsf) ahsdVar.b;
                                ahsa ahsaVar3 = (ahsa) ahrzVar.v();
                                ahsaVar3.getClass();
                                ahsfVar4.f = ahsaVar3;
                                ahsfVar4.b |= 8;
                                if ((ahsdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    ahsdVar.y();
                                }
                                String str6 = str4;
                                int i4 = i2;
                                ahsf ahsfVar5 = (ahsf) ahsdVar.b;
                                ahsfVar5.e = i4 - 1;
                                ahsfVar5.b |= 4;
                                if (str6 != null) {
                                    if ((ahsdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        ahsdVar.y();
                                    }
                                    ahsf ahsfVar6 = (ahsf) ahsdVar.b;
                                    ahsfVar6.b |= 16;
                                    ahsfVar6.g = str6;
                                }
                                ahsf ahsfVar7 = (ahsf) ahsdVar.v();
                                if ((ahvvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    ahvvVar.y();
                                }
                                long j3 = jA;
                                String str7 = str3;
                                ahvw ahvwVar2 = (ahvw) ahvvVar.b;
                                ahsfVar7.getClass();
                                ahvwVar2.f = ahsfVar7;
                                ahvwVar2.b |= 8;
                                ahvw ahvwVar3 = (ahvw) ahvvVar.v();
                                qup qupVarN = quq.n();
                                quh quhVar = (quh) qupVarN;
                                quhVar.a = str7;
                                qupVarN.c(true);
                                quhVar.e = Long.valueOf(j3);
                                qupVarN.f(ahvwVar3);
                                quhVar.c = ahquVar;
                                if (qzlVar2.c(i4)) {
                                    qupVarN.d(true);
                                }
                                return qzlVar2.c.b(qupVarN.a());
                            } catch (Throwable th) {
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                throw th;
                            }
                        }
                    }, zyhVar);
                }
            }, this.a);
        }
    }

    @Override // defpackage.quz
    public final void k() {
    }
}
