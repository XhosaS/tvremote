package defpackage;

import android.os.health.HealthStats;
import android.os.health.TimerStat;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qub {
    public static long a(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasMeasurement(i)) {
            return 0L;
        }
        return healthStats.getMeasurement(i);
    }

    public static Map b(HealthStats healthStats, int i) {
        return (healthStats == null || !healthStats.hasStats(i)) ? Collections.EMPTY_MAP : healthStats.getStats(i);
    }

    public static ahpw c(String str) {
        ahpw ahpwVar = ahpw.a;
        ahpv ahpvVar = new ahpv();
        if ((ahpvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahpvVar.y();
        }
        ahpw ahpwVar2 = (ahpw) ahpvVar.b;
        ahpwVar2.b |= 2;
        ahpwVar2.d = str;
        return (ahpw) ahpvVar.v();
    }

    static ahqg d(ahqg ahqgVar, ahqg ahqgVar2) {
        if (ahqgVar == null || ahqgVar2 == null) {
            return ahqgVar;
        }
        int i = ahqgVar.c - ahqgVar2.c;
        long j = ahqgVar.d - ahqgVar2.d;
        if (i == 0) {
            if (j == 0) {
                return null;
            }
            i = 0;
        }
        ahqf ahqfVar = new ahqf();
        if ((ahqgVar.b & 4) != 0) {
            ahpw ahpwVar = ahqgVar.e;
            if (ahpwVar == null) {
                ahpwVar = ahpw.a;
            }
            if ((ahqfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqfVar.y();
            }
            ahqg ahqgVar3 = (ahqg) ahqfVar.b;
            ahpwVar.getClass();
            ahqgVar3.e = ahpwVar;
            ahqgVar3.b |= 4;
        }
        if ((ahqfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahqfVar.y();
        }
        ahqg ahqgVar4 = (ahqg) ahqfVar.b;
        ahqgVar4.b |= 1;
        ahqgVar4.c = i;
        if ((ahqfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahqfVar.y();
        }
        ahqg ahqgVar5 = (ahqg) ahqfVar.b;
        ahqgVar5.b |= 2;
        ahqgVar5.d = j;
        return (ahqg) ahqfVar.v();
    }

    public static ahqg e(String str, TimerStat timerStat) {
        ahqg ahqgVar = ahqg.a;
        ahqf ahqfVar = new ahqf();
        int count = timerStat.getCount();
        if ((ahqfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahqfVar.y();
        }
        ahqg ahqgVar2 = (ahqg) ahqfVar.b;
        ahqgVar2.b |= 1;
        ahqgVar2.c = count;
        long time = timerStat.getTime();
        if ((ahqfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahqfVar.y();
        }
        ahqg ahqgVar3 = (ahqg) ahqfVar.b;
        ahqgVar3.b |= 2;
        ahqgVar3.d = time;
        if (ahqgVar3.c < 0) {
            if ((ahqfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqfVar.y();
            }
            ahqg ahqgVar4 = (ahqg) ahqfVar.b;
            ahqgVar4.b |= 1;
            ahqgVar4.c = 0;
        }
        if (str != null) {
            ahpw ahpwVarC = c(str);
            if ((ahqfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqfVar.y();
            }
            ahqg ahqgVar5 = (ahqg) ahqfVar.b;
            ahpwVarC.getClass();
            ahqgVar5.e = ahpwVarC;
            ahqgVar5.b |= 4;
        }
        ahqg ahqgVar6 = (ahqg) ahqfVar.b;
        if (ahqgVar6.c == 0 && ahqgVar6.d == 0) {
            return null;
        }
        return (ahqg) ahqfVar.v();
    }

    static ahqi f(HealthStats healthStats) {
        ahqi ahqiVar = ahqi.a;
        ahqh ahqhVar = new ahqh(null);
        long jA = a(healthStats, 10001);
        if (jA != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar2 = (ahqi) ahqhVar.b;
            ahqiVar2.b |= 1;
            ahqiVar2.d = jA;
        }
        long jA2 = a(healthStats, 10002);
        if (jA2 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar3 = (ahqi) ahqhVar.b;
            ahqiVar3.b |= 2;
            ahqiVar3.e = jA2;
        }
        long jA3 = a(healthStats, 10003);
        if (jA3 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar4 = (ahqi) ahqhVar.b;
            ahqiVar4.b |= 4;
            ahqiVar4.f = jA3;
        }
        long jA4 = a(healthStats, 10004);
        if (jA4 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar5 = (ahqi) ahqhVar.b;
            ahqiVar5.b |= 8;
            ahqiVar5.g = jA4;
        }
        ahqhVar.J(l(healthStats, 10005));
        ahqhVar.K(l(healthStats, 10006));
        ahqhVar.L(l(healthStats, 10007));
        ahqhVar.I(l(healthStats, 10008));
        ahqhVar.H(l(healthStats, 10009));
        ahqhVar.D(l(healthStats, 10010));
        ahqg ahqgVarM = m(healthStats, 10011);
        if (ahqgVarM != null) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar6 = (ahqi) ahqhVar.b;
            ahqiVar6.n = ahqgVarM;
            ahqiVar6.b |= 16;
        }
        ahqhVar.E(l(healthStats, 10012));
        ahqhVar.G(qtx.a.d(b(healthStats, 10014)));
        ahqhVar.F(qtw.a.d(b(healthStats, 10015)));
        long jA5 = a(healthStats, 10016);
        if (jA5 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar7 = (ahqi) ahqhVar.b;
            ahqiVar7.b |= 32;
            ahqiVar7.s = jA5;
        }
        long jA6 = a(healthStats, 10017);
        if (jA6 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar8 = (ahqi) ahqhVar.b;
            ahqiVar8.b |= 64;
            ahqiVar8.t = jA6;
        }
        long jA7 = a(healthStats, 10018);
        if (jA7 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar9 = (ahqi) ahqhVar.b;
            ahqiVar9.b |= 128;
            ahqiVar9.u = jA7;
        }
        long jA8 = a(healthStats, 10019);
        if (jA8 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar10 = (ahqi) ahqhVar.b;
            ahqiVar10.b |= 256;
            ahqiVar10.v = jA8;
        }
        long jA9 = a(healthStats, 10020);
        if (jA9 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar11 = (ahqi) ahqhVar.b;
            ahqiVar11.b |= 512;
            ahqiVar11.w = jA9;
        }
        long jA10 = a(healthStats, 10021);
        if (jA10 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar12 = (ahqi) ahqhVar.b;
            ahqiVar12.b |= 1024;
            ahqiVar12.x = jA10;
        }
        long jA11 = a(healthStats, 10022);
        if (jA11 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar13 = (ahqi) ahqhVar.b;
            ahqiVar13.b |= 2048;
            ahqiVar13.y = jA11;
        }
        long jA12 = a(healthStats, 10023);
        if (jA12 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar14 = (ahqi) ahqhVar.b;
            ahqiVar14.b |= 4096;
            ahqiVar14.z = jA12;
        }
        long jA13 = a(healthStats, 10024);
        if (jA13 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar15 = (ahqi) ahqhVar.b;
            ahqiVar15.b |= 8192;
            ahqiVar15.A = jA13;
        }
        long jA14 = a(healthStats, 10025);
        if (jA14 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar16 = (ahqi) ahqhVar.b;
            ahqiVar16.b |= 16384;
            ahqiVar16.B = jA14;
        }
        long jA15 = a(healthStats, 10026);
        if (jA15 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar17 = (ahqi) ahqhVar.b;
            ahqiVar17.b |= 32768;
            ahqiVar17.C = jA15;
        }
        long jA16 = a(healthStats, 10027);
        if (jA16 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar18 = (ahqi) ahqhVar.b;
            ahqiVar18.b |= 65536;
            ahqiVar18.D = jA16;
        }
        long jA17 = a(healthStats, 10028);
        if (jA17 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar19 = (ahqi) ahqhVar.b;
            ahqiVar19.b |= 131072;
            ahqiVar19.E = jA17;
        }
        long jA18 = a(healthStats, 10029);
        if (jA18 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar20 = (ahqi) ahqhVar.b;
            ahqiVar20.b |= 262144;
            ahqiVar20.F = jA18;
        }
        ahqg ahqgVarM2 = m(healthStats, 10030);
        if (ahqgVarM2 != null) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar21 = (ahqi) ahqhVar.b;
            ahqiVar21.G = ahqgVarM2;
            ahqiVar21.b |= 524288;
        }
        long jA19 = a(healthStats, 10031);
        if (jA19 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar22 = (ahqi) ahqhVar.b;
            ahqiVar22.b |= 1048576;
            ahqiVar22.H = jA19;
        }
        ahqg ahqgVarM3 = m(healthStats, 10032);
        if (ahqgVarM3 != null) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar23 = (ahqi) ahqhVar.b;
            ahqiVar23.I = ahqgVarM3;
            ahqiVar23.b |= 2097152;
        }
        ahqg ahqgVarM4 = m(healthStats, 10033);
        if (ahqgVarM4 != null) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar24 = (ahqi) ahqhVar.b;
            ahqiVar24.J = ahqgVarM4;
            ahqiVar24.b |= 4194304;
        }
        ahqg ahqgVarM5 = m(healthStats, 10034);
        if (ahqgVarM5 != null) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar25 = (ahqi) ahqhVar.b;
            ahqiVar25.K = ahqgVarM5;
            ahqiVar25.b |= 8388608;
        }
        ahqg ahqgVarM6 = m(healthStats, 10035);
        if (ahqgVarM6 != null) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar26 = (ahqi) ahqhVar.b;
            ahqiVar26.L = ahqgVarM6;
            ahqiVar26.b |= 16777216;
        }
        ahqg ahqgVarM7 = m(healthStats, 10036);
        if (ahqgVarM7 != null) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar27 = (ahqi) ahqhVar.b;
            ahqiVar27.M = ahqgVarM7;
            ahqiVar27.b |= 33554432;
        }
        ahqg ahqgVarM8 = m(healthStats, 10037);
        if (ahqgVarM8 != null) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar28 = (ahqi) ahqhVar.b;
            ahqiVar28.N = ahqgVarM8;
            ahqiVar28.b |= 67108864;
        }
        ahqg ahqgVarM9 = m(healthStats, 10038);
        if (ahqgVarM9 != null) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar29 = (ahqi) ahqhVar.b;
            ahqiVar29.O = ahqgVarM9;
            ahqiVar29.b |= 134217728;
        }
        ahqg ahqgVarM10 = m(healthStats, 10039);
        if (ahqgVarM10 != null) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar30 = (ahqi) ahqhVar.b;
            ahqiVar30.P = ahqgVarM10;
            ahqiVar30.b |= 268435456;
        }
        ahqg ahqgVarM11 = m(healthStats, 10040);
        if (ahqgVarM11 != null) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar31 = (ahqi) ahqhVar.b;
            ahqiVar31.Q = ahqgVarM11;
            ahqiVar31.b |= 536870912;
        }
        ahqg ahqgVarM12 = m(healthStats, 10041);
        if (ahqgVarM12 != null) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar32 = (ahqi) ahqhVar.b;
            ahqiVar32.R = ahqgVarM12;
            ahqiVar32.b |= 1073741824;
        }
        ahqg ahqgVarM13 = m(healthStats, 10042);
        if (ahqgVarM13 != null) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar33 = (ahqi) ahqhVar.b;
            ahqiVar33.S = ahqgVarM13;
            ahqiVar33.b |= Integer.MIN_VALUE;
        }
        ahqg ahqgVarM14 = m(healthStats, 10043);
        if (ahqgVarM14 != null) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar34 = (ahqi) ahqhVar.b;
            ahqiVar34.T = ahqgVarM14;
            ahqiVar34.c |= 1;
        }
        ahqg ahqgVarM15 = m(healthStats, 10044);
        if (ahqgVarM15 != null) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar35 = (ahqi) ahqhVar.b;
            ahqiVar35.U = ahqgVarM15;
            ahqiVar35.c |= 2;
        }
        long jA20 = a(healthStats, 10045);
        if (jA20 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar36 = (ahqi) ahqhVar.b;
            ahqiVar36.c |= 4;
            ahqiVar36.V = jA20;
        }
        long jA21 = a(healthStats, 10046);
        if (jA21 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar37 = (ahqi) ahqhVar.b;
            ahqiVar37.c |= 8;
            ahqiVar37.W = jA21;
        }
        long jA22 = a(healthStats, 10047);
        if (jA22 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar38 = (ahqi) ahqhVar.b;
            ahqiVar38.c |= 16;
            ahqiVar38.X = jA22;
        }
        long jA23 = a(healthStats, 10048);
        if (jA23 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar39 = (ahqi) ahqhVar.b;
            ahqiVar39.c |= 32;
            ahqiVar39.Y = jA23;
        }
        long jA24 = a(healthStats, 10049);
        if (jA24 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar40 = (ahqi) ahqhVar.b;
            ahqiVar40.c |= 64;
            ahqiVar40.Z = jA24;
        }
        long jA25 = a(healthStats, 10050);
        if (jA25 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar41 = (ahqi) ahqhVar.b;
            ahqiVar41.c |= 128;
            ahqiVar41.aa = jA25;
        }
        long jA26 = a(healthStats, 10051);
        if (jA26 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar42 = (ahqi) ahqhVar.b;
            ahqiVar42.c |= 256;
            ahqiVar42.ab = jA26;
        }
        long jA27 = a(healthStats, 10052);
        if (jA27 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar43 = (ahqi) ahqhVar.b;
            ahqiVar43.c |= 512;
            ahqiVar43.ac = jA27;
        }
        long jA28 = a(healthStats, 10053);
        if (jA28 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar44 = (ahqi) ahqhVar.b;
            ahqiVar44.c |= 1024;
            ahqiVar44.ad = jA28;
        }
        long jA29 = a(healthStats, 10054);
        if (jA29 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar45 = (ahqi) ahqhVar.b;
            ahqiVar45.c |= 2048;
            ahqiVar45.ae = jA29;
        }
        long jA30 = a(healthStats, 10055);
        if (jA30 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar46 = (ahqi) ahqhVar.b;
            ahqiVar46.c |= 4096;
            ahqiVar46.af = jA30;
        }
        long jA31 = a(healthStats, 10056);
        if (jA31 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar47 = (ahqi) ahqhVar.b;
            ahqiVar47.c |= 8192;
            ahqiVar47.ag = jA31;
        }
        long jA32 = a(healthStats, 10057);
        if (jA32 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar48 = (ahqi) ahqhVar.b;
            ahqiVar48.c |= 16384;
            ahqiVar48.ah = jA32;
        }
        long jA33 = a(healthStats, 10058);
        if (jA33 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar49 = (ahqi) ahqhVar.b;
            ahqiVar49.c |= 32768;
            ahqiVar49.ai = jA33;
        }
        long jA34 = a(healthStats, 10059);
        if (jA34 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar50 = (ahqi) ahqhVar.b;
            ahqiVar50.c |= 65536;
            ahqiVar50.aj = jA34;
        }
        ahqg ahqgVarM16 = m(healthStats, 10061);
        if (ahqgVarM16 != null) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar51 = (ahqi) ahqhVar.b;
            ahqiVar51.ak = ahqgVarM16;
            ahqiVar51.c |= 131072;
        }
        long jA35 = a(healthStats, 10062);
        if (jA35 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar52 = (ahqi) ahqhVar.b;
            ahqiVar52.c |= 262144;
            ahqiVar52.al = jA35;
        }
        long jA36 = a(healthStats, 10063);
        if (jA36 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar53 = (ahqi) ahqhVar.b;
            ahqiVar53.c = 524288 | ahqiVar53.c;
            ahqiVar53.am = jA36;
        }
        long jA37 = a(healthStats, 10064);
        if (jA37 != 0) {
            if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqhVar.y();
            }
            ahqi ahqiVar54 = (ahqi) ahqhVar.b;
            ahqiVar54.c |= 1048576;
            ahqiVar54.an = jA37;
        }
        return (ahqi) ahqhVar.v();
    }

    static ahqi g(ahqi ahqiVar, ahqi ahqiVar2) {
        ahqg ahqgVar;
        ahqg ahqgVar2;
        ahqg ahqgVar3;
        ahqg ahqgVar4;
        ahqg ahqgVar5;
        ahqg ahqgVar6;
        ahqg ahqgVar7;
        ahqg ahqgVar8;
        ahqg ahqgVar9;
        ahqg ahqgVar10;
        ahqg ahqgVar11;
        ahqg ahqgVar12;
        ahqg ahqgVar13;
        ahqg ahqgVar14;
        ahqg ahqgVar15;
        ahqg ahqgVar16;
        ahqg ahqgVar17;
        ahqg ahqgVar18;
        ahqg ahqgVar19;
        ahqg ahqgVar20;
        ahqg ahqgVar21;
        ahqg ahqgVar22;
        ahqg ahqgVar23;
        ahqg ahqgVar24;
        ahqg ahqgVar25;
        ahqg ahqgVar26;
        ahqg ahqgVar27;
        ahqg ahqgVar28;
        ahqg ahqgVar29;
        ahqg ahqgVar30;
        ahqg ahqgVar31;
        ahqg ahqgVar32;
        if (ahqiVar != null && ahqiVar2 != null) {
            ahqh ahqhVar = new ahqh(null);
            if ((ahqiVar.b & 1) != 0) {
                long j = ahqiVar.d - ahqiVar2.d;
                if (j != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar3 = (ahqi) ahqhVar.b;
                    ahqiVar3.b |= 1;
                    ahqiVar3.d = j;
                }
            }
            if ((ahqiVar.b & 2) != 0) {
                long j2 = ahqiVar.e - ahqiVar2.e;
                if (j2 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar4 = (ahqi) ahqhVar.b;
                    ahqiVar4.b |= 2;
                    ahqiVar4.e = j2;
                }
            }
            if ((ahqiVar.b & 4) != 0) {
                long j3 = ahqiVar.f - ahqiVar2.f;
                if (j3 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar5 = (ahqi) ahqhVar.b;
                    ahqiVar5.b |= 4;
                    ahqiVar5.f = j3;
                }
            }
            if ((ahqiVar.b & 8) != 0) {
                long j4 = ahqiVar.g - ahqiVar2.g;
                if (j4 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar6 = (ahqi) ahqhVar.b;
                    ahqiVar6.b |= 8;
                    ahqiVar6.g = j4;
                }
            }
            qua quaVar = qua.a;
            ahqhVar.J(quaVar.e(ahqiVar.h, ahqiVar2.h));
            ahqhVar.K(quaVar.e(ahqiVar.i, ahqiVar2.i));
            ahqhVar.L(quaVar.e(ahqiVar.j, ahqiVar2.j));
            ahqhVar.I(quaVar.e(ahqiVar.k, ahqiVar2.k));
            ahqhVar.H(quaVar.e(ahqiVar.l, ahqiVar2.l));
            ahqhVar.D(quaVar.e(ahqiVar.m, ahqiVar2.m));
            if ((ahqiVar.b & 16) != 0) {
                ahqgVar = ahqiVar.n;
                if (ahqgVar == null) {
                    ahqgVar = ahqg.a;
                }
            } else {
                ahqgVar = null;
            }
            if ((ahqiVar2.b & 16) != 0) {
                ahqgVar2 = ahqiVar2.n;
                if (ahqgVar2 == null) {
                    ahqgVar2 = ahqg.a;
                }
            } else {
                ahqgVar2 = null;
            }
            ahqg ahqgVarD = d(ahqgVar, ahqgVar2);
            if (ahqgVarD != null) {
                if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahqhVar.y();
                }
                ahqi ahqiVar7 = (ahqi) ahqhVar.b;
                ahqiVar7.n = ahqgVarD;
                ahqiVar7.b |= 16;
            }
            ahqhVar.E(quaVar.e(ahqiVar.o, ahqiVar2.o));
            ahqhVar.G(qtx.a.e(ahqiVar.q, ahqiVar2.q));
            ahqhVar.F(qtw.a.e(ahqiVar.r, ahqiVar2.r));
            if ((ahqiVar.b & 32) != 0) {
                long j5 = ahqiVar.s - ahqiVar2.s;
                if (j5 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar8 = (ahqi) ahqhVar.b;
                    ahqiVar8.b |= 32;
                    ahqiVar8.s = j5;
                }
            }
            if ((ahqiVar.b & 64) != 0) {
                long j6 = ahqiVar.t - ahqiVar2.t;
                if (j6 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar9 = (ahqi) ahqhVar.b;
                    ahqiVar9.b |= 64;
                    ahqiVar9.t = j6;
                }
            }
            if ((ahqiVar.b & 128) != 0) {
                long j7 = ahqiVar.u - ahqiVar2.u;
                if (j7 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar10 = (ahqi) ahqhVar.b;
                    ahqiVar10.b |= 128;
                    ahqiVar10.u = j7;
                }
            }
            if ((ahqiVar.b & 256) != 0) {
                long j8 = ahqiVar.v - ahqiVar2.v;
                if (j8 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar11 = (ahqi) ahqhVar.b;
                    ahqiVar11.b |= 256;
                    ahqiVar11.v = j8;
                }
            }
            if ((ahqiVar.b & 512) != 0) {
                long j9 = ahqiVar.w - ahqiVar2.w;
                if (j9 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar12 = (ahqi) ahqhVar.b;
                    ahqiVar12.b |= 512;
                    ahqiVar12.w = j9;
                }
            }
            if ((ahqiVar.b & 1024) != 0) {
                long j10 = ahqiVar.x - ahqiVar2.x;
                if (j10 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar13 = (ahqi) ahqhVar.b;
                    ahqiVar13.b |= 1024;
                    ahqiVar13.x = j10;
                }
            }
            if ((ahqiVar.b & 2048) != 0) {
                long j11 = ahqiVar.y - ahqiVar2.y;
                if (j11 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar14 = (ahqi) ahqhVar.b;
                    ahqiVar14.b |= 2048;
                    ahqiVar14.y = j11;
                }
            }
            if ((ahqiVar.b & 4096) != 0) {
                long j12 = ahqiVar.z - ahqiVar2.z;
                if (j12 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar15 = (ahqi) ahqhVar.b;
                    ahqiVar15.b |= 4096;
                    ahqiVar15.z = j12;
                }
            }
            if ((ahqiVar.b & 8192) != 0) {
                long j13 = ahqiVar.A - ahqiVar2.A;
                if (j13 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar16 = (ahqi) ahqhVar.b;
                    ahqiVar16.b |= 8192;
                    ahqiVar16.A = j13;
                }
            }
            if ((ahqiVar.b & 16384) != 0) {
                long j14 = ahqiVar.B - ahqiVar2.B;
                if (j14 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar17 = (ahqi) ahqhVar.b;
                    ahqiVar17.b |= 16384;
                    ahqiVar17.B = j14;
                }
            }
            if ((ahqiVar.b & 32768) != 0) {
                long j15 = ahqiVar.C - ahqiVar2.C;
                if (j15 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar18 = (ahqi) ahqhVar.b;
                    ahqiVar18.b |= 32768;
                    ahqiVar18.C = j15;
                }
            }
            if ((ahqiVar.b & 65536) != 0) {
                long j16 = ahqiVar.D - ahqiVar2.D;
                if (j16 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar19 = (ahqi) ahqhVar.b;
                    ahqiVar19.b |= 65536;
                    ahqiVar19.D = j16;
                }
            }
            if ((ahqiVar.b & 131072) != 0) {
                long j17 = ahqiVar.E - ahqiVar2.E;
                if (j17 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar20 = (ahqi) ahqhVar.b;
                    ahqiVar20.b |= 131072;
                    ahqiVar20.E = j17;
                }
            }
            if ((ahqiVar.b & 262144) != 0) {
                long j18 = ahqiVar.F - ahqiVar2.F;
                if (j18 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar21 = (ahqi) ahqhVar.b;
                    ahqiVar21.b |= 262144;
                    ahqiVar21.F = j18;
                }
            }
            if ((ahqiVar.b & 524288) != 0) {
                ahqgVar3 = ahqiVar.G;
                if (ahqgVar3 == null) {
                    ahqgVar3 = ahqg.a;
                }
            } else {
                ahqgVar3 = null;
            }
            if ((ahqiVar2.b & 524288) != 0) {
                ahqgVar4 = ahqiVar2.G;
                if (ahqgVar4 == null) {
                    ahqgVar4 = ahqg.a;
                }
            } else {
                ahqgVar4 = null;
            }
            ahqg ahqgVarD2 = d(ahqgVar3, ahqgVar4);
            if (ahqgVarD2 != null) {
                if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahqhVar.y();
                }
                ahqi ahqiVar22 = (ahqi) ahqhVar.b;
                ahqiVar22.G = ahqgVarD2;
                ahqiVar22.b |= 524288;
            }
            if ((ahqiVar.b & 1048576) != 0) {
                long j19 = ahqiVar.H - ahqiVar2.H;
                if (j19 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar23 = (ahqi) ahqhVar.b;
                    ahqiVar23.b |= 1048576;
                    ahqiVar23.H = j19;
                }
            }
            if ((ahqiVar.b & 2097152) != 0) {
                ahqgVar5 = ahqiVar.I;
                if (ahqgVar5 == null) {
                    ahqgVar5 = ahqg.a;
                }
            } else {
                ahqgVar5 = null;
            }
            if ((ahqiVar2.b & 2097152) != 0) {
                ahqgVar6 = ahqiVar2.I;
                if (ahqgVar6 == null) {
                    ahqgVar6 = ahqg.a;
                }
            } else {
                ahqgVar6 = null;
            }
            ahqg ahqgVarD3 = d(ahqgVar5, ahqgVar6);
            if (ahqgVarD3 != null) {
                if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahqhVar.y();
                }
                ahqi ahqiVar24 = (ahqi) ahqhVar.b;
                ahqiVar24.I = ahqgVarD3;
                ahqiVar24.b |= 2097152;
            }
            if ((ahqiVar.b & 4194304) != 0) {
                ahqgVar7 = ahqiVar.J;
                if (ahqgVar7 == null) {
                    ahqgVar7 = ahqg.a;
                }
            } else {
                ahqgVar7 = null;
            }
            if ((ahqiVar2.b & 4194304) != 0) {
                ahqgVar8 = ahqiVar2.J;
                if (ahqgVar8 == null) {
                    ahqgVar8 = ahqg.a;
                }
            } else {
                ahqgVar8 = null;
            }
            ahqg ahqgVarD4 = d(ahqgVar7, ahqgVar8);
            if (ahqgVarD4 != null) {
                if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahqhVar.y();
                }
                ahqi ahqiVar25 = (ahqi) ahqhVar.b;
                ahqiVar25.J = ahqgVarD4;
                ahqiVar25.b |= 4194304;
            }
            if ((ahqiVar.b & 8388608) != 0) {
                ahqgVar9 = ahqiVar.K;
                if (ahqgVar9 == null) {
                    ahqgVar9 = ahqg.a;
                }
            } else {
                ahqgVar9 = null;
            }
            if ((ahqiVar2.b & 8388608) != 0) {
                ahqgVar10 = ahqiVar2.K;
                if (ahqgVar10 == null) {
                    ahqgVar10 = ahqg.a;
                }
            } else {
                ahqgVar10 = null;
            }
            ahqg ahqgVarD5 = d(ahqgVar9, ahqgVar10);
            if (ahqgVarD5 != null) {
                if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahqhVar.y();
                }
                ahqi ahqiVar26 = (ahqi) ahqhVar.b;
                ahqiVar26.K = ahqgVarD5;
                ahqiVar26.b |= 8388608;
            }
            if ((ahqiVar.b & 16777216) != 0) {
                ahqgVar11 = ahqiVar.L;
                if (ahqgVar11 == null) {
                    ahqgVar11 = ahqg.a;
                }
            } else {
                ahqgVar11 = null;
            }
            if ((ahqiVar2.b & 16777216) != 0) {
                ahqgVar12 = ahqiVar2.L;
                if (ahqgVar12 == null) {
                    ahqgVar12 = ahqg.a;
                }
            } else {
                ahqgVar12 = null;
            }
            ahqg ahqgVarD6 = d(ahqgVar11, ahqgVar12);
            if (ahqgVarD6 != null) {
                if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahqhVar.y();
                }
                ahqi ahqiVar27 = (ahqi) ahqhVar.b;
                ahqiVar27.L = ahqgVarD6;
                ahqiVar27.b |= 16777216;
            }
            if ((ahqiVar.b & 33554432) != 0) {
                ahqgVar13 = ahqiVar.M;
                if (ahqgVar13 == null) {
                    ahqgVar13 = ahqg.a;
                }
            } else {
                ahqgVar13 = null;
            }
            if ((ahqiVar2.b & 33554432) != 0) {
                ahqgVar14 = ahqiVar2.M;
                if (ahqgVar14 == null) {
                    ahqgVar14 = ahqg.a;
                }
            } else {
                ahqgVar14 = null;
            }
            ahqg ahqgVarD7 = d(ahqgVar13, ahqgVar14);
            if (ahqgVarD7 != null) {
                if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahqhVar.y();
                }
                ahqi ahqiVar28 = (ahqi) ahqhVar.b;
                ahqiVar28.M = ahqgVarD7;
                ahqiVar28.b |= 33554432;
            }
            if ((ahqiVar.b & 67108864) != 0) {
                ahqgVar15 = ahqiVar.N;
                if (ahqgVar15 == null) {
                    ahqgVar15 = ahqg.a;
                }
            } else {
                ahqgVar15 = null;
            }
            if ((ahqiVar2.b & 67108864) != 0) {
                ahqgVar16 = ahqiVar2.N;
                if (ahqgVar16 == null) {
                    ahqgVar16 = ahqg.a;
                }
            } else {
                ahqgVar16 = null;
            }
            ahqg ahqgVarD8 = d(ahqgVar15, ahqgVar16);
            if (ahqgVarD8 != null) {
                if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahqhVar.y();
                }
                ahqi ahqiVar29 = (ahqi) ahqhVar.b;
                ahqiVar29.N = ahqgVarD8;
                ahqiVar29.b |= 67108864;
            }
            if ((ahqiVar.b & 134217728) != 0) {
                ahqgVar17 = ahqiVar.O;
                if (ahqgVar17 == null) {
                    ahqgVar17 = ahqg.a;
                }
            } else {
                ahqgVar17 = null;
            }
            if ((ahqiVar2.b & 134217728) != 0) {
                ahqgVar18 = ahqiVar2.O;
                if (ahqgVar18 == null) {
                    ahqgVar18 = ahqg.a;
                }
            } else {
                ahqgVar18 = null;
            }
            ahqg ahqgVarD9 = d(ahqgVar17, ahqgVar18);
            if (ahqgVarD9 != null) {
                if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahqhVar.y();
                }
                ahqi ahqiVar30 = (ahqi) ahqhVar.b;
                ahqiVar30.O = ahqgVarD9;
                ahqiVar30.b |= 134217728;
            }
            if ((ahqiVar.b & 268435456) != 0) {
                ahqgVar19 = ahqiVar.P;
                if (ahqgVar19 == null) {
                    ahqgVar19 = ahqg.a;
                }
            } else {
                ahqgVar19 = null;
            }
            if ((ahqiVar2.b & 268435456) != 0) {
                ahqgVar20 = ahqiVar2.P;
                if (ahqgVar20 == null) {
                    ahqgVar20 = ahqg.a;
                }
            } else {
                ahqgVar20 = null;
            }
            ahqg ahqgVarD10 = d(ahqgVar19, ahqgVar20);
            if (ahqgVarD10 != null) {
                if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahqhVar.y();
                }
                ahqi ahqiVar31 = (ahqi) ahqhVar.b;
                ahqiVar31.P = ahqgVarD10;
                ahqiVar31.b |= 268435456;
            }
            if ((ahqiVar.b & 536870912) != 0) {
                ahqgVar21 = ahqiVar.Q;
                if (ahqgVar21 == null) {
                    ahqgVar21 = ahqg.a;
                }
            } else {
                ahqgVar21 = null;
            }
            if ((ahqiVar2.b & 536870912) != 0) {
                ahqgVar22 = ahqiVar2.Q;
                if (ahqgVar22 == null) {
                    ahqgVar22 = ahqg.a;
                }
            } else {
                ahqgVar22 = null;
            }
            ahqg ahqgVarD11 = d(ahqgVar21, ahqgVar22);
            if (ahqgVarD11 != null) {
                if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahqhVar.y();
                }
                ahqi ahqiVar32 = (ahqi) ahqhVar.b;
                ahqiVar32.Q = ahqgVarD11;
                ahqiVar32.b |= 536870912;
            }
            if ((ahqiVar.b & 1073741824) != 0) {
                ahqgVar23 = ahqiVar.R;
                if (ahqgVar23 == null) {
                    ahqgVar23 = ahqg.a;
                }
            } else {
                ahqgVar23 = null;
            }
            if ((ahqiVar2.b & 1073741824) != 0) {
                ahqgVar24 = ahqiVar2.R;
                if (ahqgVar24 == null) {
                    ahqgVar24 = ahqg.a;
                }
            } else {
                ahqgVar24 = null;
            }
            ahqg ahqgVarD12 = d(ahqgVar23, ahqgVar24);
            if (ahqgVarD12 != null) {
                if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahqhVar.y();
                }
                ahqi ahqiVar33 = (ahqi) ahqhVar.b;
                ahqiVar33.R = ahqgVarD12;
                ahqiVar33.b |= 1073741824;
            }
            if ((ahqiVar.b & Integer.MIN_VALUE) != 0) {
                ahqgVar25 = ahqiVar.S;
                if (ahqgVar25 == null) {
                    ahqgVar25 = ahqg.a;
                }
            } else {
                ahqgVar25 = null;
            }
            if ((ahqiVar2.b & Integer.MIN_VALUE) != 0) {
                ahqgVar26 = ahqiVar2.S;
                if (ahqgVar26 == null) {
                    ahqgVar26 = ahqg.a;
                }
            } else {
                ahqgVar26 = null;
            }
            ahqg ahqgVarD13 = d(ahqgVar25, ahqgVar26);
            if (ahqgVarD13 != null) {
                if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahqhVar.y();
                }
                ahqi ahqiVar34 = (ahqi) ahqhVar.b;
                ahqiVar34.S = ahqgVarD13;
                ahqiVar34.b |= Integer.MIN_VALUE;
            }
            if ((ahqiVar.c & 1) != 0) {
                ahqgVar27 = ahqiVar.T;
                if (ahqgVar27 == null) {
                    ahqgVar27 = ahqg.a;
                }
            } else {
                ahqgVar27 = null;
            }
            if ((ahqiVar2.c & 1) != 0) {
                ahqgVar28 = ahqiVar2.T;
                if (ahqgVar28 == null) {
                    ahqgVar28 = ahqg.a;
                }
            } else {
                ahqgVar28 = null;
            }
            ahqg ahqgVarD14 = d(ahqgVar27, ahqgVar28);
            if (ahqgVarD14 != null) {
                if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahqhVar.y();
                }
                ahqi ahqiVar35 = (ahqi) ahqhVar.b;
                ahqiVar35.T = ahqgVarD14;
                ahqiVar35.c |= 1;
            }
            if ((ahqiVar.c & 2) != 0) {
                ahqgVar29 = ahqiVar.U;
                if (ahqgVar29 == null) {
                    ahqgVar29 = ahqg.a;
                }
            } else {
                ahqgVar29 = null;
            }
            if ((ahqiVar2.c & 2) != 0) {
                ahqgVar30 = ahqiVar2.U;
                if (ahqgVar30 == null) {
                    ahqgVar30 = ahqg.a;
                }
            } else {
                ahqgVar30 = null;
            }
            ahqg ahqgVarD15 = d(ahqgVar29, ahqgVar30);
            if (ahqgVarD15 != null) {
                if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahqhVar.y();
                }
                ahqi ahqiVar36 = (ahqi) ahqhVar.b;
                ahqiVar36.U = ahqgVarD15;
                ahqiVar36.c |= 2;
            }
            if ((ahqiVar.c & 4) != 0) {
                long j20 = ahqiVar.V - ahqiVar2.V;
                if (j20 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar37 = (ahqi) ahqhVar.b;
                    ahqiVar37.c |= 4;
                    ahqiVar37.V = j20;
                }
            }
            if ((ahqiVar.c & 8) != 0) {
                long j21 = ahqiVar.W - ahqiVar2.W;
                if (j21 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar38 = (ahqi) ahqhVar.b;
                    ahqiVar38.c |= 8;
                    ahqiVar38.W = j21;
                }
            }
            if ((ahqiVar.c & 16) != 0) {
                long j22 = ahqiVar.X - ahqiVar2.X;
                if (j22 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar39 = (ahqi) ahqhVar.b;
                    ahqiVar39.c |= 16;
                    ahqiVar39.X = j22;
                }
            }
            if ((ahqiVar.c & 32) != 0) {
                long j23 = ahqiVar.Y - ahqiVar2.Y;
                if (j23 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar40 = (ahqi) ahqhVar.b;
                    ahqiVar40.c |= 32;
                    ahqiVar40.Y = j23;
                }
            }
            if ((ahqiVar.c & 64) != 0) {
                long j24 = ahqiVar.Z - ahqiVar2.Z;
                if (j24 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar41 = (ahqi) ahqhVar.b;
                    ahqiVar41.c |= 64;
                    ahqiVar41.Z = j24;
                }
            }
            if ((ahqiVar.c & 128) != 0) {
                long j25 = ahqiVar.aa - ahqiVar2.aa;
                if (j25 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar42 = (ahqi) ahqhVar.b;
                    ahqiVar42.c |= 128;
                    ahqiVar42.aa = j25;
                }
            }
            if ((ahqiVar.c & 256) != 0) {
                long j26 = ahqiVar.ab - ahqiVar2.ab;
                if (j26 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar43 = (ahqi) ahqhVar.b;
                    ahqiVar43.c |= 256;
                    ahqiVar43.ab = j26;
                }
            }
            if ((ahqiVar.c & 512) != 0) {
                long j27 = ahqiVar.ac - ahqiVar2.ac;
                if (j27 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar44 = (ahqi) ahqhVar.b;
                    ahqiVar44.c |= 512;
                    ahqiVar44.ac = j27;
                }
            }
            if ((ahqiVar.c & 1024) != 0) {
                long j28 = ahqiVar.ad - ahqiVar2.ad;
                if (j28 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar45 = (ahqi) ahqhVar.b;
                    ahqiVar45.c |= 1024;
                    ahqiVar45.ad = j28;
                }
            }
            if ((ahqiVar.c & 2048) != 0) {
                long j29 = ahqiVar.ae - ahqiVar2.ae;
                if (j29 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar46 = (ahqi) ahqhVar.b;
                    ahqiVar46.c |= 2048;
                    ahqiVar46.ae = j29;
                }
            }
            if ((ahqiVar.c & 4096) != 0) {
                long j30 = ahqiVar.af - ahqiVar2.af;
                if (j30 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar47 = (ahqi) ahqhVar.b;
                    ahqiVar47.c |= 4096;
                    ahqiVar47.af = j30;
                }
            }
            if ((ahqiVar.c & 8192) != 0) {
                long j31 = ahqiVar.ag - ahqiVar2.ag;
                if (j31 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar48 = (ahqi) ahqhVar.b;
                    ahqiVar48.c |= 8192;
                    ahqiVar48.ag = j31;
                }
            }
            if ((ahqiVar.c & 16384) != 0) {
                long j32 = ahqiVar.ah - ahqiVar2.ah;
                if (j32 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar49 = (ahqi) ahqhVar.b;
                    ahqiVar49.c |= 16384;
                    ahqiVar49.ah = j32;
                }
            }
            if ((ahqiVar.c & 32768) != 0) {
                long j33 = ahqiVar.ai - ahqiVar2.ai;
                if (j33 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar50 = (ahqi) ahqhVar.b;
                    ahqiVar50.c = 32768 | ahqiVar50.c;
                    ahqiVar50.ai = j33;
                }
            }
            if ((ahqiVar.c & 65536) != 0) {
                long j34 = ahqiVar.aj - ahqiVar2.aj;
                if (j34 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar51 = (ahqi) ahqhVar.b;
                    ahqiVar51.c |= 65536;
                    ahqiVar51.aj = j34;
                }
            }
            if ((ahqiVar.c & 131072) != 0) {
                ahqgVar31 = ahqiVar.ak;
                if (ahqgVar31 == null) {
                    ahqgVar31 = ahqg.a;
                }
            } else {
                ahqgVar31 = null;
            }
            if ((ahqiVar2.c & 131072) != 0) {
                ahqgVar32 = ahqiVar2.ak;
                if (ahqgVar32 == null) {
                    ahqgVar32 = ahqg.a;
                }
            } else {
                ahqgVar32 = null;
            }
            ahqg ahqgVarD16 = d(ahqgVar31, ahqgVar32);
            if (ahqgVarD16 != null) {
                if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahqhVar.y();
                }
                ahqi ahqiVar52 = (ahqi) ahqhVar.b;
                ahqiVar52.ak = ahqgVarD16;
                ahqiVar52.c |= 131072;
            }
            if ((ahqiVar.c & 262144) != 0) {
                long j35 = ahqiVar.al - ahqiVar2.al;
                if (j35 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar53 = (ahqi) ahqhVar.b;
                    ahqiVar53.c |= 262144;
                    ahqiVar53.al = j35;
                }
            }
            if ((ahqiVar.c & 524288) != 0) {
                long j36 = ahqiVar.am - ahqiVar2.am;
                if (j36 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar54 = (ahqi) ahqhVar.b;
                    ahqiVar54.c |= 524288;
                    ahqiVar54.am = j36;
                }
            }
            if ((ahqiVar.c & 1048576) != 0) {
                long j37 = ahqiVar.an - ahqiVar2.an;
                if (j37 != 0) {
                    if ((ahqhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahqhVar.y();
                    }
                    ahqi ahqiVar55 = (ahqi) ahqhVar.b;
                    ahqiVar55.c |= 1048576;
                    ahqiVar55.an = j37;
                }
            }
            ahqiVar = (ahqi) ahqhVar.v();
            if (k(ahqiVar)) {
                return null;
            }
        }
        return ahqiVar;
    }

    static boolean h(ahpy ahpyVar) {
        if (ahpyVar != null) {
            return ahpyVar.c.size() == 0 && ahpyVar.d.size() == 0;
        }
        return true;
    }

    static boolean i(ahqc ahqcVar) {
        if (ahqcVar != null) {
            return ahqcVar.c <= 0 && ahqcVar.d <= 0 && ahqcVar.e <= 0 && ahqcVar.f <= 0 && ahqcVar.g <= 0 && ahqcVar.h <= 0;
        }
        return true;
    }

    static boolean j(ahqe ahqeVar) {
        if (ahqeVar != null) {
            return ((long) ahqeVar.c) <= 0 && ((long) ahqeVar.d) <= 0;
        }
        return true;
    }

    static boolean k(ahqi ahqiVar) {
        if (ahqiVar != null) {
            return ahqiVar.d <= 0 && ahqiVar.e <= 0 && ahqiVar.f <= 0 && ahqiVar.g <= 0 && ahqiVar.h.size() == 0 && ahqiVar.i.size() == 0 && ahqiVar.j.size() == 0 && ahqiVar.k.size() == 0 && ahqiVar.l.size() == 0 && ahqiVar.m.size() == 0 && ahqiVar.o.size() == 0 && ahqiVar.p.size() == 0 && ahqiVar.q.size() == 0 && ahqiVar.r.size() == 0 && ahqiVar.s <= 0 && ahqiVar.t <= 0 && ahqiVar.u <= 0 && ahqiVar.v <= 0 && ahqiVar.w <= 0 && ahqiVar.x <= 0 && ahqiVar.y <= 0 && ahqiVar.z <= 0 && ahqiVar.A <= 0 && ahqiVar.B <= 0 && ahqiVar.C <= 0 && ahqiVar.D <= 0 && ahqiVar.E <= 0 && ahqiVar.F <= 0 && ahqiVar.H <= 0 && ahqiVar.V <= 0 && ahqiVar.W <= 0 && ahqiVar.X <= 0 && ahqiVar.Y <= 0 && ahqiVar.Z <= 0 && ahqiVar.aa <= 0 && ahqiVar.ab <= 0 && ahqiVar.ac <= 0 && ahqiVar.ad <= 0 && ahqiVar.ae <= 0 && ahqiVar.af <= 0 && ahqiVar.ag <= 0 && ahqiVar.ah <= 0 && ahqiVar.ai <= 0 && ahqiVar.aj <= 0 && ahqiVar.al <= 0 && ahqiVar.am <= 0 && ahqiVar.an <= 0;
        }
        return true;
    }

    private static List l(HealthStats healthStats, int i) {
        return (healthStats == null || !healthStats.hasTimers(i)) ? Collections.EMPTY_LIST : qua.a.d(healthStats.getTimers(i));
    }

    private static ahqg m(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasTimer(i)) {
            return null;
        }
        return e(null, healthStats.getTimer(i));
    }
}
