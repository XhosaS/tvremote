package defpackage;

import android.os.Process;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class raw extends rau implements quz, qsn {
    private final qst a;
    private final agow b;
    private final agow c;
    private final agow d;
    private final AtomicBoolean e = new AtomicBoolean();
    private final agow f;
    private final agow g;

    public raw(qst qstVar, agow agowVar, agow agowVar2, agow agowVar3, agow agowVar4, aehf aehfVar) {
        this.g = agowVar4;
        this.a = qstVar;
        this.b = agowVar;
        this.c = agowVar2;
        this.d = agowVar3;
        this.f = new rav(aehfVar);
    }

    static /* synthetic */ Boolean a(aehf aehfVar) {
        return false;
    }

    private static long b(Long l, long j) {
        return l == null ? j : Math.min(l.longValue(), j);
    }

    private static ahtj c(rah rahVar) {
        ahtj ahtjVar = ahtj.a;
        ahti ahtiVar = new ahti();
        if (rahVar.a != null) {
            String str = rahVar.a;
            if ((ahtiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahtiVar.y();
            }
            ahtj ahtjVar2 = (ahtj) ahtiVar.b;
            str.getClass();
            ahtjVar2.b |= 1;
            ahtjVar2.c = str;
        }
        if (rahVar.b != null) {
            long j = ((quj) rahVar.b).a;
            if ((ahtiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahtiVar.y();
            }
            ahtj ahtjVar3 = (ahtj) ahtiVar.b;
            ahtjVar3.b |= 2;
            ahtjVar3.d = j;
        }
        if (rahVar.c != null) {
            long j2 = ((quj) rahVar.c).a;
            if ((ahtiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahtiVar.y();
            }
            ahtj ahtjVar4 = (ahtj) ahtiVar.b;
            ahtjVar4.b |= 4;
            ahtjVar4.e = j2;
        }
        if (rahVar.d != null) {
            long j3 = ((quj) rahVar.d).a;
            if ((ahtiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahtiVar.y();
            }
            ahtj ahtjVar5 = (ahtj) ahtiVar.b;
            ahtjVar5.b |= 8;
            ahtjVar5.f = j3;
        }
        return (ahtj) ahtiVar.v();
    }

    @Override // defpackage.qsn
    public final void g(qpi qpiVar) {
        Long lValueOf;
        this.a.c.b(this);
        raq raqVar = raq.a;
        qvf qvfVar = raqVar.i;
        qvf qvfVar2 = raqVar.j;
        aehf aehfVar = ((rav) this.f).a;
        a(aehfVar).booleanValue();
        if ((qvfVar == null || ((quj) qvfVar).a <= 0) && (qvfVar2 == null || ((quj) qvfVar2).a <= 0)) {
            ((zdv) ((zdv) qps.a.b()).q("com/google/android/libraries/performance/primes/metrics/startup/StartupMetricServiceImpl", "onAppToBackground", 297, "StartupMetricServiceImpl.java")).u("missing firstDraw timestamp");
            return;
        }
        agow agowVar = this.g;
        qvf qvfVar3 = raqVar.b(((Long) agowVar.a()).longValue()) ? raqVar.b : raqVar.g;
        if (qvfVar3 == null) {
            return;
        }
        long j = ((quj) qvfVar3).a;
        if (j > 0) {
            if ((qvfVar == null || ((quj) qvfVar).a < j) && (qvfVar2 == null || ((quj) qvfVar2).a < j)) {
                return;
            }
            a(aehfVar).booleanValue();
            ahto ahtoVar = ahto.a;
            final ahtk ahtkVar = new ahtk();
            boolean zB = raqVar.b(((Long) agowVar.a()).longValue());
            if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahtkVar.y();
            }
            ahto ahtoVar2 = (ahto) ahtkVar.b;
            ahtoVar2.b |= 65536;
            ahtoVar2.r = zB;
            int i = true != zB ? 3 : 2;
            if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahtkVar.y();
            }
            ahto ahtoVar3 = (ahto) ahtkVar.b;
            ahtoVar3.s = i - 1;
            ahtoVar3.b |= 131072;
            qvf qvfVar4 = raqVar.b;
            qvf qvfVar5 = null;
            if (qvfVar4 != null) {
                if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahtkVar.y();
                }
                ahto ahtoVar4 = (ahto) ahtkVar.b;
                ahtoVar4.b |= 16;
                long j2 = ((quj) qvfVar4).a;
                ahtoVar4.f = j2;
                lValueOf = Long.valueOf(j2);
            } else {
                lValueOf = null;
            }
            qvf qvfVar6 = raqVar.c;
            if (qvfVar6 != null) {
                if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahtkVar.y();
                }
                ahto ahtoVar5 = (ahto) ahtkVar.b;
                ahtoVar5.b |= 128;
                long j3 = ((quj) qvfVar6).a;
                ahtoVar5.i = j3;
                lValueOf = Long.valueOf(b(lValueOf, j3));
            }
            qvf qvfVar7 = raqVar.d;
            qvf qvfVar8 = raqVar.e;
            qvf qvfVar9 = raqVar.f;
            qvf qvfVar10 = raqVar.g;
            if (qvfVar10 != null) {
                if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahtkVar.y();
                }
                ahto ahtoVar6 = (ahto) ahtkVar.b;
                ahtoVar6.b |= 512;
                long j4 = ((quj) qvfVar10).a;
                ahtoVar6.k = j4;
                lValueOf = Long.valueOf(b(lValueOf, j4));
            }
            qvf qvfVar11 = raqVar.j;
            qvf qvfVar12 = raqVar.k;
            qvf qvfVar13 = raqVar.i;
            qvf qvfVar14 = raqVar.h;
            int iIntValue = ((Long) this.d.a()).intValue();
            if (iIntValue == 1) {
                qvfVar5 = qvfVar11;
            } else if (iIntValue == 2) {
                qvfVar5 = qvfVar12;
            } else if (iIntValue == 3) {
                qvfVar5 = qvfVar13;
            } else if (iIntValue == 4) {
                qvfVar5 = qvfVar14;
            }
            if (qvfVar5 != null) {
                if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahtkVar.y();
                }
                ahto ahtoVar7 = (ahto) ahtkVar.b;
                ahtoVar7.b |= 1024;
                long j5 = ((quj) qvfVar5).a;
                ahtoVar7.l = j5;
                lValueOf = Long.valueOf(b(lValueOf, j5));
            }
            if (qvfVar13 != null) {
                if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahtkVar.y();
                }
                ahto ahtoVar8 = (ahto) ahtkVar.b;
                ahtoVar8.b |= 8192;
                long j6 = ((quj) qvfVar13).a;
                ahtoVar8.o = j6;
                lValueOf = Long.valueOf(b(lValueOf, j6));
            }
            if (qvfVar14 != null) {
                if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahtkVar.y();
                }
                ahto ahtoVar9 = (ahto) ahtkVar.b;
                ahtoVar9.b |= 16384;
                long j7 = ((quj) qvfVar14).a;
                ahtoVar9.p = j7;
                lValueOf = Long.valueOf(b(lValueOf, j7));
            }
            if (qvfVar11 != null) {
                if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahtkVar.y();
                }
                ahto ahtoVar10 = (ahto) ahtkVar.b;
                ahtoVar10.b |= 2048;
                long j8 = ((quj) qvfVar11).a;
                ahtoVar10.m = j8;
                lValueOf = Long.valueOf(b(lValueOf, j8));
            }
            if (qvfVar12 != null) {
                if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahtkVar.y();
                }
                ahto ahtoVar11 = (ahto) ahtkVar.b;
                ahtoVar11.b |= 4096;
                long j9 = ((quj) qvfVar12).a;
                ahtoVar11.n = j9;
                lValueOf = Long.valueOf(b(lValueOf, j9));
            }
            qvf qvfVar15 = raqVar.l;
            rah rahVar = raqVar.n;
            if (rahVar.b != null) {
                ahtj ahtjVarC = c(rahVar);
                if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahtkVar.y();
                }
                ahto ahtoVar12 = (ahto) ahtkVar.b;
                ahtjVarC.getClass();
                ahtoVar12.u = ahtjVarC;
                ahtoVar12.b |= 524288;
                if ((ahtjVarC.b & 2) != 0) {
                    lValueOf = Long.valueOf(b(lValueOf, ahtjVarC.d));
                }
                if ((ahtjVarC.b & 4) != 0) {
                    lValueOf = Long.valueOf(b(lValueOf, ahtjVarC.e));
                }
                if ((ahtjVarC.b & 8) != 0) {
                    lValueOf = Long.valueOf(b(lValueOf, ahtjVarC.f));
                }
            }
            rah rahVar2 = raqVar.o;
            if (rahVar2.b != null) {
                ahtj ahtjVarC2 = c(rahVar2);
                if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahtkVar.y();
                }
                ahto ahtoVar13 = (ahto) ahtkVar.b;
                ahtjVarC2.getClass();
                ahtoVar13.v = ahtjVarC2;
                ahtoVar13.b |= 1048576;
                if ((ahtjVarC2.b & 2) != 0) {
                    lValueOf = Long.valueOf(b(lValueOf, ahtjVarC2.d));
                }
                if ((ahtjVarC2.b & 4) != 0) {
                    lValueOf = Long.valueOf(b(lValueOf, ahtjVarC2.e));
                }
                if ((ahtjVarC2.b & 8) != 0) {
                    lValueOf = Long.valueOf(b(lValueOf, ahtjVarC2.f));
                }
            }
            yqt yqtVarA = rax.a();
            if (yqtVarA.g()) {
                Long l = (Long) yqtVarA.c();
                long jLongValue = l.longValue();
                if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahtkVar.y();
                }
                ahto ahtoVar14 = (ahto) ahtkVar.b;
                ahtoVar14.b |= 2;
                ahtoVar14.d = jLongValue;
                lValueOf = Long.valueOf(b(lValueOf, l.longValue()));
            }
            long startElapsedRealtime = Process.getStartElapsedRealtime();
            if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahtkVar.y();
            }
            ahto ahtoVar15 = (ahto) ahtkVar.b;
            ahtoVar15.b |= 4;
            ahtoVar15.e = startElapsedRealtime;
            long jB = b(lValueOf, startElapsedRealtime);
            Long lValueOf2 = Long.valueOf(jB);
            if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahtkVar.y();
            }
            ahto ahtoVar16 = (ahto) ahtkVar.b;
            ahtoVar16.b |= 262144;
            ahtoVar16.t = true;
            lValueOf2.getClass();
            boolean zBooleanValue = ((Boolean) this.c.a()).booleanValue();
            if (jB != 0) {
                if (!zBooleanValue) {
                    if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahtkVar.y();
                    }
                    ahto ahtoVar17 = (ahto) ahtkVar.b;
                    ahtoVar17.b |= 1;
                    ahtoVar17.c = jB;
                }
                ahto ahtoVar18 = (ahto) ahtkVar.b;
                if ((ahtoVar18.b & 16) != 0) {
                    long j10 = ahtoVar18.f - jB;
                    if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahtkVar.y();
                    }
                    ahto ahtoVar19 = (ahto) ahtkVar.b;
                    ahtoVar19.b |= 16;
                    ahtoVar19.f = j10;
                }
                ahto ahtoVar20 = (ahto) ahtkVar.b;
                if ((ahtoVar20.b & 128) != 0) {
                    long j11 = ahtoVar20.i - jB;
                    if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahtkVar.y();
                    }
                    ahto ahtoVar21 = (ahto) ahtkVar.b;
                    ahtoVar21.b |= 128;
                    ahtoVar21.i = j11;
                }
                ahto ahtoVar22 = (ahto) ahtkVar.b;
                if ((ahtoVar22.b & 256) != 0) {
                    long j12 = ahtoVar22.j - jB;
                    if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahtkVar.y();
                    }
                    ahto ahtoVar23 = (ahto) ahtkVar.b;
                    ahtoVar23.b |= 256;
                    ahtoVar23.j = j12;
                }
                ahto ahtoVar24 = (ahto) ahtkVar.b;
                if ((ahtoVar24.b & 32) != 0) {
                    long j13 = ahtoVar24.g - jB;
                    if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahtkVar.y();
                    }
                    ahto ahtoVar25 = (ahto) ahtkVar.b;
                    ahtoVar25.b |= 32;
                    ahtoVar25.g = j13;
                }
                ahto ahtoVar26 = (ahto) ahtkVar.b;
                if ((ahtoVar26.b & 64) != 0) {
                    long j14 = ahtoVar26.h - jB;
                    if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahtkVar.y();
                    }
                    ahto ahtoVar27 = (ahto) ahtkVar.b;
                    ahtoVar27.b |= 64;
                    ahtoVar27.h = j14;
                }
                ahto ahtoVar28 = (ahto) ahtkVar.b;
                if ((ahtoVar28.b & 512) != 0) {
                    long j15 = ahtoVar28.k - jB;
                    if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahtkVar.y();
                    }
                    ahto ahtoVar29 = (ahto) ahtkVar.b;
                    ahtoVar29.b |= 512;
                    ahtoVar29.k = j15;
                }
                ahto ahtoVar30 = (ahto) ahtkVar.b;
                if ((ahtoVar30.b & 1024) != 0) {
                    long j16 = ahtoVar30.l - jB;
                    if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahtkVar.y();
                    }
                    ahto ahtoVar31 = (ahto) ahtkVar.b;
                    ahtoVar31.b |= 1024;
                    ahtoVar31.l = j16;
                }
                ahto ahtoVar32 = (ahto) ahtkVar.b;
                if ((ahtoVar32.b & 2048) != 0) {
                    long j17 = ahtoVar32.m - jB;
                    if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahtkVar.y();
                    }
                    ahto ahtoVar33 = (ahto) ahtkVar.b;
                    ahtoVar33.b |= 2048;
                    ahtoVar33.m = j17;
                }
                ahto ahtoVar34 = (ahto) ahtkVar.b;
                if ((ahtoVar34.b & 4096) != 0) {
                    long j18 = ahtoVar34.n - jB;
                    if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahtkVar.y();
                    }
                    ahto ahtoVar35 = (ahto) ahtkVar.b;
                    ahtoVar35.b |= 4096;
                    ahtoVar35.n = j18;
                }
                ahto ahtoVar36 = (ahto) ahtkVar.b;
                if ((ahtoVar36.b & 8192) != 0) {
                    long j19 = ahtoVar36.o - jB;
                    if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahtkVar.y();
                    }
                    ahto ahtoVar37 = (ahto) ahtkVar.b;
                    ahtoVar37.b |= 8192;
                    ahtoVar37.o = j19;
                }
                ahto ahtoVar38 = (ahto) ahtkVar.b;
                if ((ahtoVar38.b & 16384) != 0) {
                    long j20 = ahtoVar38.p - jB;
                    if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahtkVar.y();
                    }
                    ahto ahtoVar39 = (ahto) ahtkVar.b;
                    ahtoVar39.b |= 16384;
                    ahtoVar39.p = j20;
                }
                ahto ahtoVar40 = (ahto) ahtkVar.b;
                if ((ahtoVar40.b & 32768) != 0) {
                    long j21 = ahtoVar40.q - jB;
                    if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahtkVar.y();
                    }
                    ahto ahtoVar41 = (ahto) ahtkVar.b;
                    ahtoVar41.b |= 32768;
                    ahtoVar41.q = j21;
                }
                ahto ahtoVar42 = (ahto) ahtkVar.b;
                if ((ahtoVar42.b & 524288) != 0) {
                    ahtj ahtjVar = ahtoVar42.u;
                    if (ahtjVar == null) {
                        ahtjVar = ahtj.a;
                    }
                    ahtj ahtjVarA = ray.a(ahtjVar, jB);
                    if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahtkVar.y();
                    }
                    ahto ahtoVar43 = (ahto) ahtkVar.b;
                    ahtjVarA.getClass();
                    ahtoVar43.u = ahtjVarA;
                    ahtoVar43.b |= 524288;
                }
                ahto ahtoVar44 = (ahto) ahtkVar.b;
                if ((ahtoVar44.b & 1048576) != 0) {
                    ahtj ahtjVar2 = ahtoVar44.v;
                    if (ahtjVar2 == null) {
                        ahtjVar2 = ahtj.a;
                    }
                    ahtj ahtjVarA2 = ray.a(ahtjVar2, jB);
                    if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahtkVar.y();
                    }
                    ahto ahtoVar45 = (ahto) ahtkVar.b;
                    ahtjVarA2.getClass();
                    ahtoVar45.v = ahtjVarA2;
                    ahtoVar45.b |= 1048576;
                }
                ahto ahtoVar46 = (ahto) ahtkVar.b;
                if ((ahtoVar46.b & 4) != 0) {
                    long j22 = ahtoVar46.e - jB;
                    if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahtkVar.y();
                    }
                    ahto ahtoVar47 = (ahto) ahtkVar.b;
                    ahtoVar47.b |= 4;
                    ahtoVar47.e = j22;
                }
                ahto ahtoVar48 = (ahto) ahtkVar.b;
                if ((ahtoVar48.b & 2) != 0) {
                    long j23 = ahtoVar48.d - jB;
                    if ((ahtkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahtkVar.y();
                    }
                    ahto ahtoVar49 = (ahto) ahtkVar.b;
                    ahtoVar49.b |= 2;
                    ahtoVar49.d = j23;
                }
            }
            qpi qpiVar2 = raqVar.m;
            if (this.e.getAndSet(true)) {
                zyd zydVar = zxy.a;
            } else {
                final rat ratVar = (rat) this.b.a();
                zxn.l(new zvh() { // from class: ras
                    @Override // defpackage.zvh
                    public final zyd a() {
                        int iA;
                        final rat ratVar2 = ratVar;
                        if (!ratVar2.a.c(null)) {
                            return zxy.a;
                        }
                        final ahtk ahtkVar2 = ahtkVar;
                        ahto ahtoVar50 = (ahto) ahtkVar2.b;
                        int i2 = ahtoVar50.s;
                        int iA2 = ahtn.a(i2);
                        if (((iA2 != 0 && iA2 == 3) || ((iA = ahtn.a(i2)) != 0 && iA == 2)) && (ahtoVar50.b & 16) == 0) {
                            return zxy.a;
                        }
                        rae raeVar = (rae) ratVar2.b.a();
                        raeVar.d();
                        ypv ypvVar = ypv.a;
                        final zyd zydVarH = zxn.h(ypvVar);
                        raeVar.e();
                        final zyd zydVarH2 = zxn.h(ypvVar);
                        return zxn.b(zydVarH, zydVarH2).b(new zvh() { // from class: rar
                            @Override // defpackage.zvh
                            public final zyd a() {
                                zyd zydVar2 = zydVarH;
                                ahtk ahtkVar3 = ahtkVar2;
                                try {
                                    Map map = (Map) ((yqt) zxn.o(zydVar2)).f();
                                    if (map != null) {
                                        long j24 = ((ahto) ahtkVar3.b).c;
                                        for (Map.Entry entry : map.entrySet()) {
                                            Integer num = (Integer) entry.getKey();
                                            num.intValue();
                                            long jLongValue2 = ((Long) entry.getValue()).longValue() - j24;
                                            if ((ahtkVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                ahtkVar3.y();
                                            }
                                            ahto ahtoVar51 = (ahto) ahtkVar3.b;
                                            abyl abylVar = ahtoVar51.w;
                                            if (!abylVar.b) {
                                                ahtoVar51.w = abylVar.a();
                                            }
                                            ahtoVar51.w.put(num, Long.valueOf(jLongValue2));
                                        }
                                    }
                                } catch (Exception e) {
                                    ((zdv) ((zdv) ((zdv) qps.a.d()).p(e)).q("com/google/android/libraries/performance/primes/metrics/startup/StartupMetricRecordingService", "setCustomTimestamps", 'v', "StartupMetricRecordingService.java")).u("Failed to get custom timestamps future");
                                }
                                rat ratVar3 = ratVar2;
                                qup qupVarN = quq.n();
                                ahvw ahvwVar = ahvw.a;
                                ahvv ahvvVar = new ahvv();
                                ahte ahteVar = ahte.a;
                                ahtc ahtcVar = new ahtc();
                                long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
                                if ((ahtcVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    ahtcVar.y();
                                }
                                ahte ahteVar2 = (ahte) ahtcVar.b;
                                ahteVar2.b |= 1;
                                ahteVar2.c = leastSignificantBits;
                                if ((ahtcVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    ahtcVar.y();
                                }
                                ahte ahteVar3 = (ahte) ahtcVar.b;
                                ahteVar3.d = 2;
                                ahteVar3.b = 2 | ahteVar3.b;
                                if ((ahtcVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    ahtcVar.y();
                                }
                                ahte ahteVar4 = (ahte) ahtcVar.b;
                                ahto ahtoVar52 = (ahto) ahtkVar3.v();
                                ahtoVar52.getClass();
                                ahteVar4.f = ahtoVar52;
                                ahteVar4.b |= 16;
                                if ((ahvvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    ahvvVar.y();
                                }
                                qux quxVar = ratVar3.a;
                                zyd zydVar3 = zydVarH2;
                                ahvw ahvwVar2 = (ahvw) ahvvVar.b;
                                ahte ahteVar5 = (ahte) ahtcVar.v();
                                ahteVar5.getClass();
                                ahvwVar2.m = ahteVar5;
                                ahvwVar2.b |= 2048;
                                qupVarN.f((ahvw) ahvvVar.v());
                                quh quhVar = (quh) qupVarN;
                                quhVar.c = (ahqu) ((yqt) zxn.o(zydVar3)).f();
                                quhVar.d = null;
                                qupVarN.d(true);
                                return quxVar.b(qupVarN.a());
                            }
                        }, zwk.a);
                    }
                }, ratVar.c);
            }
        }
    }

    @Override // defpackage.quz
    public final void k() {
        this.a.c.a(this);
    }

    @Override // defpackage.qsn
    public final /* synthetic */ void j(qpi qpiVar) {
    }
}
