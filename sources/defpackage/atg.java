package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.health.HealthStats;
import android.provider.Settings;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class atg {
    public atg() {
    }

    static ats k(Long l, Long l2, HealthStats healthStats, cwj cwjVar, awq awqVar) {
        Object obj;
        clo cloVarO = cwt.a.o();
        long j = se.j(healthStats, 10001);
        if (j != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar = (cwt) cloVarO.b;
            cwtVar.b |= 1;
            cwtVar.d = j;
        }
        long j2 = se.j(healthStats, 10002);
        if (j2 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar2 = (cwt) cloVarO.b;
            cwtVar2.b |= 2;
            cwtVar2.e = j2;
        }
        long j3 = se.j(healthStats, 10003);
        if (j3 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar3 = (cwt) cloVarO.b;
            cwtVar3.b |= 4;
            cwtVar3.f = j3;
        }
        long j4 = se.j(healthStats, 10004);
        if (j4 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar4 = (cwt) cloVarO.b;
            cwtVar4.b |= 8;
            cwtVar4.g = j4;
        }
        cloVarO.G(se.k(healthStats, 10005));
        cloVarO.H(se.k(healthStats, 10006));
        cloVarO.I(se.k(healthStats, 10007));
        cloVarO.F(se.k(healthStats, 10008));
        cloVarO.E(se.k(healthStats, 10009));
        cloVarO.A(se.k(healthStats, 10010));
        cws cwsVarN = se.n(healthStats, 10011);
        if (cwsVarN != null) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar5 = (cwt) cloVarO.b;
            cwtVar5.n = cwsVarN;
            cwtVar5.b |= 16;
        }
        cloVarO.B(se.k(healthStats, 10012));
        cloVarO.D(ato.a.d(se.l(healthStats, 10014)));
        cloVarO.C(atn.a.d(se.l(healthStats, 10015)));
        long j5 = se.j(healthStats, 10016);
        if (j5 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar6 = (cwt) cloVarO.b;
            cwtVar6.b |= 32;
            cwtVar6.w = j5;
        }
        long j6 = se.j(healthStats, 10017);
        if (j6 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar7 = (cwt) cloVarO.b;
            cwtVar7.b |= 64;
            cwtVar7.x = j6;
        }
        long j7 = se.j(healthStats, 10018);
        if (j7 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar8 = (cwt) cloVarO.b;
            cwtVar8.b |= 128;
            cwtVar8.y = j7;
        }
        long j8 = se.j(healthStats, 10019);
        if (j8 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar9 = (cwt) cloVarO.b;
            cwtVar9.b |= 256;
            cwtVar9.z = j8;
        }
        long j9 = se.j(healthStats, 10020);
        if (j9 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar10 = (cwt) cloVarO.b;
            cwtVar10.b |= 512;
            cwtVar10.A = j9;
        }
        long j10 = se.j(healthStats, 10021);
        if (j10 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar11 = (cwt) cloVarO.b;
            cwtVar11.b |= 1024;
            cwtVar11.B = j10;
        }
        long j11 = se.j(healthStats, 10022);
        if (j11 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar12 = (cwt) cloVarO.b;
            cwtVar12.b |= 2048;
            cwtVar12.C = j11;
        }
        long j12 = se.j(healthStats, 10023);
        if (j12 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar13 = (cwt) cloVarO.b;
            cwtVar13.b |= 4096;
            cwtVar13.D = j12;
        }
        long j13 = se.j(healthStats, 10024);
        if (j13 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar14 = (cwt) cloVarO.b;
            cwtVar14.b |= 8192;
            cwtVar14.E = j13;
        }
        long j14 = se.j(healthStats, 10025);
        if (j14 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar15 = (cwt) cloVarO.b;
            cwtVar15.b |= 16384;
            cwtVar15.F = j14;
        }
        long j15 = se.j(healthStats, 10026);
        if (j15 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar16 = (cwt) cloVarO.b;
            cwtVar16.b |= 32768;
            cwtVar16.G = j15;
        }
        long j16 = se.j(healthStats, 10027);
        if (j16 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar17 = (cwt) cloVarO.b;
            cwtVar17.b |= 65536;
            cwtVar17.H = j16;
        }
        long j17 = se.j(healthStats, 10028);
        if (j17 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar18 = (cwt) cloVarO.b;
            cwtVar18.b |= 131072;
            cwtVar18.I = j17;
        }
        long j18 = se.j(healthStats, 10029);
        if (j18 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar19 = (cwt) cloVarO.b;
            cwtVar19.b |= 262144;
            cwtVar19.J = j18;
        }
        cws cwsVarN2 = se.n(healthStats, 10030);
        if (cwsVarN2 != null) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar20 = (cwt) cloVarO.b;
            cwtVar20.K = cwsVarN2;
            cwtVar20.b |= 524288;
        }
        long j19 = se.j(healthStats, 10031);
        if (j19 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar21 = (cwt) cloVarO.b;
            cwtVar21.b |= 1048576;
            cwtVar21.L = j19;
        }
        cws cwsVarN3 = se.n(healthStats, 10032);
        if (cwsVarN3 != null) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar22 = (cwt) cloVarO.b;
            cwtVar22.M = cwsVarN3;
            cwtVar22.b |= 2097152;
        }
        cws cwsVarN4 = se.n(healthStats, 10033);
        if (cwsVarN4 != null) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar23 = (cwt) cloVarO.b;
            cwtVar23.N = cwsVarN4;
            cwtVar23.b |= 4194304;
        }
        cws cwsVarN5 = se.n(healthStats, 10034);
        if (cwsVarN5 != null) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar24 = (cwt) cloVarO.b;
            cwtVar24.O = cwsVarN5;
            cwtVar24.b |= 8388608;
        }
        cws cwsVarN6 = se.n(healthStats, 10035);
        if (cwsVarN6 != null) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar25 = (cwt) cloVarO.b;
            cwtVar25.P = cwsVarN6;
            cwtVar25.b |= 16777216;
        }
        cws cwsVarN7 = se.n(healthStats, 10036);
        if (cwsVarN7 != null) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar26 = (cwt) cloVarO.b;
            cwtVar26.Q = cwsVarN7;
            cwtVar26.b |= 33554432;
        }
        cws cwsVarN8 = se.n(healthStats, 10037);
        if (cwsVarN8 != null) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar27 = (cwt) cloVarO.b;
            cwtVar27.R = cwsVarN8;
            cwtVar27.b |= 67108864;
        }
        cws cwsVarN9 = se.n(healthStats, 10038);
        if (cwsVarN9 != null) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar28 = (cwt) cloVarO.b;
            cwtVar28.S = cwsVarN9;
            cwtVar28.b |= 134217728;
        }
        cws cwsVarN10 = se.n(healthStats, 10039);
        if (cwsVarN10 != null) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar29 = (cwt) cloVarO.b;
            cwtVar29.T = cwsVarN10;
            cwtVar29.b |= 268435456;
        }
        cws cwsVarN11 = se.n(healthStats, 10040);
        if (cwsVarN11 != null) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar30 = (cwt) cloVarO.b;
            cwtVar30.U = cwsVarN11;
            cwtVar30.b |= 536870912;
        }
        cws cwsVarN12 = se.n(healthStats, 10041);
        if (cwsVarN12 != null) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar31 = (cwt) cloVarO.b;
            cwtVar31.V = cwsVarN12;
            cwtVar31.b |= 1073741824;
        }
        cws cwsVarN13 = se.n(healthStats, 10042);
        if (cwsVarN13 != null) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar32 = (cwt) cloVarO.b;
            cwtVar32.W = cwsVarN13;
            cwtVar32.b |= Integer.MIN_VALUE;
        }
        cws cwsVarN14 = se.n(healthStats, 10043);
        if (cwsVarN14 != null) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar33 = (cwt) cloVarO.b;
            cwtVar33.X = cwsVarN14;
            cwtVar33.c |= 1;
        }
        cws cwsVarN15 = se.n(healthStats, 10044);
        if (cwsVarN15 != null) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar34 = (cwt) cloVarO.b;
            cwtVar34.Y = cwsVarN15;
            cwtVar34.c |= 2;
        }
        long j20 = se.j(healthStats, 10045);
        if (j20 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar35 = (cwt) cloVarO.b;
            cwtVar35.c |= 4;
            cwtVar35.Z = j20;
        }
        long j21 = se.j(healthStats, 10046);
        if (j21 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar36 = (cwt) cloVarO.b;
            cwtVar36.c |= 8;
            cwtVar36.aa = j21;
        }
        long j22 = se.j(healthStats, 10047);
        if (j22 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar37 = (cwt) cloVarO.b;
            cwtVar37.c |= 16;
            cwtVar37.ab = j22;
        }
        long j23 = se.j(healthStats, 10048);
        if (j23 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar38 = (cwt) cloVarO.b;
            cwtVar38.c |= 32;
            cwtVar38.ac = j23;
        }
        long j24 = se.j(healthStats, 10049);
        if (j24 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar39 = (cwt) cloVarO.b;
            cwtVar39.c |= 64;
            cwtVar39.ad = j24;
        }
        long j25 = se.j(healthStats, 10050);
        if (j25 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar40 = (cwt) cloVarO.b;
            cwtVar40.c |= 128;
            cwtVar40.ae = j25;
        }
        long j26 = se.j(healthStats, 10051);
        if (j26 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar41 = (cwt) cloVarO.b;
            cwtVar41.c |= 256;
            cwtVar41.af = j26;
        }
        long j27 = se.j(healthStats, 10052);
        if (j27 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar42 = (cwt) cloVarO.b;
            cwtVar42.c |= 512;
            cwtVar42.ag = j27;
        }
        long j28 = se.j(healthStats, 10053);
        if (j28 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar43 = (cwt) cloVarO.b;
            cwtVar43.c |= 1024;
            cwtVar43.ah = j28;
        }
        long j29 = se.j(healthStats, 10054);
        if (j29 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar44 = (cwt) cloVarO.b;
            cwtVar44.c |= 2048;
            cwtVar44.ai = j29;
        }
        long j30 = se.j(healthStats, 10055);
        if (j30 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar45 = (cwt) cloVarO.b;
            cwtVar45.c |= 4096;
            cwtVar45.aj = j30;
        }
        long j31 = se.j(healthStats, 10056);
        if (j31 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar46 = (cwt) cloVarO.b;
            cwtVar46.c |= 8192;
            cwtVar46.ak = j31;
        }
        long j32 = se.j(healthStats, 10057);
        if (j32 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar47 = (cwt) cloVarO.b;
            cwtVar47.c |= 16384;
            cwtVar47.al = j32;
        }
        long j33 = se.j(healthStats, 10058);
        if (j33 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar48 = (cwt) cloVarO.b;
            cwtVar48.c |= 32768;
            cwtVar48.am = j33;
        }
        long j34 = se.j(healthStats, 10059);
        if (j34 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar49 = (cwt) cloVarO.b;
            cwtVar49.c = 65536 | cwtVar49.c;
            cwtVar49.an = j34;
        }
        cws cwsVarN16 = se.n(healthStats, 10061);
        if (cwsVarN16 != null) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar50 = (cwt) cloVarO.b;
            cwtVar50.ao = cwsVarN16;
            cwtVar50.c |= 131072;
        }
        long j35 = se.j(healthStats, 10062);
        if (j35 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar51 = (cwt) cloVarO.b;
            cwtVar51.c |= 262144;
            cwtVar51.ap = j35;
        }
        long j36 = se.j(healthStats, 10063);
        if (j36 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar52 = (cwt) cloVarO.b;
            cwtVar52.c = 524288 | cwtVar52.c;
            cwtVar52.aq = j36;
        }
        long j37 = se.j(healthStats, 10064);
        if (j37 != 0) {
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwt cwtVar53 = (cwt) cloVarO.b;
            cwtVar53.c |= 1048576;
            cwtVar53.ar = j37;
        }
        cwt cwtVar54 = (cwt) cloVarO.i();
        clo cloVar = (clo) cwtVar54.a(5, null);
        cloVar.n(cwtVar54);
        DesugarCollections.unmodifiableList(((cwt) cloVar.b).h);
        int i = 0;
        while (true) {
            Object obj2 = awqVar.c;
            int size = ((cwt) cloVar.b).h.size();
            obj = ((awy) obj2).a;
            if (i >= size) {
                break;
            }
            cloVar.N(i, ((atl) obj).b(atk.WAKELOCK, cloVar.x(i)));
            i++;
        }
        DesugarCollections.unmodifiableList(((cwt) cloVar.b).i);
        for (int i2 = 0; i2 < ((cwt) cloVar.b).i.size(); i2++) {
            cloVar.O(i2, ((atl) obj).b(atk.WAKELOCK, cloVar.y(i2)));
        }
        DesugarCollections.unmodifiableList(((cwt) cloVar.b).j);
        for (int i3 = 0; i3 < ((cwt) cloVar.b).j.size(); i3++) {
            cloVar.P(i3, ((atl) obj).b(atk.WAKELOCK, cloVar.z(i3)));
        }
        DesugarCollections.unmodifiableList(((cwt) cloVar.b).k);
        for (int i4 = 0; i4 < ((cwt) cloVar.b).k.size(); i4++) {
            cloVar.M(i4, ((atl) obj).b(atk.WAKELOCK, cloVar.w(i4)));
        }
        DesugarCollections.unmodifiableList(((cwt) cloVar.b).l);
        for (int i5 = 0; i5 < ((cwt) cloVar.b).l.size(); i5++) {
            cloVar.L(i5, ((atl) obj).b(atk.SYNC, cloVar.v(i5)));
        }
        DesugarCollections.unmodifiableList(((cwt) cloVar.b).m);
        for (int i6 = 0; i6 < ((cwt) cloVar.b).m.size(); i6++) {
            cloVar.J(i6, ((atl) obj).b(atk.JOB, cloVar.t(i6)));
        }
        DesugarCollections.unmodifiableList(((cwt) cloVar.b).o);
        for (int i7 = 0; i7 < ((cwt) cloVar.b).o.size(); i7++) {
            cloVar.K(i7, ((atl) obj).b(atk.SENSOR, cloVar.u(i7)));
        }
        return new ats((cwt) cloVar.i(), l, l2, 765075321L, Long.valueOf(awqVar.b != null ? ((String) r1).hashCode() : 0L), cwjVar, null, null, null);
    }

    public static boolean l(String[] strArr, String[] strArr2) {
        if (strArr != null) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (str2.equals(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean m(Context context, String[] strArr) {
        return l(context.getPackageManager().getPackagesForUid(Binder.getCallingUid()), strArr);
    }

    public static String n(Context context) {
        ComponentName componentNameUnflattenFromString;
        String string = Settings.Secure.getString(context.getContentResolver(), "assistant");
        if (TextUtils.isEmpty(string) || (componentNameUnflattenFromString = ComponentName.unflattenFromString(string)) == null) {
            return null;
        }
        return componentNameUnflattenFromString.getPackageName();
    }

    public static boolean o(Context context) {
        if (Settings.Secure.getInt(context.getContentResolver(), "user_setup_complete", 0) != 0) {
            return Build.VERSION.SDK_INT < 26 || Settings.Secure.getInt(context.getContentResolver(), "tv_user_setup_complete", 0) != 0;
        }
        return false;
    }

    public static byte[] p(ByteBuffer byteBuffer) {
        return Arrays.copyOf(byteBuffer.array(), byteBuffer.position());
    }

    public /* synthetic */ atg(byte[] bArr) {
    }
}
